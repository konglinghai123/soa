package opensoa.sca.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import opensoa.sca.JBPMHelper;
import opensoa.sca.ListInstanceTasks;
import opensoa.sca.vo.xsd.ProcessVarsType;
import opensoa.sca.vo.xsd.TaskVO;
import opensoa.sca.vo.xsd.TasksType;
import opensoa.sca.vo.xsd.XsdFactory;
import opensoa.sca.vo.xsd.comment;
import opensoa.sca.vo.xsd.comments;
import opensoa.sca.vo.xsd.poolActors;
import opensoa.sca.vo.xsd.statuses;
import opensoa.sca.vo.xsd.transition;
import opensoa.sca.vo.xsd.transitions;
import opensoa.sca.vo.xsd.var;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.Transition;
import org.jbpm.graph.exe.Comment;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.PooledActor;
import org.jbpm.taskmgmt.exe.TaskInstance;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import commonj.sdo.helper.HelperContext;

@Service(ListInstanceTasks.class)
public class ListInstanceTasksImpl implements ListInstanceTasks {

	private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z");

	@Reference
	protected JBPMHelper jbpmContextHelper;

	private final static String OPEN = "OPEN";
	private final static String ALL = "ALL";
	private final static String SUSPENDED = "SUSPENDED";
	private final static String ENDED = "ENDED";
	private final static String SIGNALING = "SIGNALING";

	public TasksType listInstanceTasks(long id, String filter) {

		XsdFactory factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		ProcessInstance instance = jbpmContext.getGraphSession().getProcessInstance(id);
		TasksType tasks = (TasksType) factory.createTasksType();
		List<TaskInstance> taskList = new ArrayList<TaskInstance>(instance.getTaskMgmtInstance().getTaskInstances());

		for (TaskInstance taskInst : taskList) {
			TaskVO task = (TaskVO) factory.createTaskVO();
			task.setId(taskInst.getId());
			task.setName(taskInst.getName());
			task.setDescription(taskInst.getDescription());
			
			comments comments = (comments) factory.createcomments();
			List<Comment> jComments = taskInst.getComments();
			for (Comment jcomment : jComments) {
				comment comment = factory.createcomment();
				comment.setActorId(jcomment.getActorId());
				comment.setMessage(jcomment.getMessage());
				comment.setTime(FORMAT.format(jcomment.getTime()));
				comments.getComment().add(comment);
			}
			task.setComments(comments);
			
			if (taskInst.getCreate() != null)
				task.setCreated(FORMAT.format(taskInst.getCreate()));
			
			if (taskInst.getDueDate() != null)
				task.setDueDate(FORMAT.format(taskInst.getDueDate()));
			
			if (taskInst.getEnd() != null)
				task.setEnd(FORMAT.format(taskInst.getEnd()));
			
			task.setPriority(taskInst.getPriority());
			
			if (taskInst.getStart() != null)
				task.setStart(FORMAT.format(taskInst.getStart()));
			task.setActorId(taskInst.getActorId());

			Set<PooledActor> pooledActors = taskInst.getPooledActors();
			poolActors jpactors = factory.createpoolActors();
			for (PooledActor actor : pooledActors) {
				jpactors.getActorId().add(actor.getActorId());
			}
			task.setPoolActors(jpactors);
			
			statuses statuses = factory.createstatuses();
			statuses.setHasEnded(taskInst.hasEnded());
			statuses.setIsBlocking(taskInst.isBlocking());
			statuses.setIsCancelled(taskInst.isCancelled());
			statuses.setIsLast(taskInst.isLast());
			statuses.setIsOpen(taskInst.isOpen());
			statuses.setIsSignaling(taskInst.isSignalling());
			statuses.setIsSuspended(taskInst.isSuspended());
			statuses.setIsStartInstance(taskInst.isStartTaskInstance());
			
			task.setStatuses(statuses);
			
			ProcessVarsType processVars = factory.createProcessVarsType();
			Map<String,Object> variableMap = taskInst.getVariables();
			 // Iterate over the keys in the map
			if (variableMap != null) {
			    for (String key : variableMap.keySet()) {
			    	var pvar = factory.createvar();
			        pvar.setName(key);
			        pvar.setValue((String) variableMap.get(key));
			        processVars.getVar().add(pvar);
			    }
			    task.setTokenVariables(processVars);
			}
			
			List<Transition> transitions = taskInst.getAvailableTransitions();
	
			transitions returnTransitions = factory.createtransitions();
			for (Transition transition : transitions) {
				transition returnTransition = factory.createtransition();
				returnTransition.setCondition(transition.getCondition());
				returnTransition.setTo(transition.getTo().getName());
				returnTransition.setName(transition.getName());
				returnTransitions.getTransition().add(returnTransition);
			}
			task.setTransitions(returnTransitions);
			
			
			if (filter.equals(ALL)) 
				tasks.getTask().add(task);
			else if (filter.equals(OPEN) && taskInst.isOpen())
				tasks.getTask().add(task);
			else if (filter.equals(ENDED) && taskInst.hasEnded())
				tasks.getTask().add(task);
			else if (filter.equals(SUSPENDED) && taskInst.isSuspended())
				tasks.getTask().add(task);
			else if (filter.equals(SIGNALING) && taskInst.isSignalling())
				tasks.getTask().add(task);
		}

		jbpmContext.close();
		return tasks;
	}

}

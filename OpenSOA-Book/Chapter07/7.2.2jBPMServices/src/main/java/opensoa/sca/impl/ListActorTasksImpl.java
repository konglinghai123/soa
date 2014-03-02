package opensoa.sca.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

import opensoa.sca.JBPMHelper;
import opensoa.sca.ListActorTasks;
import opensoa.sca.vo.xsd.ActorTasksType;
import opensoa.sca.vo.xsd.ProcessVarsType;
import opensoa.sca.vo.xsd.TaskVO;
import opensoa.sca.vo.xsd.XsdFactory;
import opensoa.sca.vo.xsd.comment;
import opensoa.sca.vo.xsd.comments;
import opensoa.sca.vo.xsd.poolActors;
import opensoa.sca.vo.xsd.process;
import opensoa.sca.vo.xsd.statuses;
import opensoa.sca.vo.xsd.transition;
import opensoa.sca.vo.xsd.transitions;
import opensoa.sca.vo.xsd.var;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.Transition;
import org.jbpm.graph.exe.Comment;
import org.jbpm.taskmgmt.exe.PooledActor;
import org.jbpm.taskmgmt.exe.TaskInstance;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

import commonj.sdo.helper.HelperContext;

@Service(ListActorTasks.class)
public class ListActorTasksImpl implements ListActorTasks {

	private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z");

	@Reference
	protected JBPMHelper jbpmContextHelper;

	XsdFactory factory;
	private final static String ALL = "ALL";
	private final static String POOLED = "POOLED";
	private final static String ASSIGNED = "ASSIGNED";

	public ActorTasksType listActorTasks(String actorId, String filter) {

		factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		
		ActorTasksType actorTasks = factory.createActorTasksType();
		List<TaskInstance> taskList;
		
		// Step 1 -- Determine pooled tasks
		if (filter.equals(POOLED) || filter.equals(ALL)) {
			taskList = jbpmContext.getTaskMgmtSession().findPooledTaskInstances(actorId);
			populateTasks(taskList, actorTasks, "pooled");
		}
		
		// Step 2 -- Determine assigned tasks
		if (filter.equals(ASSIGNED) || filter.equals(ALL)) {
			taskList = jbpmContext.getTaskMgmtSession().findTaskInstances(actorId);
			populateTasks(taskList, actorTasks, "assigned");
		}
		
		jbpmContext.close();
		
		return actorTasks;

	}
	
	private void populateTasks(List<TaskInstance> taskList, ActorTasksType actorTasks, String cat) {
		
		for (TaskInstance taskInst : taskList) {
			TaskVO task = (TaskVO) factory.createTaskVO();
			process proc = factory.createprocess();
			
			proc.setName(taskInst.getProcessInstance().getProcessDefinition().getName());
			proc.setInstanceId(taskInst.getProcessInstance().getId());
			task.setProcess(proc);
			
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
			
			List <Transition> transitions = taskInst.getAvailableTransitions();
			
			transitions returnTransitions = factory.createtransitions();
			for (Transition transition : transitions) {
				transition returnTransition = factory.createtransition();
				returnTransition.setCondition(transition.getCondition());
				returnTransition.setTo(transition.getTo().getName());
				returnTransition.setName(transition.getName());
				returnTransitions.getTransition().add(returnTransition);
			}
			task.setTransitions(returnTransitions);
			
			if (cat.equals("pooled"))
				actorTasks.getPooled().add(task);
			else 
				actorTasks.getAssigned().add(task);

		}
	}

}

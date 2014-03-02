package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.def.Transition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.taskmgmt.exe.TaskInstance;
import org.jbpm.taskmgmt.exe.TaskMgmtInstance;

public class JBPMHelper {

  public final static String RUNNING = "RUNNING";
  public final static String SUSPENDED = "SUSPENDED";
  public final static String ENDED = "ENDED";

  // task specific statuses
  public final static String CANCELLED = "CANCELLED";
  public final static String OPEN = "OPEN";

  public static List<ProcessDefinition> listProcesses(JbpmContext jbpmContext) {

    // return a list of all processes
    List<ProcessDefinition> processDefinitionList = jbpmContext
        .getGraphSession().findAllProcessDefinitions();

    return processDefinitionList;
  }

  public static List<ProcessInstance> listProcessInstances(JbpmContext jbpmContext, long processId,
      String filter) {

    StringBuffer queryText = new StringBuffer("select pi"
        + " from org.jbpm.graph.exe.ProcessInstance as pi ");

    if (processId != 0)
      queryText.append(" where pi.processDefinition = "
          + String.valueOf(processId));

    if (filter.equalsIgnoreCase(ENDED)) {
      queryText.append(" and pi.end != null");
    }
    if (filter.equalsIgnoreCase(RUNNING)) {
      queryText.append(" and pi.end = null");
    }
    if (filter.equalsIgnoreCase(SUSPENDED)) {
      queryText.append(" and pi.isSuspended = true");
    }

    queryText.append(" order by pi.start desc");

    Query query = jbpmContext.getSession().createQuery(queryText.toString());
    List<ProcessInstance> processInstanceList = (List<ProcessInstance>) query
        .list();

    return processInstanceList;
  }

  public static List<TaskInstance> listTasksForProcessInstance(JbpmContext jbpmContext,
      long processInstanceId, String filter) {

    StringBuffer queryText = new StringBuffer("select ti"
        + " from org.jbpm.taskmgmt.exe.TaskInstance as ti ");

    if (processInstanceId != 0)
      queryText.append(" where ti.processInstance = "
          + String.valueOf(processInstanceId));

    if (filter.equalsIgnoreCase(ENDED)) {
      queryText.append(" and ti.isOpen = false");
    }
    if (filter.equalsIgnoreCase(SUSPENDED)) {
      queryText.append(" and ti.isSuspended = true");
    }
    if (filter.equalsIgnoreCase(CANCELLED)) {
      queryText.append(" and ti.isCancelled = true");
    }
    if (filter.equalsIgnoreCase(OPEN)) {
      queryText.append(" and ti.isOpen = true");
    }

    queryText.append(" order by ti.priority asc");
    Query query = jbpmContext.getSession().createQuery(queryText.toString());
    List<TaskInstance> taskInstanceList = (List<TaskInstance>) query.list();
    //ProcessInstance instance = jbpmContext.getGraphSession().getProcessInstance(processInstanceId);

    //List<TaskInstance> taskList = new ArrayList<TaskInstance>(instance.getTaskMgmtInstance().getTaskInstances());
    return taskInstanceList;
  }

  // Returns a list of tasks assigned to a given user
  public static List<TaskInstance> listAssignedActorTasks(JbpmContext jbpmContext, String actorId) {
    List<TaskInstance> taskList = jbpmContext.getTaskMgmtSession()
        .findTaskInstances(actorId);
    return taskList;
  }

  // Returns a list of pooled tasks assigned to a user
  public static List<TaskInstance> listPooledActorTasks(JbpmContext jbpmContext, String actorId) {
    List<TaskInstance> taskList = jbpmContext.getTaskMgmtSession()
        .findPooledTaskInstances(actorId);
    return taskList;
  }

  // Returns a list of transitions for a given task
  public static List<Transition> listTransitionsForTasks(JbpmContext jbpmContext, long taskInstanceId) {
    TaskInstance taskInstance = jbpmContext.getTaskMgmtSession().getTaskInstance(taskInstanceId);
    List<Transition> transitions = taskInstance.getAvailableTransitions();
    return transitions;
  }
  
  // Returns a list of unfinished tasks by instance.
  public static List<TaskInstance> listUnfinishedTasksByInstance(JbpmContext jbpmContext, long processId) {

    TaskMgmtInstance taskMgmtInstance = (TaskMgmtInstance) jbpmContext
        .getProcessInstance(processId).getInstance(TaskMgmtInstance.class);
    List<Token> tokens = jbpmContext.getProcessInstance(processId)
        .findAllTokens();
    List<TaskInstance> returnInstances = new ArrayList<TaskInstance>();

    // iterate through all tokens in the process instance
    for (Token token : tokens) {
      List<TaskInstance> instances = (List<TaskInstance>) taskMgmtInstance
          .getUnfinishedTasks(token);
      // iterate through the individual token tasks
      for (TaskInstance ti : instances)
        returnInstances.add(ti);
    }
    return returnInstances;
  }
  
  // Returns a jBPMconfiguration based on hibernate.properties settings
  public static JbpmConfiguration getConfiguration() {
    return JbpmConfiguration.getInstance();
  }

}

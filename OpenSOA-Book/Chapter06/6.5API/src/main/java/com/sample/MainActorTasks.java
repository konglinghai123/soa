package com.sample;

import java.util.List;
import com.sample.JBPMHelper;
import org.jbpm.JbpmContext;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class MainActorTasks {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Syntax is: MainProcessInstances <actorId>");
      System.exit(1);
    }
    
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    // first, let's identify any assigned tasks to the actor
    List<TaskInstance> taskInstances = JBPMHelper.listAssignedActorTasks(jbpmContext, args[0]);

    System.out.println("*** ASSIGNED TASKS ***");
    for (TaskInstance taskInstance : taskInstances) {
      System.out.println("ProcessId: " + taskInstance.getProcessInstance().getId() +
        " Process Name: " + taskInstance.getProcessInstance().getProcessDefinition().getName() +
        " Task Name: " + taskInstance.getName());
    }
    
    // second, let's identify pooled tasks assigned to the user
    taskInstances = JBPMHelper.listPooledActorTasks(jbpmContext, args[0]);

    System.out.println("*** POOLED TASKS ***");
    for (TaskInstance taskInstance : taskInstances) {
      System.out.println("ProcessId: " + taskInstance.getProcessInstance().getId() +
        " Process Name: " + taskInstance.getProcessInstance().getProcessDefinition().getName() +
        " Task Name: " + taskInstance.getName());
 
    }
    jbpmContext.close();
  }
}

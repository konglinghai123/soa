package com.sample;

import java.text.SimpleDateFormat;
import java.util.List;

import com.sample.JBPMHelper;

import org.jbpm.JbpmContext;
import org.jbpm.graph.def.Transition;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class MainProcessInstanceTasks {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Syntax is: MainProcessInstances <process instance id>");
      System.exit(1);
    }
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    // first, let's identify any assigned tasks to the actor
    List<TaskInstance> taskInstances = JBPMHelper.listUnfinishedTasksByInstance(jbpmContext, Integer.parseInt(args[0]));
    
    for (TaskInstance taskInstance : taskInstances) {
      System.out.println(">> Task: " + taskInstance.getId()
          + " Created: " + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(taskInstance.getCreate())
          + " Task Name: " + taskInstance.getName());
     
      List<Transition> transitions = JBPMHelper.listTransitionsForTasks(jbpmContext, taskInstance.getId());
      for (Transition transition : transitions) {
        System.out.println("   >> Transition: " + transition.getName() + " Id: " + transition.getId());
        
        // Uncomment out the bottom to illustrate processing task
        //taskInstance.start();
        //taskInstance.end(transition);
      }
    }
    jbpmContext.close();
  }
 
}

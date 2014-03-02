package com.sample;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import com.sample.JBPMHelper;

import org.jbpm.JbpmContext;
import org.jbpm.taskmgmt.exe.PooledActor;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class MainTaskInstances {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("Syntax is: MainProcessInstances <processInstanceId> <one of OPEN | ENDED | SUSPENDED |CANCELLED >");
      System.exit(1);
    }
    
    // retrieve a jBPM Context from the helper
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    List<TaskInstance> taskInstances;

    // retrieve all process instances
    taskInstances = JBPMHelper.listTasksForProcessInstance(jbpmContext, Integer.parseInt(args[0]), args[1]);
    
    if (taskInstances != null) {
      for (TaskInstance taskInstance : taskInstances) {
        System.out.println(">> Task: " + taskInstance.getId()
            + " Created: " + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(taskInstance.getCreate())
            + " Task Name: " + taskInstance.getName());
        
        // print out actor currently assigned to the task
        System.out.println("    >> assigned actor is: " + taskInstance.getActorId());
        Set<PooledActor> pooledActors = taskInstance.getPooledActors();

        // print out list of pooled actors
        for (PooledActor actor : pooledActors) {
            System.out.println("    >> pooled actor is: " + actor.getActorId());
        }
      }
    }
    jbpmContext.close();
  }
}

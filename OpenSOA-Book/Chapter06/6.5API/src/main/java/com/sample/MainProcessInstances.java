package com.sample;

import java.text.SimpleDateFormat;
import java.util.List;
import com.sample.JBPMHelper;

import org.jbpm.JbpmContext;
import org.jbpm.graph.exe.ProcessInstance;

public class MainProcessInstances {

  public static void main(String[] args) {

    // retrieve a jBPM Context from the helper
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    if (args.length != 2) {
      System.out.println("Syntax is: MainProcessInstances <processId> <one of RUNNING | ENDED | SUSPENDED>");
      System.exit(1);
    }

    // retrieve all process instances
    List<ProcessInstance> processInstanceList = JBPMHelper.listProcessInstances(jbpmContext, Integer.parseInt(args[0]), args[1]);
    if (processInstanceList != null) {
      for (ProcessInstance instance : processInstanceList) {
        System.out.println("  >> Instance: "
            + instance.getId()
            + " Started:"
            + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(instance
                .getStart()));
      }
    }
    jbpmContext.close();
  }
}

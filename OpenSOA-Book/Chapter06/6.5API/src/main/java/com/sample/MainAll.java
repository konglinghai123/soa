package com.sample;

import java.text.SimpleDateFormat;
import java.util.List;
import com.sample.JBPMHelper;

import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class MainAll {

  public static void main(String[] args) {

    // retrieve a jBPM Context from the helper
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    // retrieve all process definitions
    List<ProcessDefinition> processDefinitionList = JBPMHelper.listProcesses(jbpmContext);
    for (ProcessDefinition process : processDefinitionList) {
      System.out.println("ProcessId: " + process.getId() + " ProcessName: "
          + process.getName() + " Version: " + process.getVersion());

      // fetch the running process instances
      List<ProcessInstance> processInstanceList = JBPMHelper.listProcessInstances(jbpmContext, process.getId(),
          JBPMHelper.RUNNING);
      printInstanceDetails(processInstanceList);
    }
    jbpmContext.close();

  }

  private static void printInstanceDetails(
      List<ProcessInstance> processInstanceList) {
    if (processInstanceList != null) {
      for (ProcessInstance instance : processInstanceList) {
        System.out.println("  >> Instance: "
            + instance.getId()
            + " Started:"
            + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(instance
                .getStart()));
      }
    }
  }
}

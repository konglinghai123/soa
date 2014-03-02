package com.sample;
import java.util.List;
import com.sample.JBPMHelper;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;

public class MainProcessDefinitions {

  public static void main(String[] args) {

    // retrieve a jBPM Context from the helper
    JbpmContext jbpmContext = JBPMHelper.getConfiguration().createJbpmContext();
    
    // retrieve all process definitions
    List<ProcessDefinition> processDefinitionList = JBPMHelper.listProcesses(jbpmContext);
    for (ProcessDefinition process : processDefinitionList) {
      System.out.println("ProcessId: " + process.getId() + " ProcessName: "
          + process.getName() + " Version: " + process.getVersion());

    }
    // always close the context when you are done with it
    jbpmContext.close();
  }
}

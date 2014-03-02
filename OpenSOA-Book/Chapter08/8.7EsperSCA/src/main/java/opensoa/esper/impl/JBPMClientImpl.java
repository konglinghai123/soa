package opensoa.esper.impl;

import opensoa.esper.JBPMClient;
import opensoa.esper.jbpm.event.ProcessEvent;

import org.osoa.sca.annotations.Reference;

public class JBPMClientImpl implements JBPMClient {
  
  @Reference
  public JBPMClient jBPMClient;

  public void sendProcessStartEndEvent(ProcessEvent event) {
    jBPMClient.sendProcessStartEndEvent(event);
  }
  
}

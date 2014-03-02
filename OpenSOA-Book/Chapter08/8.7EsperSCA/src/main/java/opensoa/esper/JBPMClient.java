package opensoa.esper;

import org.osoa.sca.annotations.Remotable;

import opensoa.esper.jbpm.event.ProcessEvent;

@Remotable
public interface JBPMClient {
    public void sendProcessStartEndEvent(ProcessEvent event);
}

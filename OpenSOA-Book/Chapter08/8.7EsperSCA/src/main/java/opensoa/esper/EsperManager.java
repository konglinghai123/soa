package opensoa.esper;

import opensoa.esper.jbpm.event.ProcessEvent;
import org.osoa.sca.annotations.Remotable;

@Remotable
public interface EsperManager {
  public void sendProcessStartEndEvent(ProcessEvent event);
}

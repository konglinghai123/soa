package opensoa.esper.impl;

import java.util.HashMap;
import opensoa.esper.*;
import opensoa.esper.jbpm.event.*;
import opensoa.esper.jbpm.event.Property;

import org.osoa.sca.annotations.*;

@Service(EsperManager.class)
public class EsperManagerImpl implements EsperManager {
  
  @Reference
  protected SessionManager sessionManager;
  
  public void sendProcessStartEndEvent(ProcessEvent event) {

    HashMap<String, String> properties = new HashMap<String, String>();
        
    Property props[] = event.getProps();
    
    for (int i = 0; i< props.length; i++) {
      properties.put(props[i].getKey(), props[i].getValue());
    }

    event.setProperties(properties);
    
    sessionManager.getEPSession().getEPRuntime().sendEvent(event);
  }  
}

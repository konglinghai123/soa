import java.util.HashMap;

import opensoa.esper.StatementManager;
import opensoa.esper.impl.StatementManagerImpl;
import opensoa.esper.jbpm.Constants;
import opensoa.esper.jbpm.event.ProcessEvent;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;

import junit.framework.TestCase;

public class EsperTest extends TestCase {
  private EPServiceProvider epService;
  private StatementManager statementMgr;

  public void setUp() {
    statementMgr = new StatementManagerImpl();

    Configuration configuration = new Configuration();
    configuration.addEventType("ProcessEvent", ProcessEvent.class
        .getName());
    configuration.addEventType("Constants", Constants.class.getName());

    epService = EPServiceProviderManager
        .getProvider("EsperTest", configuration);

    statementMgr.initializeStatements();
    statementMgr.register(epService);

  }

  public void testBasic() {
    publishEvent("SalesOrder", (long) 1.0, 1, 2,  "125.00");
    publishEvent("SalesOrder", (long) 1.0, 2, 2, "1200.00");
    publishEvent("SalesOrder", (long) 1.0, 3, 2,   "50.00");
    publishEvent("SalesOrder", (long) 1.0, 3, 2,   "73.00");
    publishEvent("SalesOrder", (long) 1.0, 4, 2,  "250.00");
    publishEvent("SalesOrder", (long) 1.0, 5, 2,   "12.00");
    
    assertEquals("Total events 6", epService.getEPRuntime().getNumEventsEvaluated(), 6);    
  }
    
    private void publishEvent(String processName, long processVersion,
      long processInstanceId, int state, String price) {
      
      HashMap<String, String> properties = new HashMap<String, String>();
      properties.put("totalPrice",price);
      
      epService.getEPRuntime().sendEvent(
          new ProcessEvent(processName, processVersion, processInstanceId, state, properties));      
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
}

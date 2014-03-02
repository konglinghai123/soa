import java.util.HashMap;

import opensoa8_62.esper.jbpm.event.ProcessEvent;
import opensoa8_62.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest862 extends TestCase {
  private EPServiceProvider epService;
  private ProcessStartEnd statements = new ProcessStartEnd();

  public void setUp() {
    Configuration config = new Configuration();
    config.addEventType("ProcessEvent", ProcessEvent.class.getName());
    epService = EPServiceProviderManager.getProvider("EsperTest", config);
    statements.register(epService);
  }

  public void testBasic() {
    // start process instance events
    publishEvent("SalesOrder", (long) 1.0, 7, 1,  225.10, 102);
    publishEvent("SalesOrder", (long) 1.0, 1, 1,  125.12, 100);
    publishEvent("SalesOrder", (long) 1.0, 3, 1,   50.45, 101);
    publishEvent("SalesOrder", (long) 1.0, 2, 1, 1200.87, 101);
    publishEvent("SalesOrder", (long) 1.0, 4, 1,   73.34, 100);
    publishEvent("SalesOrder", (long) 1.0, 5, 1,  250.23, 103);
    publishEvent("SalesOrder", (long) 1.0, 6, 1,   12.05, 105);
    
    // end process instance events
    publishEvent("SalesOrder", (long) 1.0, 1, 2,  125.12, 100);
    publishEvent("SalesOrder", (long) 1.0, 3, 2,   50.45, 101);
    publishEvent("SalesOrder", (long) 1.0, 2, 2, 1200.87, 101);
    publishEvent("SalesOrder", (long) 1.0, 4, 2,   73.34, 100);
    publishEvent("SalesOrder", (long) 1.0, 5, 2,  250.23, 103);
    publishEvent("SalesOrder", (long) 1.0, 6, 2,   12.05, 105);
    
    assertEquals(
    		"Total events 13", 
    		13,
    		epService.getEPRuntime().getNumEventsEvaluated());    
    
    assertEquals(
    		"Pattern count should be 6",
    		6,
    		statements.getPatternCnt());
    
    assertEquals(
    		"Interval should be 100",
    		Integer.valueOf("100"),
    		statements.getInterval());
  }
    
    private void publishEvent(String processName, long processVersion,
      long processInstanceId, int state, double price, int custId) {
      
      HashMap<String, Object> properties = new HashMap<String, Object>();
      properties.put("totalPrice", new Double(price));
      properties.put("custId", custId);
      epService.getEPRuntime().sendEvent(
          new ProcessEvent(processName, processVersion, processInstanceId, state, properties));      
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
}

import java.util.HashMap;

import opensoa8_61.esper.jbpm.event.ProcessEvent;
import opensoa8_61.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest861 extends TestCase {
  private EPServiceProvider epService;
  ProcessStartEnd statements = new ProcessStartEnd();

  public void setUp() {
    
    Configuration configuration = new Configuration();
    configuration.addEventType("ProcessEvent", opensoa8_61.esper.jbpm.event.ProcessEvent.class.getName());
    configuration.addImport("opensoa8_61.esper.jbpm.functions.*");
    configuration.addImport("java.lang.Math");
    epService = EPServiceProviderManager.getProvider("EsperTest", configuration);
    statements.register(epService);

  }

  public void testBasic() {
    publishEvent("SalesOrder", (long) 1.0, 1, 2,  125.12, 100);
    publishEvent("SalesOrder", (long) 1.0, 3, 2,   50.45, 101);
    publishEvent("SalesOrder", (long) 1.0, 2, 2, 1200.87, 101);
    publishEvent("SalesOrder", (long) 1.0, 4, 2,   73.34, 100);
    publishEvent("SalesOrder", (long) 1.0, 5, 2,  250.23, 103);
    publishEvent("SalesOrder", (long) 1.0, 6, 2,   12.05, 105);
    
    // 6 events were submitted to Esper for processing.
    assertEquals(
    		"Total events 6", 
    		6,
    		epService.getEPRuntime().getNumEventsEvaluated());    
    
    // Rounded price should be 12.05
    assertEquals(
    		"Rounded price should be 12",
    		Long.valueOf("12"),
    		statements.getLRoundedPrice());
    
    // Highest transaction & runner up
    assertEquals(
    		"Highest transaction should be 1200.87",
    		1200.87,
    		statements.getDHighestTrans());
    
    assertEquals(
    		"Runner up transaction is should be 250.23",
    		250.23,
    		statements.getDRunnerUp());
    
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

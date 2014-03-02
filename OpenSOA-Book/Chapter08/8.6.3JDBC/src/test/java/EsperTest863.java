import java.sql.SQLException;
import java.util.HashMap;

import opensoa8_63.esper.jbpm.event.ProcessEvent;
import opensoa8_63.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import com.mydomain.data.SimpleExample;

import junit.framework.TestCase;

public class EsperTest863 extends TestCase {
  private EPServiceProvider epService;
  private ProcessStartEnd statements = new ProcessStartEnd();

  public void setUp() throws SQLException {
    
    // setup simple in-memory HSQLDB database
    SimpleExample se = new SimpleExample();
    se.insertCustomer();
    System.out.println("DB records: " + se.selectAllCustomers().size());
    
    Configuration configuration = new Configuration();
    configuration.configure("esperconf.xml");
    configuration.getEngineDefaults().getLogging().setEnableExecutionDebug(true);
    epService = EPServiceProviderManager.getProvider("EsperTest", configuration);
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
    		"Last customer should be Customer 105",
    		"Customer 105",
    		statements.getLastCustomer());
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

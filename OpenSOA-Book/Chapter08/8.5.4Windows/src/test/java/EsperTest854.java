import java.util.HashMap;

import opensoa8_54.esper.jbpm.event.ProcessEvent;
import opensoa8_54.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest854 extends TestCase {
	private EPServiceProvider epService;
	private ProcessStartEnd statements = new ProcessStartEnd();

	public void setUp() {
		Configuration config = new Configuration();
		config.addEventType("ProcessEvent", ProcessEvent.class.getName());
		epService = EPServiceProviderManager.getProvider("EsperTest", config);
		statements.register(epService);
	}

	public void testBasic() {
		publishEvent("SalesOrder", (long) 1.0, 1, 2, 125.00, "regular");
		publishEvent("SalesOrder", (long) 1.0, 2, 2, 1200.00, "premium");
		publishEvent("SalesOrder", (long) 1.0, 3, 2, 150.00, "regular");
		publishEvent("SalesOrder", (long) 1.0, 4, 2, 73.00, "premium");
		publishEvent("SalesOrder", (long) 1.0, 5, 2, 250.00, "premium");
		publishEvent("SalesOrder", (long) 1.0, 6, 2, 12.00, "regular");

		// The total number of events is greater than number of events sent into Esper
		// because, by our use of windows, we are generate additional events for each
		// insert.
		assertEquals(
				"Total events 13", 
				13, 
				epService.getEPRuntime().getNumEventsEvaluated());
		
		// Average price for the high priced orders should be 431.25
		assertEquals(
				"Avg price of high priced orders",
				431.25,
				statements.getAvgHighPricedOrders());
		
		// Number of orders qualifying as premium should be 3 (see ProcessStartEnd for query logic).
		assertEquals(
				"Number of premium orders",
				3.0,
				statements.getNumPremiumOrders());
		
		// Number of orders considered "high priced" should be 4.
		assertEquals(
				"Number ogf high priced orders",
				4.0,
				statements.getNumHighPricedOrders());
		
	}

	private void publishEvent(String processName, long processVersion,
			long processInstanceId, int state, double price, String custType) {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("totalPrice", new Double(price));
		properties.put("custType", new String(custType));

		epService.getEPRuntime().sendEvent(
				new ProcessEvent(processName, processVersion,
						processInstanceId, state, properties));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

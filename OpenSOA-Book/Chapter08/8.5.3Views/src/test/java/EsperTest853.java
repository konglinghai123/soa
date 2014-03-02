import java.util.HashMap;

import opensoa8_53.esper.jbpm.event.ProcessEvent;
import opensoa8_53.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest853 extends TestCase {
	private EPServiceProvider epService;
	private ProcessStartEnd statements = new ProcessStartEnd();

	public void setUp() {

		Configuration config = new Configuration();
		config.addEventType("ProcessEvent", ProcessEvent.class.getName());
		epService = EPServiceProviderManager.getProvider("EsperTest", config);
		statements.register(epService);

	}

	public void testBasic() {
		publishEvent("SalesOrder", (long) 1.0, 1, 2, 125.00);
		publishEvent("SalesOrder", (long) 1.0, 2, 2, 1200.00);
		publishEvent("SalesOrder", (long) 1.0, 3, 2, 50.00);
		publishEvent("SalesOrder", (long) 1.0, 3, 2, 73.00);
		publishEvent("SalesOrder", (long) 1.0, 4, 2, 250.00);
		publishEvent("SalesOrder", (long) 1.0, 5, 2, 12.00);

		// 6 events published to Esper engine
		assertEquals("Total events 6", 6, epService.getEPRuntime()
				.getNumEventsEvaluated());

		// Average price for order is 111.66666666666667
		assertEquals("Average price check", 111.66666666666667, statements
				.getAvgPrice());
	}

	private void publishEvent(String processName, long processVersion,
			long processInstanceId, int state, double price) {

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("totalPrice", new Double(price));

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

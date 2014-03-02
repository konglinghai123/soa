import opensoa8_51.esper.jbpm.Constants;
import opensoa8_51.esper.jbpm.event.ProcessEvent;
import opensoa8_51.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest851 extends TestCase {
	private EPServiceProvider epService;
	private ProcessStartEnd statements = new ProcessStartEnd();

	public void setUp() {

		Configuration configuration = new Configuration();
		configuration
				.addEventType("ProcessEvent", ProcessEvent.class.getName());
		configuration.addEventType("Constants", Constants.class.getName());

		epService = EPServiceProviderManager.getProvider("EsperTest",
				configuration);
		statements.register(epService);

	}

	public void testBasic() throws InterruptedException {

		/* Create some new process instance events */
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("PurchaseOrder", (long) 1.0, 1, 1, null));
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("PurchaseOrder", (long) 1.0, 2, 1, null));
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("PurchaseOrder", (long) 1.0, 3, 1, null));
		Thread.sleep(3000);

		/* Close out the new process instances */
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("PurchaseOrder", (long) 1.0, 1, 2, null));
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("SalesOrder", (long) 1.0, 2, 2, null));
		Thread.sleep(10000);
		epService.getEPRuntime().sendEvent(
				new ProcessEvent("PurchaseOrder", (long) 1.0, 3, 2, null));

		System.out.println("Counter is: " + statements.getCounter());

		// Events should have fired 3 times, as it was keyed off state=2. State
		// is passed as the 4th parameter in the ProcessEvent constructor.

		assertEquals("Events fired 3 times", 3, statements.getCounter());

		assertEquals("Total events 6", 6, epService.getEPRuntime()
				.getNumEventsEvaluated());
	}
}

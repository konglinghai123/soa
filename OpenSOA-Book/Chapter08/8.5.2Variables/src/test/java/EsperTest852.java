import opensoa8_52.esper.jbpm.event.ProcessEvent;
import opensoa8_52.esper.jbpm.statements.ProcessStartEnd;

import com.espertech.esper.client.*;
import junit.framework.TestCase;

public class EsperTest852 extends TestCase {
	private EPServiceProvider epService;
	ProcessStartEnd statements = new ProcessStartEnd();

	public void setUp() {

		Configuration configuration = new Configuration();
		configuration
				.addEventType("ProcessEvent", ProcessEvent.class.getName());
		configuration.addVariable("EVENT_STARTED", Integer.class, 1);
		configuration.addVariable("EVENT_ENDED", Integer.class, 2);

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

		// 6 events were submitted to the Esper engine, so 6 should be
		// returned as evaluated.
		assertEquals("Total events should be 6", 6, epService.getEPRuntime()
				.getNumEventsEvaluated());

		// Of the 6 events sent, only 3 qualify through the statement
		// defined in ProcessStartEnd.
		assertEquals("Counter should be 3", 3, epService.getEPRuntime()
				.getVariableValue("counter"));
	}
}

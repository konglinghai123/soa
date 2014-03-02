package opensoa8_62.esper.jbpm.statements;

import opensoa8_62.esper.jbpm.event.ProcessEvent;

import com.espertech.esper.client.*;

public class ProcessStartEnd {
	private EPServiceProvider epService = null;
	private EPStatement eps;

	// The following are for the jUnit tests
	private long patternCnt;
	private Integer interval;

	private static final String EXAMPLE_PATTERN1 = "process=ProcessEvent(state=2 and processName='SalesOrder')";
	private static final String EXAMPLE_PATTERN2 = "every(process=ProcessEvent(state=2, processName='SalesOrder'))";
	private static final String EXAMPLE_PATTERN3 = "( every(oldOrder=ProcessEvent(state=1, processName='SalesOrder')) -> every(newOrder=ProcessEvent(state=1, processName='SalesOrder', newOrder.integerProperty('custId') = oldOrder.integerProperty('custId'))) where timer:within(10 sec))";
	private static final String EXAMPLE_PATTERN4 = "every ord=ProcessEvent(state=1, processName='SalesOrder') -> (timer:interval(25 sec) and not ProcessEvent(state=2, processInstanceId = ord.processInstanceId))";

	public void register(EPServiceProvider service) {
		this.epService = service;
		init();
	}

	private void init() {

		eps = epService.getEPAdministrator().createPattern(EXAMPLE_PATTERN1);
		eps.addListener(new UpdateListener() {
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				System.out.println("Listener for Single Pattern: "
						+ ((ProcessEvent) newEvents[0].get("process"))
								.getProcessInstanceId());
			}
		});

		eps = epService.getEPAdministrator().createPattern(EXAMPLE_PATTERN2);
		eps.addListener(new UpdateListener() {
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				System.out.println("Listener for every Pattern: "
						+ ((ProcessEvent) newEvents[0].get("process"))
								.getProcessInstanceId());
				patternCnt = ((ProcessEvent) newEvents[0].get("process"))
						.getProcessInstanceId();
			}

		});

		eps = epService.getEPAdministrator().createPattern(EXAMPLE_PATTERN3);
		eps.addListener(new UpdateListener() {
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				System.out.println("Listener for timer:within example: "
						+ ((ProcessEvent) newEvents[0].get("oldOrder"))
								.getIntegerProperty("custId"));
				interval = ((ProcessEvent) newEvents[0].get("oldOrder"))
						.getIntegerProperty("custId");
			}
		});

		eps = epService.getEPAdministrator().createPattern(EXAMPLE_PATTERN4);
		eps.addListener(new UpdateListener() {
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				System.out.println("Listener for timer:interval example: "
						+ ((ProcessEvent) newEvents[0].get("ord"))
								.getIntegerProperty("custId"));
			}
		});

	}

	public long getPatternCnt() {
		return patternCnt;
	}

	public Integer getInterval() {
		return interval;
	}

}

package opensoa8_53.esper.jbpm.statements;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

	private EPServiceProvider epService = null;
	private EPStatement eps;
	private Double avgPrice;

	private static final String EXAMPLE_VIEW1 = "select avg(doubleProperty('totalPrice')) "
			+ "from ProcessEvent(state=2 and processName='SalesOrder').win:length(3) "
			+ "output snapshot every 3 seconds";

	private static final String EXAMPLE_VIEW2 = "select size "
			+ "from ProcessEvent(state=2 and processName='SalesOrder').win:time(10 sec).std:size() "
			+ "output snapshot every 3 seconds";

	public void register(EPServiceProvider service) {
		this.epService = service;
		init();
	}

	private void init() {

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_VIEW1);
		Object exampleView = new Object() {
			public void update(Double price) {
				System.out.println("Average price for last 3 orders: "
						+ price);
				avgPrice = price;
			}
		};
		eps.setSubscriber(exampleView);

		// Example uses anonymous inner class
		eps = epService.getEPAdministrator().createEPL(EXAMPLE_VIEW2);
		Object exampleView2 = new Object() {
			public void update(Long avgOrders) {
				System.out.println("Average orders for last 2 seconds: "
						+ avgOrders);
			}
		};
		eps.setSubscriber(exampleView2);
	}

	public Double getAvgPrice() {
		return avgPrice;
	}
}

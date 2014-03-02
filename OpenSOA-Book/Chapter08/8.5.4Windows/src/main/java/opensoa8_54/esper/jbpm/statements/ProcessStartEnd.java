package opensoa8_54.esper.jbpm.statements;

import opensoa8_54.esper.jbpm.event.ProcessEvent;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

	EPServiceProvider epService = null;
	private EPStatement eps;

	private static final String EXAMPLE_INSERT1 = "insert into PremiumOrders "
			+ "select * from ProcessEvent(state=2 and processName='SalesOrder' and stringProperty('custType') = 'premium')";

	private static final String PREMIUM_QUERY = "select * from PremiumOrders";

	private static final String CREATE_WINDOW = "create window HighPricedOrders.win:time(1 hour) as "
			+ "select processName, processInstanceId, doubleProperty('totalPrice') as price from ProcessEvent";

	private static final String SELECT_PREMIUM_HIGH = "insert into HighPricedOrders(processName, processInstanceId, price) "
			+ "select processName, processInstanceId, doubleProperty('totalPrice') "
			+ "from ProcessEvent(state=2 and processName='SalesOrder' and doubleProperty('totalPrice') > 100)";

	private static final String HIGH_QUERY = "select processName, processInstanceId, price from HighPricedOrders";

	private static final String AVG_HIGH_QUERY = "select avg(price) from HighPricedOrders";

	// Following are used by jUnit to verify results
	private double avgHighPricedOrders;
	private double numPremiumOrders;
	private double numHighPricedOrders;

	public void register(EPServiceProvider service) {
		this.epService = service;
		init();
	}

	private void init() {

		epService.getEPAdministrator().createEPL(EXAMPLE_INSERT1);
		eps = epService.getEPAdministrator().createEPL(PREMIUM_QUERY);

		Object premiumSelect = new Object() {
			public void update(ProcessEvent event) {
				System.out.println("Premium orders: processInstanceId: "
						+ event.getProcessInstanceId());
				numPremiumOrders++;
			}
		};
		eps.setSubscriber(premiumSelect);

		epService.getEPAdministrator().createEPL(CREATE_WINDOW);
		epService.getEPAdministrator().createEPL(SELECT_PREMIUM_HIGH);

		eps = epService.getEPAdministrator().createEPL(HIGH_QUERY);
		Object selectHigh = new Object() {
			public void update(String processName, long processInstanceId,
					double price) {
				System.out.println("High-Priced orders: processInstanceId: "
						+ processInstanceId + " price: " + price);
				numHighPricedOrders++;
			}
		};
		eps.setSubscriber(selectHigh);

		eps = epService.getEPAdministrator().createEPL(AVG_HIGH_QUERY);
		Object avgSelectHigh = new Object() {
			public void update(double avgPrice) {
				System.out.println("Avg of High-Priced orders: " + avgPrice);
				avgHighPricedOrders = avgPrice;
			}
		};
		eps.setSubscriber(avgSelectHigh);
	}
	
	public double getAvgHighPricedOrders() {
		return avgHighPricedOrders;
	}

	public double getNumPremiumOrders() {
		return numPremiumOrders;
	}

	public double getNumHighPricedOrders() {
		return numHighPricedOrders;
	}
}

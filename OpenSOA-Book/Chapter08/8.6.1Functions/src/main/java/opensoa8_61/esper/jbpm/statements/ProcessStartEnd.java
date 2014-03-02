package opensoa8_61.esper.jbpm.statements;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

	private EPServiceProvider epService = null;
	private EPStatement eps;

	// following are used for jUnit testing
	private Double dHighestTrans;
	private Double dRunnerUp;
	private Long lRoundedPrice;

	private static final String EXAMPLE_FUNC1 = "select max(doubleProperty('totalPrice')) as price1, prev(1,doubleProperty('totalPrice')) as price2  "
			+ "from ProcessEvent.ext:sort(10, doubleProperty('totalPrice') desc)";

	private static final String EXAMPLE_FUNC2 = "select Math.round(doubleProperty('totalPrice'))"
			+ "from ProcessEvent(state=2 and processName='SalesOrder')";

	private static final String EXAMPLE_FUNC3 = "select integerProperty('custId'), "
			+ "HelperFunctions.lookupCustomer(integerProperty('custId')) "
			+ "from ProcessEvent(state=2 and processName='SalesOrder')";

	private static final String EXAMPLE_FUNC4 = "select case when instanceof(property('totalPrice'), java.lang.Double) then cast(property('totalPrice'), double) end "
			+ "from ProcessEvent(state=2 and processName='SalesOrder')";

	public void register(EPServiceProvider service) {
		this.epService = service;
		init();
	}

	private void init() {

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_FUNC1);
		Object exampleView = new Object() {
			public void update(Double maxPrice, Double runnerUpPrice) {
				System.out.println("Exammple 1 - Two highest transactions: "
						+ maxPrice + " runnerUp: " + runnerUpPrice);
				dHighestTrans = maxPrice;
				dRunnerUp = runnerUpPrice;
			}
		};
		eps.setSubscriber(exampleView);

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_FUNC2);
		Object exampleView2 = new Object() {
			public void update(Long roundedPrice) {
				System.out.println("Example 2 - Rounded transaction price: "
						+ roundedPrice);
				lRoundedPrice = roundedPrice;
			}
		};
		eps.setSubscriber(exampleView2);

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_FUNC4);
		Object exampleView4 = new Object() {
			public void update(double price) {
				System.out.println("Example 4 - Price is: " + price);
			}
		};
		eps.setSubscriber(exampleView4);

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_FUNC3);
		Object exampleView3 = new Object() {
			public void update(Integer custId, String str) {
				System.out.println("Example 3 - CustId: " + custId
						+ " CustName: " + str);
			}
		};
		eps.setSubscriber(exampleView3);
	}

	public Double getDHighestTrans() {
		return dHighestTrans;
	}

	public Double getDRunnerUp() {
		return dRunnerUp;
	}

	public Long getLRoundedPrice() {
		return lRoundedPrice;
	}
}

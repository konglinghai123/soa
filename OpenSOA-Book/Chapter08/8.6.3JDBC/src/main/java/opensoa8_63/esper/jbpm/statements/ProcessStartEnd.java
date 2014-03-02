package opensoa8_63.esper.jbpm.statements;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

	EPServiceProvider epService = null;
	private EPStatement eps;

	// used for jUnit
	private String lastCustomer;

	private static final String EXAMPLE_VIEW1 = "select integerProperty('custId') as custId, CUST_NAME "
			+ "from ProcessEvent(state=1 and processName='SalesOrder'), "
			+ "sql:mydb[\" select CUST_NAME from CUSTOMER where CUST_ID=${integerProperty('custId')} \"] ";

	public void register(EPServiceProvider service) {
		this.epService = service;
		init();
	}

	private void init() {

		eps = epService.getEPAdministrator().createEPL(EXAMPLE_VIEW1);
		Object exampleView = new Object() {
			public void update(Integer custId, String customer) {
				System.out.println("custId is: " + custId + " Customer name: "
						+ customer);
				lastCustomer = customer;
			}
		};
		eps.setSubscriber(exampleView);

	}
	public String getLastCustomer() {
		return lastCustomer;
	}

}

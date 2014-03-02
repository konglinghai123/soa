package opensoa.esper.jbpm.statementsubscriber;

import opensoa.esper.StatementSubscriber;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;

public class ProcessStartEnd implements StatementSubscriber {

  EPServiceProvider epService = null;
  private EPStatement eps;

  /*
  private final static String EXAMPLE_VIEW1 = "select Double.valueOf(property('totalPrice')) "
    + "from ProcessEvent(state=2 and processName='SalesOrder')";
  */
  
  private final static String EXAMPLE_VIEW1 = "select avg(Double.valueOf(property('totalPrice'))) "
      + "from ProcessEvent(state=2 and processName='SalesOrder').win:length(3) "
      + "output snapshot every 3 seconds";

  private final static String EXAMPLE_VIEW2 = "select size "
      + "from ProcessEvent(state=2 and processName='SalesOrder').win:time(10 sec).std:size() "
      + "output snapshot every 3 seconds";

  public void register(EPServiceProvider service) {
    this.epService = service;
    init();
  }

  private void init() {

  
    eps = epService.getEPAdministrator().createEPL(EXAMPLE_VIEW1);
    Object exampleView = new Object() {
      public void update(double avgPrice) {
        System.out.println("Average price for last 3 orders: " + avgPrice);
      }
    };
    eps.setSubscriber(exampleView);

    
    // Example uses anonymous inner class
    eps = epService.getEPAdministrator().createEPL(EXAMPLE_VIEW2);
    Object exampleView2 = new Object() {
      public void update(Long avgOrders) {
        System.out.println("Average orders for last 2 seconds: " + avgOrders);
      }
    };
    eps.setSubscriber(exampleView2);
  }
}
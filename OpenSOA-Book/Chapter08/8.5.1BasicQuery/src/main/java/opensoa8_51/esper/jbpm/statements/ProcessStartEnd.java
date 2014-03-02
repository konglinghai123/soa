package opensoa8_51.esper.jbpm.statements;

import opensoa8_51.esper.jbpm.event.ProcessEvent;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

  private EPServiceProvider epService = null;
  public int getCounter() {
	return counter;
}

  private EPStatement eps;
  private int counter = 0;

//  private final static String EXAMPLE_SELECTED = "select * from ProcessEvent(state=2)";
  private final static String EXAMPLE_SELECTED2 = "select * from ProcessEvent where state=2";

  public void register(EPServiceProvider service) {
    this.epService = service;
    init();
  }

  private void init() {
    eps = epService.getEPAdministrator().createEPL(EXAMPLE_SELECTED2);
    ExampleSelect exampleSelect = new ExampleSelect();
    eps.setSubscriber(exampleSelect);
  }

  protected class ExampleSelect {
    public void update(ProcessEvent event) {
      System.out.println("\n*** New Event Arrived ***");
      System.out.println("   processName: " + event.getProcessName());
      System.out.println("   processInstanceId: "
          + event.getProcessInstanceId());
      counter ++;
    }
  }
}

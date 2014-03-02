package opensoa8_52.esper.jbpm.statements;

import opensoa8_52.esper.jbpm.event.ProcessEvent;

import com.espertech.esper.client.*;

public class ProcessStartEnd {

  private EPServiceProvider epService = null;
  private EPStatement eps;

//  private final static String EXAMPLE_SELECTED = "select * from ProcessEvent(state=2)";
  private final static String EXAMPLE_SELECTED_WITH_VAR = "select * from ProcessEvent where state=EVENT_ENDED";

  public void register(EPServiceProvider service) {
    this.epService = service;
    init();
  }

  private void init() {
    eps = epService.getEPAdministrator().createEPL(EXAMPLE_SELECTED_WITH_VAR);
    ExampleSelect exampleSelect = this.new ExampleSelect(epService);
    eps.setSubscriber(exampleSelect);
  }

  protected class ExampleSelect {
    private int counter = 0;
    private EPServiceProvider epService;
    
    public ExampleSelect (EPServiceProvider epService) {
      this.epService = epService;
      epService.getEPAdministrator().getConfiguration().addVariable("counter", Integer.class, 0);
    }
    
    public void update(ProcessEvent event) {
      System.out.println("\n*** New Event Arrived ***");
      System.out.println("   processName: " + event.getProcessName());
      System.out.println("   processInstanceId: "
          + event.getProcessInstanceId());
      epService.getEPRuntime().setVariableValue("counter", Integer.valueOf(++counter));
    }
  }
}

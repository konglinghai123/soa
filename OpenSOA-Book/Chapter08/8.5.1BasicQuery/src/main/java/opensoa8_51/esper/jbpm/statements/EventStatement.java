package opensoa8_51.esper.jbpm.statements;

import com.espertech.esper.client.EPServiceProvider;

public interface EventStatement {
  void register(EPServiceProvider epService);
}

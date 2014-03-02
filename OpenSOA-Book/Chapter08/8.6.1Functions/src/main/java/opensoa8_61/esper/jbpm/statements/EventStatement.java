package opensoa8_61.esper.jbpm.statements;

import com.espertech.esper.client.EPServiceProvider;

public interface EventStatement {
  void register(EPServiceProvider epService);
}

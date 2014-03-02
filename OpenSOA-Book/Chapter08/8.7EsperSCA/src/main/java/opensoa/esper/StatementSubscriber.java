package opensoa.esper;

import com.espertech.esper.client.EPServiceProvider;

public interface StatementSubscriber {
  void register(EPServiceProvider epService);
}

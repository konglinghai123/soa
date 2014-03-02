package opensoa.esper;

import org.osoa.sca.annotations.Conversational;

import com.espertech.esper.client.EPServiceProvider;

@Conversational
public interface StatementManager {
  void initializeStatements(); 
  void register(EPServiceProvider service);
}

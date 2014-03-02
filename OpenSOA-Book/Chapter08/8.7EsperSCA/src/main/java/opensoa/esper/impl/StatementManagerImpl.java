package opensoa.esper.impl;

import java.util.*;
import opensoa.esper.*;
import opensoa.esper.jbpm.statementsubscriber.*;
import org.osoa.sca.annotations.*;
import com.espertech.esper.client.EPServiceProvider;

@Service(StatementManager.class)
@Scope("REQUEST")
public class StatementManagerImpl implements StatementManager {

  ArrayList<StatementSubscriber> statements = new ArrayList<StatementSubscriber>();
  StatementSubscriber statement;

  public void initializeStatements() {
    statements.add(new ProcessStartEnd());
  }

  public void register(EPServiceProvider service) {
    for (Iterator<StatementSubscriber> i = statements.iterator(); i.hasNext();) {
      statement = i.next();
      System.out.println("*** Registering: " + statement + " ***");
      statement.register(service);
    }
  }
}

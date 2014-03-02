package opensoa.book.chapter721.impl;

import java.util.HashMap;
import opensoa.book.chapter721.*;
import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class SOAPNodeActionHandler implements ActionHandler{

  private static final long serialVersionUID = 1L;

  public void execute(ExecutionContext executionContext) throws Exception {
    System.out.println("Variaible: " + executionContext.getVariable("name"));
    
    SCADomain scaDomain = SCADomain.newInstance("soapclient.composite");
    SOAPClient soapClient = scaDomain.getService(SOAPClient.class, "SOAPComponent");
    
    HashMap varMap = (HashMap<String, Object>) 
      executionContext.getContextInstance().getVariables();
      
    int caseNum = soapClient.
      createTicket(populateTicketDO(varMap));
    
    executionContext.setVariable("caseNum", caseNum);
    executionContext.getToken().signal();
  }
  
  private TicketDO populateTicketDO(HashMap<String, String> mapVals) {
    TicketDO ticket = new TicketDO();
    ticket.setCustomerEmail(mapVals.get("emailAddress"));
    ticket.setCustomerName(mapVals.get("name"));
    ticket.setSubject(mapVals.get("title"));
    ticket.setProblemDesc(mapVals.get("details"));
    ticket.setSource(mapVals.get("source"));
    
    return ticket;
  }
}

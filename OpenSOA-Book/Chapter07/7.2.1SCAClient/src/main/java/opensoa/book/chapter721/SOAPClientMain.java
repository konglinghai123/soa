package opensoa.book.chapter721;

import org.apache.tuscany.sca.host.embedded.SCADomain;

/**
 * This client program shows how to create an SCA runtime, start it,
 * locate the HelloWorld service and invoke it.
 */
public class SOAPClientMain {

  public final static void main(String[] args) throws Exception {
    SCADomain scaDomain = SCADomain.newInstance("soapclient.composite");
    SOAPClient soapClient = scaDomain.getService(SOAPClient.class,
        "SOAPComponent");

    System.out.println("soapClient is: " + soapClient);

    TicketDO ticket = new TicketDO();
    ticket.setCustomerEmail("jdoe@someplace.com");
    ticket.setCustomerName("John Doe");
    ticket.setProblemDesc("This is a sample problem desc");
    ticket.setSource("customer");
    ticket.setSubject("test subject");

    System.out.println("Case number created is: "
        + soapClient.createTicket(ticket));

    scaDomain.close();

  }

}
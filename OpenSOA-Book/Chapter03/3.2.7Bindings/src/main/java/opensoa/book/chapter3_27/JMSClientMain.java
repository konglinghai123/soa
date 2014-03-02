package opensoa.book.chapter3_27;

import org.apache.tuscany.sca.host.embedded.SCADomain;

/**
 * This client program shows how to create an SCA runtime, start it,
 * locate the HelloWorld service and invoke it.
 */
public class JMSClientMain {

    public  final static void main(String[] args) throws Exception {
        SCADomain scaDomain = SCADomain.newInstance("jmsclient.composite");
        JMSClient jmsClient = scaDomain.getService(JMSClient.class, "JMSComponent");

        System.out.println("jmsClient is: " + jmsClient);
        
        SystemErrorDO ticket = new SystemErrorDO();
        ticket.setProblem("test problem");
        ticket.setSystem("test system");
        ticket.setTitle("test title");

        jmsClient.systemProblem(ticket);
        scaDomain.close();
        
    }
    
}   
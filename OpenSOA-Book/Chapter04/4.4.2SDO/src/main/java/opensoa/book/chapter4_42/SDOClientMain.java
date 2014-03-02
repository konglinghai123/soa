package opensoa.book.chapter4_42;

import opensoa.book.chapter4.issue.*;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.apache.tuscany.sdo.api.SDOUtil;

import commonj.sdo.helper.HelperContext;
import commonj.sdo.helper.XMLDocument;

/**
 * This client program shows how to create an SCA runtime, start it,
 * locate the service and invoke it.
 */
public class SDOClientMain {

   public final static void main(String[] args)
         throws Exception {
      SCADomain scaDomain = SCADomain
            .newInstance("SDOclient.composite");
      SDOClient sdoClient = scaDomain.getService(
            SDOClient.class, "SDOComponent");

      IssueFactory factory = IssueFactory.INSTANCE;
      HelperContext scope = SDOUtil.createHelperContext();
      IssueFactory.INSTANCE.register(scope);

      HeaderType header = factory.createHeaderType();
      ProblemType problem = factory.createProblemType();
      createTicket ticket = factory.createcreateTicket();
      problem.setHeader(header);
      ticket.setProblem(problem);
      header.setFrom("jeff");
      header.setSubject("test subject");
      header.setTo("jeff");
      problem.setDescription("test description");
      problem.setCategory("customer");
      problem.setSeverity("low");

      System.out.println("Case #: "
            + sdoClient.createTicket(ticket));

      // Test #2
      String xml = 
         "<iss:createTicket xmlns:iss=\"http://chapter4.book.opensoa/issue\">" +
              "<iss:Problem severity=\"low\" category=\"systems\">" +
                 "<iss:Header>" +
                    "<iss:From>jdavis</iss:From>" +
                    "<iss:Subject>test subject</iss:Subject>" +
                    "<iss:To>jdavis</iss:To>" +
                 "</iss:Header>" +
                 "<iss:Description>test description test description</iss:Description>" +
              "</iss:Problem>" +
         "</iss:createTicket>"; 
      
      XMLDocument doc = scope.getXMLHelper().load(xml);
      createTicket newTicket = (createTicket) doc.getRootObject();
      System.out.println("newTicket: " + newTicket.getProblem().getDescription());
      
      System.out.println("New Case #: "
            + sdoClient.createTicket(newTicket));
      scaDomain.close();
   }
}   
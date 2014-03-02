package opensoa.book.chapter4_42.impl;

import opensoa.book.chapter4_42.*;
import opensoa.book.chapter4.issue.*;

import org.apache.log4j.Logger;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.osoa.sca.annotations.*;
import commonj.sdo.DataObject;
import commonj.sdo.helper.*;

@Service(ProblemTicketComponentSDO.class)
public class ProblemTicketComponentImplSDO implements
      ProblemTicketComponentSDO {

   private static Logger logger = Logger
         .getLogger(ProblemTicketComponentSDO.class
               .getPackage().getName());

   private CreateTicketComponentSDO createTicket;


   @Property
   public String username;
   @Property
   public String password;

   @Reference
   public void setCreateTicket(
         CreateTicketComponentSDO createTicket) {
      this.createTicket = createTicket;
   }


   public int createTicket(createTicket ticket) {
      System.out
            .println("*** ProblemTicketComponentImpl ***");
      int ticketId = 0;

      ProblemType problem = ticket.getProblem();
      logger.info(getXML(problem));

      ticketId = createTicket.create(problem);


      return ticketId;
   }

   private String getXML(ProblemType problem) {
      HelperContext scope = SDOUtil.createHelperContext();
      XMLHelper helper = scope.getXMLHelper();
      String xml = helper.save((DataObject) problem,
            "http://chapter4.book.opensoa/issue",
            "ProblemType");
      return xml;
   }
}

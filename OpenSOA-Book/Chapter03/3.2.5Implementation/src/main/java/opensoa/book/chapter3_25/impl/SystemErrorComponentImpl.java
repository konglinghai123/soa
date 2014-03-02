package opensoa.book.chapter3_25.impl;

import opensoa.book.chapter3_25.*;

import org.osoa.sca.annotations.*;

@Service(SystemErrorComponent.class)
public class SystemErrorComponentImpl implements
      SystemErrorComponent {

   @Reference
   public ProblemTicketComponent problemTicket;

   public int systemProblem(String system, String title,String problem) {
      System.out.println("*** SystemErrorComponentImpl ***");
      int rval = 0;
      
      TicketDO ticket = new TicketDO();
      ticket.setSubject(title);
      ticket.setSubject(problem);
      ticket.setSource(system);

      rval = problemTicket.createTicket(ticket);
      
      System.out.println("problemTicket:" + rval);
      
      return rval;
   }
}

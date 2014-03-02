package opensoa.book.chapter3_26.impl;

import opensoa.book.chapter3_26.*;

import org.osoa.sca.annotations.*;

@Service(SystemErrorComponent.class)
public class SystemErrorComponentImpl implements
      SystemErrorComponent {

   private ProblemTicketComponent problemTicket;

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
   
   @Reference
   public void setProblemTicket(ProblemTicketComponent problemTicket) {
      this.problemTicket = problemTicket;
   }

}

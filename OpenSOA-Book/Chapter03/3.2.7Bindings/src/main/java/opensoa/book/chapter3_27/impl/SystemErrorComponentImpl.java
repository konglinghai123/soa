package opensoa.book.chapter3_27.impl;

import opensoa.book.chapter3_27.*;

import org.osoa.sca.annotations.*;

@Service(SystemErrorComponent.class)
public class SystemErrorComponentImpl implements
      SystemErrorComponent {

   @Reference
   public ProblemTicketComponent problemTicket;

   public int systemProblem(SystemErrorDO sysTicket) {
      System.out.println("*** SystemErrorComponentImpl ***");
      System.out.println("Problem is: " + sysTicket.getProblem());
      int rval = 0;
      
      TicketDO ticket = new TicketDO();
      ticket.setSubject(sysTicket.getProblem());
      ticket.setSubject(sysTicket.getTitle());
      ticket.setSource(sysTicket.getSystem());
      
      rval = problemTicket.createTicket(ticket);
      
      System.out.println("problemTicket:" + rval);
      
      return rval;
   }
}

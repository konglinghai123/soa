package opensoa.book.chapter3_22.impl;

import org.osoa.sca.annotations.*;

import opensoa.book.chapter3_22.*;

@Service(ProblemTicketComponent.class)				
public class ProblemTicketComponentImpl implements 
   ProblemTicketComponent {

   private CreateTicketComponent createTicket;				

   public int createTicket(TicketDO ticket) {

      System.out.println(ticket.toString());
      return createTicket.create(ticket);
   }

  @Reference								
   public void setCreateTicket(
         CreateTicketComponent createTicket) {
      this.createTicket = createTicket;
   }

}

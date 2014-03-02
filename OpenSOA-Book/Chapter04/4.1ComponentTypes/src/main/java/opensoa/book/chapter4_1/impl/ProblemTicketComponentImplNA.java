package opensoa.book.chapter4_1.impl;

import opensoa.book.chapter4_1.*;

public class ProblemTicketComponentImplNA implements 
   ProblemTicketComponent {

   protected String username;
   protected String password;
	   
   private CreateTicketComponent createTicket;				

   public int createTicket(TicketDO ticket) {
      System.out.println(ticket.toString());
      
      /* username variable passed as injected property value */
      System.out.println("username is: " + username);
      
      return createTicket.create(ticket);
   }
							
   public void setCreateTicket(
         CreateTicketComponent createTicket) {
      this.createTicket = createTicket;
   }

}

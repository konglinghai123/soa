package opensoa.book.chapter4_22.impl;

import org.osoa.sca.annotations.*;

import opensoa.book.chapter4_22.*;

@Service(ProblemTicketComponent.class)				
public class ProblemTicketComponentImpl implements 
   ProblemTicketComponent {
	
   @Property
   protected String username;
   @Property
   protected String password;
	   
   private CreateTicketComponent createTicket;				

   public int createTicket(TicketDO ticket) {
      System.out.println(ticket.toString());
      
      /* username variable passed as injected property value */
      System.out.println("username is: " + username);
      
      return createTicket.create(ticket);
   }

  /* Note, instead of using a setter, you could inject the reference
   * directly at the variable reference level, similar to what
   * is done for the propery injections shown above.
   */
  @Reference								
   public void setCreateTicket(
         CreateTicketComponent createTicket) {
      this.createTicket = createTicket;
   }

}

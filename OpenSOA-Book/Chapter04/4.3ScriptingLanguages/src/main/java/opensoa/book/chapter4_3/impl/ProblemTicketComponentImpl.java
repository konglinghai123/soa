package opensoa.book.chapter4_3.impl;

import org.osoa.sca.annotations.*;

import opensoa.book.chapter4_3.*;

@Service(ProblemTicketComponent.class)				
public class ProblemTicketComponentImpl implements 
   ProblemTicketComponent {

	
   @Property
   protected String username;
   @Property
   protected String password;

   private EmailServiceComponent emailService;   
   private CreateTicketComponent createTicket;				

   public int createTicket(TicketDO ticket) {
      System.out.println(ticket.toString());
      
      /* username variable passed as injected property value */
      System.out.println("username is: " + username);
      System.out.println("email: " + emailService.email("doNotReply@none.com", 
              ticket.getCustomerEmail(), ticket.getSubject(), 
              ticket.getProblemDesc(), String.valueOf(ticket.getCaseNumber())));
      
      return createTicket.create(ticket);
   }

  @Reference								
   public void setCreateTicket(
         CreateTicketComponent createTicket) {
      this.createTicket = createTicket;
   }
  
  @Reference
  public void setEmailService(
        EmailServiceComponent emailService) {
     this.emailService = emailService;
  }

}

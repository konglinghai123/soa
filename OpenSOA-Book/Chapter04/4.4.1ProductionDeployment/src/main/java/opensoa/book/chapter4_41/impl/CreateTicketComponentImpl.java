package opensoa.book.chapter4_41.impl;

import java.util.Random;

import opensoa.book.chapter4_41.*;

import org.osoa.sca.annotations.*;

@Service(CreateTicketComponent.class)
public class CreateTicketComponentImpl implements
      CreateTicketComponent, EventNotificationCallback {

   @Reference 
   protected SessionManager sessionManager;
  
   @Reference
   protected EventNotificationComponent eventNotifier;
   
   int ticketId = 0;
   
   public CreateTicketComponentImpl() {
      super();
      System.out
            .println("CreateTicketComponentImpl instantiated...");
   }

   public int create(TicketDO ticket) {
      System.out.println("createTicket sessionManager: " + sessionManager.getSessionId());
      Random r = new Random();
      ticketId = r.nextInt(300000);
      eventNotifier.notify(ticket);
      
      return ticketId;
   }

   public void success(boolean status) {
      System.out.println("Notify results: " + status);
      
   }
}

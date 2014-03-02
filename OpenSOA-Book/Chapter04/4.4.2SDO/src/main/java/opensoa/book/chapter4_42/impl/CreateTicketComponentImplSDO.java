package opensoa.book.chapter4_42.impl;

import java.util.Random;

import opensoa.book.chapter4_42.CreateTicketComponentSDO;
import opensoa.book.chapter4_42.EventNotificationCallback;
import opensoa.book.chapter4_42.EventNotificationComponentSDO;
import opensoa.book.chapter4_42.SessionManager;
import opensoa.book.chapter4.issue.ProblemType;

import org.osoa.sca.annotations.*;

@Service(CreateTicketComponentSDO.class)
public class CreateTicketComponentImplSDO implements
      CreateTicketComponentSDO, EventNotificationCallback {

   @Reference 
   protected SessionManager sessionManager;
  
   @Reference
   protected EventNotificationComponentSDO eventNotifier;
   
   int ticketId = 0;
   
   public CreateTicketComponentImplSDO() {
      super();
      System.out
            .println("CreateTicketComponentImplSDO instantiated...");
   }

   public int create(ProblemType ticket) {
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

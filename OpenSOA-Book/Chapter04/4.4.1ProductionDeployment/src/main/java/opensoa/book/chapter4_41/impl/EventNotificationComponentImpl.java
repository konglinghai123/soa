package opensoa.book.chapter4_41.impl;

import opensoa.book.chapter4_41.*;

import org.osoa.sca.annotations.*;

@Service(EventNotificationComponent.class)

public class EventNotificationComponentImpl 
   implements EventNotificationComponent {

   @Callback
   protected EventNotificationCallback callback;
   
   public void notify(TicketDO ticket) {

      try {
         Thread.sleep(4000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      callback.success(true);
   }
}

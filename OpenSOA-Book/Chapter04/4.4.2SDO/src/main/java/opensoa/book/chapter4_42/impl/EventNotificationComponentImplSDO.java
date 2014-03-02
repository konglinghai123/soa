package opensoa.book.chapter4_42.impl;

import opensoa.book.chapter4_42.*;
import opensoa.book.chapter4.issue.ProblemType;

import org.osoa.sca.annotations.*;

@Service(EventNotificationComponentSDO.class)

public class EventNotificationComponentImplSDO 
   implements EventNotificationComponentSDO {

   @Callback
   protected EventNotificationCallback callback;
   
   public void notify(ProblemType ticket) {

      try {
         Thread.sleep(40000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      callback.success(true);
   }
}

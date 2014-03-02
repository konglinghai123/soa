package opensoa.book.chapter4_41;

import opensoa.book.chapter4_41.EventNotificationCallback;
import opensoa.book.chapter4_41.TicketDO;

import org.osoa.sca.annotations.*;

@Remotable
@Callback(EventNotificationCallback.class)
public interface EventNotificationComponent {
   
   @OneWay
   public void notify(TicketDO ticket);
}


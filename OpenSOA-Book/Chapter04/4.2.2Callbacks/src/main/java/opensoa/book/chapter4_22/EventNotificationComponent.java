package opensoa.book.chapter4_22;

import org.osoa.sca.annotations.*;

@Remotable
@Callback(EventNotificationCallback.class)
public interface EventNotificationComponent {
   
   @OneWay
   public void notify(TicketDO ticket);
}


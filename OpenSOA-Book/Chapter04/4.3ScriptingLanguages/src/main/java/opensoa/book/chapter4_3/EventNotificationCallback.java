package opensoa.book.chapter4_3;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface EventNotificationCallback {
   void success(boolean status);
}

package opensoa.book.chapter4_42;

import opensoa.book.chapter4.issue.ProblemType;

import org.osoa.sca.annotations.*;

@Remotable
@Callback(EventNotificationCallback.class)
public interface EventNotificationComponentSDO {
   
   @OneWay
   public void notify(ProblemType ticket);
}


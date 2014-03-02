package opensoa.book.chapter4_41;

import org.osoa.sca.annotations.Conversational;
import org.osoa.sca.annotations.Remotable;

@Remotable
@Conversational
public interface SessionManager {
   public void initialize();
   public int getSessionId();
}

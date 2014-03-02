package opensoa.esper;

import org.osoa.sca.annotations.Conversational;
import com.espertech.esper.client.EPServiceProvider;

@Conversational
public interface SessionManager {
   public void initialize();
   public EPServiceProvider getEPSession();
}
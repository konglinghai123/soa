package opensoa.drools.service;

import org.drools.WorkingMemory;
import org.osoa.sca.annotations.Conversational;

@Conversational
public interface SessionManager {
   public void initialize();
   public WorkingMemory getWorkingMemory();
   public void setStatus(boolean status);
   public boolean isStatus();
}
package opensoa.book.chapter4_42.impl;

import java.util.Random;
import org.osoa.sca.annotations.*;

import opensoa.book.chapter4_42.SessionManager;

@Service (SessionManager.class)
@Scope ("COMPOSITE")
@EagerInit
public class SessionManagerImpl implements SessionManager {

   private int sessionId = 0;
   
   public int getSessionId() {
      return sessionId;
   }

   @Init
   public void initialize() {    
      Random r = new Random();
      sessionId = r.nextInt(300000);
   }
}

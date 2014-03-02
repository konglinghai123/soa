package org.jbpm.logging.db;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.jbpm.JbpmContext;
import org.jbpm.JbpmException;
import org.jbpm.graph.log.ProcessInstanceCreateLog;
import org.jbpm.graph.log.ProcessInstanceEndLog;
import org.jbpm.logging.CustomLoggerCh7;
import org.jbpm.logging.log.ProcessLog;

public class CustomDbLoggingService implements CustomLoggerCh7 {

  private static String PROCESS_INSTANCE_CREATE_LOG="org.jbpm.graph.log.ProcessInstanceCreateLog";
  private static String PROCESS_INSTANCE_END_LOG="org.jbpm.graph.log.ProcessInstanceEndLog";
  private static String TRANSITION_LOG="org.jbpm.graph.log.TransitionLog";
  
  private static final long serialVersionUID = 1L;
 
  Session session = null;
   
  public CustomDbLoggingService() {
    System.out.println("Initiating CustomDbLoggingService");
    JbpmContext currentJbpmContext = JbpmContext.getCurrentJbpmContext();
    if (currentJbpmContext==null) {
      throw new JbpmException("instantiation of the DbLoggingService requires a current JbpmContext");
    }
    session = currentJbpmContext.getSession();
  }
  
  public void log(ProcessLog processLog) {
 
    if (session != null) {
      
      ProcessInstanceCreateLog procInstanceCreateLog;
      ProcessInstanceEndLog procInstanceEndLog;
      
      System.out.println("In CustomDbLoggingService");
      
      if (processLog.getClass().getName().equals(PROCESS_INSTANCE_CREATE_LOG)) {
        procInstanceCreateLog = (ProcessInstanceCreateLog) processLog;
        
        System.out.println("procInstanceCreateLog.getParent()" + procInstanceCreateLog.getToken().getProcessInstance().getId());
        System.out.println("start: " + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(procInstanceCreateLog.getDate()));
      } else if (processLog.getClass().getName().equals(PROCESS_INSTANCE_END_LOG)) {
        procInstanceEndLog = (ProcessInstanceEndLog) processLog;
        System.out.println("procInstanceEndLog.getParent()" + procInstanceEndLog.getToken().getProcessInstance().getId());
        System.out.println("end: " + new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(procInstanceEndLog.getDate()));
        
      }
      session.save(processLog);
    }
    
  }

  public void close() {
    // TODO Auto-generated method stub
    
  }
  
}

package org.jbpm.logging.db;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.jbpm.JbpmContext;
import org.jbpm.JbpmException;
import org.jbpm.graph.log.ProcessInstanceCreateLog;
import org.jbpm.graph.log.ProcessInstanceEndLog;
import org.jbpm.logging.CustomLoggerCh7;
import org.jbpm.logging.log.ProcessLog;

public class CustomDbLoggingServiceCh7 implements CustomLoggerCh7 {

  private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z");
  private static final String PROCESS_INSTANCE_CREATE_LOG = "org.jbpm.graph.log.ProcessInstanceCreateLog";
  private static final String PROCESS_INSTANCE_END_LOG = "org.jbpm.graph.log.ProcessInstanceEndLog";
//  private static final String TRANSITION_LOG="org.jbpm.graph.log.TransitionLog";
  
  private static final long serialVersionUID = 1L;
 
  Session session = null;
   
  public CustomDbLoggingServiceCh7() {
    println("Initiating CustomDbLoggingService");
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
      
      println("In CustomDbLoggingService");
      
      if (processLog.getClass().getName().equals(PROCESS_INSTANCE_CREATE_LOG)) {
        procInstanceCreateLog = (ProcessInstanceCreateLog) processLog;
        println("procInstanceCreateLog.getParent()" + getId(procInstanceCreateLog));
        println("start: " + FORMAT.format(procInstanceCreateLog.getDate()));
      } else if (processLog.getClass().getName().equals(PROCESS_INSTANCE_END_LOG)) {
        procInstanceEndLog = (ProcessInstanceEndLog) processLog;
        println("procInstanceEndLog.getParent()" + getId(procInstanceEndLog));
        println("end: " + FORMAT.format(procInstanceEndLog.getDate()));
      }
      session.save(processLog);
    }
    
  }

  private long getId(ProcessLog processLog) {
    return processLog.getToken().getProcessInstance().getId();
  }

  private void println(String string) {
    System.out.println(string);
  }
	  
  public void close() {
  }
  
}

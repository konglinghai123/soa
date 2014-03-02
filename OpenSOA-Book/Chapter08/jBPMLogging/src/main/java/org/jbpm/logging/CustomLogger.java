package org.jbpm.logging;

import org.jbpm.logging.log.ProcessLog;

public interface CustomLogger extends LoggingService {
   void log(ProcessLog processLog);
}

package org.jbpm.logging.db;

import org.jbpm.svc.Service;
import org.jbpm.svc.ServiceFactory;

public class CustomDbLoggingServiceFactory implements ServiceFactory {

  private static final long serialVersionUID = 1L;

  public Service openService() {
    return new CustomDbLoggingServiceCh7();
  }

  public void close() {
  }
}
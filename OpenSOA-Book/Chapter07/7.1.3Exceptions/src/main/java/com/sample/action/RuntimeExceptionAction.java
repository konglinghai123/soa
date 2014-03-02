package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class RuntimeExceptionAction implements ActionHandler {

  private static final long serialVersionUID = 1L;

  public void execute(ExecutionContext executionContext) throws Exception {
		System.out.println("Inside RuntimeExceptionAction");
		executionContext.setVariable("errorMsg", "A runtime error has occurred in node");
	}

}

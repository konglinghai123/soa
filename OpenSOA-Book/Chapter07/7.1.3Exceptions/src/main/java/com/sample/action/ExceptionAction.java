package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class ExceptionAction implements ActionHandler {
	private static final long serialVersionUID = 1L;

	public void execute(ExecutionContext executionContext) throws Exception {
		System.out.println("Inside ExceptionAction: " + executionContext.getException().getMessage());
		executionContext.setVariable("exception", executionContext.getException().getMessage());
	}

}

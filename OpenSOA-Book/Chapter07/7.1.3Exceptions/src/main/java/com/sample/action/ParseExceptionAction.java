package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class ParseExceptionAction implements ActionHandler {
	private static final long serialVersionUID = 1L;

	public void execute(ExecutionContext executionContext) throws Exception {
		System.out.println("Inside ParseExceptionAction");
		executionContext.setVariable("errorMsg", "A parse exception error has occurred in node");
	}
}

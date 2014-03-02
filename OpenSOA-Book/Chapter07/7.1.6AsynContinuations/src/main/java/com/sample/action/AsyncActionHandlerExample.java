package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class AsyncActionHandlerExample implements ActionHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void execute(ExecutionContext executionContext) throws Exception {
		System.err.println("In AsyncActionHandlerExample...");
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.err.println("DONE....");
		executionContext.leaveNode("ok");
	}

}

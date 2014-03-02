package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class MessageActionHandlerConstructor implements ActionHandler {

	private static final long serialVersionUID = 1L;
	
	private String message;


	public MessageActionHandlerConstructor(String message) {
		super();
		System.out.println("Constructor method called with message value: " + message);
		this.message = message.trim();
	}


	public void execute(ExecutionContext context) throws Exception {
		context.getContextInstance().setVariable("message", message);
	}

}

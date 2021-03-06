package com.sample.action;

import java.security.GeneralSecurityException;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class MessageActionHandlerExc3 implements ActionHandler {

	private static final long serialVersionUID = 1L;
	
	/**
	 * The message member gets its value from the configuration in the 
	 * processdefinition. The value is injected directly by the engine. 
	 */
	String message;

	/**
	 * A message process variable is assigned the value of the message
	 * member. The process variable is created if it doesn't exist yet.
	 */
	public void execute(ExecutionContext context) throws Exception {
		context.getContextInstance().setVariable("message", message);
		throw new GeneralSecurityException("GeneralSecurityException");
	}

}

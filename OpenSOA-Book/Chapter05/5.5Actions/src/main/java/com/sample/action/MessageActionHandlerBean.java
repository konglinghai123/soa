package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.dom4j.Element;

public class MessageActionHandlerBean implements ActionHandler {

	private static final long serialVersionUID = 1L;
	
	private Element complex = null;
	private String message;

	/**
	 * A message process variable is assigned the value of the message
	 * member. The process variable is created if it doesn't exist yet.
	 */
	public void execute(ExecutionContext context) throws Exception {
		context.getContextInstance().setVariable("message", message);
	}

	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		System.out.println("Bean method called with message value: " + message);
		this.message = message;
	}

	public Element getComplex() {
		return complex;
	}

	public void setComplex(Element complex) {
		System.out.println("Element: " + complex.asXML());
		this.complex = complex;
	}
	

}

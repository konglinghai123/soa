package com.sample.action;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class MessageActionHandlerConfiguration implements ActionHandler {

	private static final long serialVersionUID = 1L;
	
	private String message;

	private String configuration;
	
	public void execute(ExecutionContext context) throws Exception {
		context.getContextInstance().setVariable("message", message);
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		System.out.println("Using configuration-property setConfigurationMethod: " + configuration);
		this.configuration = configuration;
		message = configuration.trim();
	}

}

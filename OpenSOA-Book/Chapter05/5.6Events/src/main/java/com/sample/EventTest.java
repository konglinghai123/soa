package com.sample;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class EventTest implements ActionHandler {

	private static final long serialVersionUID = 1L;
	

	public void execute(ExecutionContext context) throws Exception {
		String nodeName = context.getEventSource().getName();
		context.getContextInstance().setVariable("node", nodeName);
		System.out.println("EventTest Context: " + nodeName);
		
	}
}
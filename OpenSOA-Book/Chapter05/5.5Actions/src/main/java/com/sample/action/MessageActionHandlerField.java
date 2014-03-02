package com.sample.action;

import java.util.Map;

import org.dom4j.Element;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class MessageActionHandlerField implements ActionHandler {

	String message;
	Element xml;
	Map<String, String> map;
	
	public void execute(ExecutionContext context) throws Exception {
		context.getContextInstance().setVariable("message", message);
		
		System.out.println("map is: " + map.size());
		System.out.println("xml is: " + xml.asXML());
	}

}

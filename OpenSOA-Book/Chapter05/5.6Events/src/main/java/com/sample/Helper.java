package com.sample;

import org.jbpm.graph.exe.ProcessInstance;

public class Helper {
	
	protected static void invokeWebService (ProcessInstance instance) {
		System.out.println("instance: " + instance.getContextInstance().getTransientVariable("endpoint"));
		System.out.println("instance: " + instance.getContextInstance().getTransientVariable("portName"));
		System.out.println("instance: " + instance.getContextInstance().getTransientVariable("service"));
		
	}
}

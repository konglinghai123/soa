package com.sample;

import junit.framework.TestCase;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class SimpleProcessTest extends TestCase {

	public void testSimpleProcess() throws Exception {

		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("simple/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);
		assertEquals(
				"Instance is in start state", 
				instance.getRootToken().getNode().getName(), 
				"start");
		assertNull(
				"Message variable should not exist yet", 
				instance.getContextInstance().getVariable("message"));

		// Move the process instance from its start state to the field state.
		// The configured action should execute and the appropriate message
		// should appear in the message process variable.
		instance.signal();
		assertEquals(
				"Instance is in field state", 
				instance.getRootToken().getNode().getName(), 
				"field");
		assertEquals(
				"Message variable contains message", 
				instance.getContextInstance().getVariable("message"),
				"Going to the field state!");

		// in bean state
		instance.signal();
		assertEquals(
				"Instance is in bean state", 
				instance.getRootToken().getNode().getName(), 
				"bean");
		
		assertEquals(
				"Message variable is changed", 
				instance.getContextInstance().getVariable("message"),
				"Going to the bean state!");
		
		// in constructor state
		instance.signal();
		assertEquals(
				"Instance is in constructor state", 
				instance.getRootToken().getNode().getName(), 
				"constructor");
		
		assertEquals(
				"Message variable is changed", 
				instance.getContextInstance().getVariable("message"),
				"Going to the constructor state!");		
	
		instance.signal();
		instance.signal();
	    assertTrue("Instance has ended", instance.hasEnded());

	}

}

package com.sample;

import junit.framework.TestCase;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;

public class VariableProcessTest extends TestCase {

	public void testSimpleProcess() throws Exception {

		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("variable_example/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);

		assertEquals(
				"Instance is in start state", 
				instance.getRootToken().getNode().getName(), 
				"start");

		
		instance.getContextInstance().setVariable("processVar", "true");
		instance.signal();
		
		// setup the tokens 
		Token root = instance.getRootToken();
		Token t1 = instance.findToken("/t1");
		Token t2 = instance.findToken("/t2");
		Token t3 = instance.findToken("/t3");
		
		/** PROCESS TOKEN T1 **/
		t1.getProcessInstance().getContextInstance().setVariableLocally("t1TokenVar", "true", t1);
		t1.signal();
		assertEquals(
				"Token is in fork-state1.2", 
				t1.getNode().getName(), 
				"fork-state1.2");
		
		t1.signal();
		assertEquals(
				"Token is in join", 
				t1.getNode().getName(), 
				"join");
		
		assertEquals(
				"Token is ended", 
				t1.hasEnded(), 
				true);
		
		assertEquals(
				"Token process variable", 
				instance.getContextInstance().getVariableLocally("t1TokenVar", t1), "true");
		assertEquals(
				"Token process variable method 2", 
				instance.getContextInstance().getVariable("t1TokenVar",t1), "true");
		assertEquals(
				"Process variable", 
				t1.getProcessInstance().getContextInstance().getVariable("processVar"),"true");

		
		// Verify process variable still exists
		assertEquals(
				"Process variable exists", 
				instance.getContextInstance().getVariable("processVar"), 
				"true");
		assertNull(
				"Local token variable should be null", 
				instance.getContextInstance().getVariable("t1TokenVar"));		
		
	 // assertTrue("Instance has ended", instance.hasEnded());

	}

}

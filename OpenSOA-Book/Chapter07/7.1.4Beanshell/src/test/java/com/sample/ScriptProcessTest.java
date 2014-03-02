package com.sample;

import junit.framework.TestCase;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class ScriptProcessTest extends TestCase {

	public void testSimpleProcess() throws Exception {

		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("beanshell/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);
		assertEquals(
				"Instance is in start state", 
				"start",
				instance.getRootToken().getNode().getName());

		instance.signal();
		
		assertEquals(
				"Instance is in first state", 
				"first",
				instance.getRootToken().getNode().getName());
		
		assertNotNull(
				"evalNum should not be null", 
				instance.getContextInstance().getVariable("evalNum"));
		
		long evalNum =  ((Long) instance.getContextInstance().getVariable("evalNum")).longValue();
		instance.signal();
		
		if (evalNum < 33) {
			assertEquals(
					"Instance is in 0-33 state", 
					"0 to 33",
					instance.getRootToken().getNode().getName());
		} else if (evalNum >= 33 && evalNum < 66) {
			assertEquals(
					"Instance is in 33 to 66 state", 
					"33 to 66",
					instance.getRootToken().getNode().getName());
		} else
			assertEquals(
					"Instance is in 66 or greater state", 
					"66 or greater",
					instance.getRootToken().getNode().getName());
		
		instance.signal();
		
		assertEquals(
				"Instance is in end state", 
				"end",
				instance.getRootToken().getNode().getName());
		
		assertTrue("Instance has ended", instance.hasEnded());

	}
}

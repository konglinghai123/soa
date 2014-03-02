package com.sample;

import junit.framework.TestCase;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class EventProcessTest extends TestCase {

	public void testSimpleProcess() throws Exception {

		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition
				.parseXmlResource("event_example/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);

		// Set some transient variables for demonstration purposes
		instance.getContextInstance().setTransientVariable("endpoint",
				"http://www.somewebservice.com");
		instance.getContextInstance().setTransientVariable("portName", "SOAP");
		instance.getContextInstance().setTransientVariable("service", "getData");
		ProcessInstance instance2 = new ProcessInstance(processDefinition);

		assertEquals("Instance is in start state", instance.getRootToken()
				.getNode().getName(), "start");

		instance.signal();
		assertEquals("Instance is in state1 state", instance.getRootToken()
				.getNode().getName(), "state1");

		// The transient variables set with the instance should not
		//	 be available in instance2
		assertNull("Transient variable should not exist", instance2
				.getContextInstance().getTransientVariable("endpoint"));
		assertEquals("Transient variable should exist", instance
				.getContextInstance().getTransientVariable("service"), "getData");

		assertEquals("Event node set variable", instance.getContextInstance()
				.getVariable("node"), "state1");

		Helper.invokeWebService(instance);

		instance.signal();
		assertEquals("Instance is in state2 state", instance.getRootToken()
				.getNode().getName(), "state2");

		instance.signal();
		assertTrue("Instance has ended", instance.hasEnded());

	}

}

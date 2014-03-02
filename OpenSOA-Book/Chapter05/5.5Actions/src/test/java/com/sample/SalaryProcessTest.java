package com.sample;

import junit.framework.TestCase;

import org.jbpm.context.exe.ContextInstance;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

import com.sample.objects.SalaryObject;

public class SalaryProcessTest extends TestCase {

	public void testSalaryProcess() throws Exception {

		SalaryObject salary = new SalaryObject();
		
		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("salary/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);
		ContextInstance contextInstance = instance.getContextInstance();
		
		assertEquals(
				"Instance is in start state", 
				instance.getRootToken().getNode().getName(), 
				"start");
		
		contextInstance.setVariable("salary", salary);
		
		// Move the process instance from its start state to the field state.
		// The configured action should execute and the appropriate message
		// should appear in the message process variable.
		instance.signal();
		assertEquals(
				"Instance is in field state", 
				instance.getRootToken().getNode().getName(), 
				"approve");
		assertEquals(
				"Proposed Salary Matches", 
				((SalaryObject) (instance.getContextInstance().getVariable("salary"))).proposedSalary,
				55000);
		
		instance.signal();
	    assertTrue("Instance has ended", instance.hasEnded());

	}

}

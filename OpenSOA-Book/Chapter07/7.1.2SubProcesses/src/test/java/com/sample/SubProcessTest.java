package com.sample;

import junit.framework.TestCase;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.GraphSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.node.ProcessState;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.svc.Services;

public class SubProcessTest extends TestCase {

	JbpmContext jbpmContext;
	GraphSession graphSession;
	JbpmConfiguration jbpmConfiguration;
	
	public void setUp() {
		System.out.println("Setting up context...");
		
		JbpmConfiguration jbpmConfiguration = JbpmConfiguration.getInstance();

		jbpmConfiguration.createSchema();
		jbpmContext = jbpmConfiguration.createJbpmContext();
		graphSession = jbpmContext.getGraphSession();
	}
	public void testSimpleSubProcess() throws Exception {

		// This is the subprocess definition
		ProcessDefinition subProcessDefinition = ProcessDefinition.parseXmlResource("security/processdefinition.xml");
		assertNotNull("Definition should not be null", subProcessDefinition);
	
		// This is the parent process definition
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("main/processdefinition.xml");
		assertNotNull(
				"Definition should not be null", 
				processDefinition);

		// Resolve reference to the subprocess
		ProcessState processState = (ProcessState) processDefinition.getNode("security");
		processState.setSubProcessDefinition(subProcessDefinition);
		
		// Deploy subprocess
		jbpmContext.deployProcessDefinition(subProcessDefinition);
		
		// Deploy superprocess/parent		
		jbpmContext.deployProcessDefinition(processDefinition);
		
		// Create new process instance of the superprocess
		ProcessInstance instance = jbpmContext.newProcessInstanceForUpdate("employee-termination");

		processState = (ProcessState) processDefinition.getNode("security");
		
		// Test to verify that the the subprocess has been loaded
		assertEquals(
				"Subprocess definition 'security' should be present", 
				"security",
				processState.getSubProcessDefinition().getName());
	    
		assertEquals(
				"Instance is in start state", 
				"start",
				instance.getRootToken().getNode().getName());
		
		assertNull(
				"Message variable should not exist yet", 
				instance.getContextInstance().getVariable("message"));

		// Start the parent process
		instance.signal();
		
		assertEquals(
				"Instance is in first state", 
				"fork1",
				instance.getRootToken().getNode().getName());

		// Save the process instance and then reload from the DB graph session
		jbpmContext.save(instance);
		instance = graphSession.loadProcessInstance(instance.getId());
		
		// Since we use a fork on the main process, several tokens are created. We next
		// identify the one associated with the subprocess, so we can use the token to
		// then retrieve the running instance of that subprocess.
		ProcessInstance subProcessInstance = instance.findToken("to security").getSubProcessInstance();
		
		assertNotNull(
				"Subprocess must not be null", 
				subProcessInstance);
		
		// Check that the subprocess name was as expected
		assertEquals(
				"Subprocess name must be 'security'",
				"security",
				subProcessInstance.getProcessDefinition().getName());
		
		// Once subprocess instance is started, the fork in the security subprocess 
		// should be encountered next.
		assertEquals(
				"The security subprocess should have entered the fork1 node",
				"fork1",
				subProcessInstance.getRootToken().getNode().getName());
		
		// Test that the superprocess id and the parent process id identified
		// through the subprocess are the same.
		assertEquals(
				"Process Ids should be identical",
				instance.getId(),
				subProcessInstance.getSuperProcessToken().getProcessInstance().getId());
		
		// You can specify in the parent/superprocess which version of a subprocess
		// definition is used. Since we didn't specify, it will always use the latest
		// number. If you did want to specify, you'd do something like:
		// <sub-process name="security" version='1'/>
		assertEquals(
				"Subprocess should be version 1",
				1,
				subProcessInstance.getProcessDefinition().getVersion());
		
		// Lastly, let's verify that the 3 variables we passed to the subprocess are 
		// properly populated.
		assertEquals(
				"3 variables should be passed to security subprocess",
				3,
				subProcessInstance.getContextInstance().getVariables().size());
		
		// The variable was set in the superprocess event 
		assertEquals(
				"Variable name called 'name' should be 'John Doe'",
				"John Doe",
				subProcessInstance.getContextInstance().getVariable("name"));
	}

}

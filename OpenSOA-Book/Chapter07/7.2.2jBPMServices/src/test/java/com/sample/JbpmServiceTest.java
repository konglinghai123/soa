package com.sample;

import java.util.List;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.GraphSession;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class JbpmServiceTest extends TestCase {

	JbpmContext jbpmContext;
	GraphSession graphSession;
	JbpmConfiguration jbpmConfiguration;
	Session session;
	
	public void setUp() {
		System.out.println("Setting up context...");
		
		JbpmConfiguration jbpmConfiguration = JbpmConfiguration.getInstance();

		jbpmConfiguration.createSchema();
		jbpmContext = jbpmConfiguration.createJbpmContext();
		graphSession = jbpmContext.getGraphSession();
		session = jbpmContext.getSession();
	}
	
	public void testSimpleProcess() throws Exception {

		createInstanceTest1();
		createInstanceTest2();
		
		jbpmContext.close();

	}
	
	public void createInstanceTest2() {
		
		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("scaSOAP/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);
		
		// Deploy the process	
		jbpmContext.deployProcessDefinition(processDefinition);
		
		ProcessInstance instance = jbpmContext.newProcessInstanceForUpdate("scaSOAP");
		
		// This will result in a task getting created
	    instance.signal();
	    
	    TaskMgmtSession taskMgmtSession = jbpmContext.getTaskMgmtSession();
	    Token token = instance.findToken("/");
	    
	    List<TaskInstance> taskInstances = taskMgmtSession.findTaskInstancesByToken(token.getId());
	    
	    assertEquals(
	    		"Should only be one task instance",
	    		1,
	    		taskInstances.size());
	    
	    jbpmContext.save(instance);
		
	}
	
	public void createInstanceTest1() {
		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("beanshell/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Deploy the process	
		jbpmContext.deployProcessDefinition(processDefinition);
		
		// Create a few new process instances
		ProcessInstance instance = jbpmContext.newProcessInstanceForUpdate("beanshell");
		jbpmContext.save(instance);
		
		instance = jbpmContext.newProcessInstanceForUpdate("beanshell");
		assertEquals(
				"Instance is in start state", 
				"start",
				instance.getRootToken().getNode().getName());

		instance.signal();
		
		assertEquals(
				"Instance is in first state", 
				"first",
				instance.getRootToken().getNode().getName());
		
		jbpmContext.save(instance);
	}
}

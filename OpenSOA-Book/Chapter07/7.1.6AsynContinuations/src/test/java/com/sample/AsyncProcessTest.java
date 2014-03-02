package com.sample;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.GraphSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class AsyncProcessTest extends TestCase {

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
	public void testSimpleSubProcess() throws Exception {

		Number jobs;
		
		// This is the subprocess definition
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("async/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);
	

		// Deploy the process	
		jbpmContext.deployProcessDefinition(processDefinition);
		
		// Create new process instance
		ProcessInstance instance = jbpmContext.newProcessInstanceForUpdate("async-example");

		jobs = (Number) session.createQuery("select count(*) from org.jbpm.job.Job").uniqueResult();

		// At this point, no job should be present in the job table, because no async process
		// has yet to be invoked.
		assertEquals(
				"No job should be present",
				0,
				jobs.intValue());

		assertEquals(
				"Instance is in start state", 
				"start",
				instance.getRootToken().getNode().getName());

		// Start the parent process
		instance.signal();
		assertEquals(
				"Instance is in first state node", 
				"first",
				instance.getRootToken().getNode().getName());
		
		instance.signal();
	
		assertEquals(
				"Instance is in async node", 
				"async-node",
				instance.getRootToken().getNode().getName());
		
		/* 
		   At this point, the instance is waiting at the async-node node. This is 
		   where the asynchronous continuation is called, and a job has been
		   created in the Job table. Normally, when running the Enterprise version
		   (jBPM Console), the server process would then use a task manager to pickup
		   the pending job and move the instance along. However, since I wanted to keep this
		   example as straightforward as possible, we're using an embedded jBPM instance, 
		   which doesn't, without some work, have this capability. However, we can see
		   that a job has been created, which is what we are testing for.
		 */
		
		jobs = (Number) session.createQuery("select count(*) from org.jbpm.job.Job").uniqueResult();

		assertEquals(
				"One job should be present",
				1,
				jobs.intValue());
		
	}

}

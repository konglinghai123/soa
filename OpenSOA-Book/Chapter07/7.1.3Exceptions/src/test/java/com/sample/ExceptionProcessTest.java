package com.sample;

import junit.framework.TestCase;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

public class ExceptionProcessTest extends TestCase {

	public void testExceptionProcess() throws Exception {

		// Extract a process definition from the processdefinition.xml file.
		ProcessDefinition processDefinition = ProcessDefinition.parseXmlResource("exception/processdefinition.xml");
		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		ProcessInstance instance = new ProcessInstance(processDefinition);
		assertEquals(
				"Instance is in start state", 
				"start",
				instance.getRootToken().getNode().getName());
		
		assertNull(
				"Message variable should not exist yet", 
				instance.getContextInstance().getVariable("message"));

		/* 
		   This signal, which will initiate the flow within the process instance, 
		   is purposely setup to cause a RunTimeException error. However, this is being
		   caught by the RuntimeExceptionAction class, which will create and set a 
		   process variable called errorMsg.
		*/
		instance.signal();

		// Let's check whether the RuntimeExceptionAction class has caught the error
		// and set errorMsg variable.
		assertEquals (
				"errorMsg variable should have been populated",
				"A runtime error has occurred in node",
				instance.getContextInstance().getVariable("errorMsg"));
		
		// Should be at the "first" node in the process flow
		assertEquals (
				"Should be at the first node",
				"first",
				instance.getRootToken().getNode().getName());
		/* 
		    At this point, even though an error was purposely thrown by the MessageActionHandlerExc2
		    class, which was subsequently caught by the RuntimeExceptionAction class, the process
		    flow is not directly impacted (since the error was caught). As such, we can move the
		    flow forward to the state node called "second" (see the exception diagram). When
		    we do move forward, there is a transition action handler, MessageActionHandlerExc, that
		    will throw a ParseException exception. Similar to the the start node, the 
		    ParseExceptionAction exception handler will catch such an error.		    
		 */
		instance.signal();
		
		assertEquals (
				"errorMsg variable should have been populated",
				"A parse exception error has occurred in node",
				instance.getContextInstance().getVariable("errorMsg"));
		
		assertEquals (
				"Should be at the second node",
				"second",
				instance.getRootToken().getNode().getName());
		
		/* 
		 	When we signal next, we will depart the second node, and a transaction action
		 	will be fired, MessageActionHandlerExc3, that will generate a GeneralSecurityException
		 	error. Unlike the other nodes, this time there is no specific exception handler 
		 	designed to catch that error. However, there is a "catch-all" exception handler
		 	defined at the root of the process:
		 		<exception-handler exception-class="java.lang.Exception">
		           <action name="ExceptionAction" class="com.sample.action.ExceptionAction"></action>
	            </exception-handler>
	        And this will catch this exception. 
		 */
		instance.signal();
		
		// The exception variable is set by the general purpose ExceptionAction exception 
		// handler
		
		assertEquals (
				"errorMsg variable should have been populated",
				"GeneralSecurityException",
				instance.getContextInstance().getVariable("exception"));
		
		assertEquals (
				"Should be at the end node",
				"end",
				instance.getRootToken().getNode().getName());
	}

}

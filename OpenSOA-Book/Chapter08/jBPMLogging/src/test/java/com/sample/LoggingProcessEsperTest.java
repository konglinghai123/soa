package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.TestCase;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.context.log.VariableCreateLog;
import org.jbpm.db.LoggingSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.graph.log.NodeLog;
import org.jbpm.graph.log.SignalLog;
import org.jbpm.logging.exe.LoggingInstance;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.svc.Services;

public class LoggingProcessEsperTest extends TestCase {
    private JbpmContext jbpmContext = null;
    private JbpmConfiguration jbpmConfiguration = null;
    private ProcessInstance instance = null;
    private ProcessDefinition processDefinition = null;
	private static String SIGNAL_LOG="org.jbpm.graph.log.SignalLog";
	private static String NODE_LOG="org.jbpm.graph.log.NodeLog";
	private static String TRANSITION_LOG="org.jbpm.graph.log.TransitionLog";
	private static String ACTION_LOG="org.jbpm.graph.log.ActionLog";
	private static String PROCESS_INSTANCE_CREATE_LOG="org.jbpm.graph.log.ProcessInstanceCreateLog";
	private static String VARIABLE_CREATE_LOG="org.jbpm.context.log.VariableCreateLog";
	private static String VARIABLE_INSTANCE_UPDATE_LOG="org.jbpm.context.log.variableinstance.StringUpdateLog";
	private static String PROCESS_INSTANCE_END_LOG="org.jbpm.graph.log.ProcessInstanceEndLog";

	public void testSimpleProcess() throws Exception {

		assertNotNull("Definition should not be null", processDefinition);

		// Create an instance of the process definition.
		//instance = new ProcessInstance(processDefinition);
		System.out.println("Process instance is: " + instance.getId());
		assertEquals(
				"Instance is in start state", 
				instance.getRootToken().getNode().getName(), 
				"start");
		assertNull(
				"Message variable should not exist yet", 
				instance.getContextInstance().getVariable("message"));

		// check the transition log (from the start state to the state)
	    LoggingInstance loggingInstance = instance.getLoggingInstance();
	   // List processLogs = loggingInstance.getLogs(ProcessInstanceCreateLog.class);
	    
	    showLogInfo("At start", loggingInstance);
	    
	    //assertEquals(1, processLogs.size());

	    // ProcessInstanceCreateLog processInstanceCreateLog = (ProcessInstanceCreateLog) processLogs.get(0);
	   // System.out.println("processInstanceCreateLog: " + processInstanceCreateLog.);
		instance.signal();
		assertEquals(
				"Instance is in first state", 
				instance.getRootToken().getNode().getName(), 
				"first");
		assertEquals(
				"Message variable contains message", 
				instance.getContextInstance().getVariable("message"),
				"Going to the first state!");

		showLogInfo("In first state", loggingInstance);
		
		Thread.sleep(6000);
		// Move the process instance to the end state. The configured action 
		// should execute again. The message variable contains a new value.
		instance.signal();
		assertEquals(
				"Instance is in end state", 
				instance.getRootToken().getNode().getName(), 
				"end");
		assertTrue("Instance has ended", instance.hasEnded());
		assertEquals(
				"Message variable is changed", 
				instance.getContextInstance().getVariable("message"),
				"About to finish!");
		showLogInfo("In end state", loggingInstance);
		
		
		// use second method to retrieve logs, LoggingSession
		jbpmContext.save(instance);
		LoggingSession loggingSession = jbpmContext.getLoggingSession();
		Map logMap = loggingSession.findLogsByProcessInstance(instance.getId());
		Map.Entry entry = (Entry) logMap.entrySet().iterator().next();
		ArrayList<Object> sessionLogs = ((ArrayList) entry.getValue());
		
		for (Iterator<Object> i = sessionLogs.iterator(); i.hasNext();) {
		  System.out.println("Log is: " + i.next().getClass().getName());
		}
		System.out.println("All done...");
		jbpmContext.close();
	}
	
	private void showLogInfo(String key, LoggingInstance loggingInstance) {
	    List<Object> logs = loggingInstance.getLogs();
	    Object obj;
	    SignalLog signalLog;
	    NodeLog nodeLog;
	    VariableCreateLog varCreateLog;
	    
	    for (Iterator<Object> i = loggingInstance.getLogs().iterator(); i.hasNext();) {
	    	obj = i.next();
	    	System.out.println("Logtype is: " + obj.getClass().getName());
	    	System.out.println("KEY: " + key);
	    	if (obj.getClass().getName().equals(SIGNAL_LOG)) {
	    		signalLog = (SignalLog) obj;
	    		System.out.println("    SignalLog: Token Fullpath: " + signalLog.getToken().getFullName());
	    		System.out.println("    SignalLog: Node Name: " + signalLog.getTransition().getTo().getName());
	    	} else if (obj.getClass().getName().equals(NODE_LOG)) {
	    		nodeLog = (NodeLog) obj;
	    		System.out.println("    NodeLog: " + nodeLog.getNode().getName());
	    		System.out.println("    NodeLog: Duration: " + nodeLog.getDuration());
	    	} else if (obj.getClass().getName().equals(NODE_LOG)) {
	    		nodeLog = (NodeLog) obj;
	    		System.out.println("    NodeLog: " + nodeLog.getNode().getName());
	    		System.out.println("    NodeLog: Duration: " + nodeLog.getDuration());
	    	} else if (obj.getClass().getName().equals(VARIABLE_CREATE_LOG)) {
	    		varCreateLog = (VariableCreateLog) obj;
	    		System.out.println("    VariableCreateLog: VarName:" + varCreateLog.getVariableInstance().getName());
	    		System.out.println("    VariableCreateLog: Duration: " + varCreateLog.getVariableInstance().getValue());
	    	}
	    	
	    	// use to show all log types
	    	// System.out.println("Key is: " + key + " LogType is: " + obj.getClass().getName() + " " + obj);
	    }
	}
	
   public void setUp() {

	    // setup the jBPM context
	    jbpmConfiguration = JbpmConfiguration.getInstance();
	    DbPersistenceServiceFactory dbPersistenceServiceFactory = (DbPersistenceServiceFactory) jbpmConfiguration
	        .getServiceFactory(Services.SERVICENAME_PERSISTENCE);
	    dbPersistenceServiceFactory.createSchema();
	    deployProcess();

	    jbpmContext = jbpmConfiguration.createJbpmContext();

	    // Create an instance of the process definition
	    instance = jbpmContext.newProcessInstanceForUpdate("logging");

	  }
   
   public void deployProcess() {
     jbpmContext = jbpmConfiguration.createJbpmContext();
     try {
       processDefinition = ProcessDefinition
           .parseXmlResource("logging/processdefinition.xml");
       jbpmContext.deployProcessDefinition(processDefinition);

     } finally {
       jbpmContext.close();
     }
   }
   
   
}

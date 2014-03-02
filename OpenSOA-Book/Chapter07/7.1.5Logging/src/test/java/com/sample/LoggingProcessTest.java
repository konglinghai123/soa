package com.sample;

import java.util.ArrayList;
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
import org.jbpm.graph.log.NodeLog;
import org.jbpm.graph.log.SignalLog;
import org.jbpm.logging.exe.LoggingInstance;
import org.jbpm.logging.log.ProcessLog;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.svc.Services;

public class LoggingProcessTest extends TestCase {
	private static final String SIGNAL_LOG = "org.jbpm.graph.log.SignalLog";
	private static final String NODE_LOG = "org.jbpm.graph.log.NodeLog";
	private static final String VARIABLE_CREATE_LOG = "org.jbpm.context.log.VariableCreateLog";

	private JbpmContext jbpmContext = null;
	private JbpmConfiguration jbpmConfiguration = null;
	private ProcessInstance instance = null;
	private ProcessDefinition processDefinition = null;

	public void testSimpleProcess() throws Exception {

		assertNotNull("Definition should not be null", processDefinition);

		println("Process instance is: " + instance.getId());

		assertEquals("Instance is in start state", "start", instance
				.getRootToken().getNode().getName());

		assertNull("Message variable should not exist yet", instance
				.getContextInstance().getVariable("message"));

		// check the transition log (from the start state to the state)
		LoggingInstance loggingInstance = instance.getLoggingInstance();
		// List processLogs =
		// loggingInstance.getLogs(ProcessInstanceCreateLog.class);

		showLogInfo("At start", loggingInstance);

		instance.signal();

		assertEquals("Instance is in first state", "first", instance
				.getRootToken().getNode().getName());

		assertEquals("Message variable contains message",
				"Going to the first state!", instance.getContextInstance()
						.getVariable("message"));

		showLogInfo("In first state", loggingInstance);

		Thread.sleep(6000);
		// Move the process instance to the end state. The configured action
		// should execute again. The message variable contains a new value.
		instance.signal();

		assertEquals("Instance is in end state", "end", instance.getRootToken()
				.getNode().getName());

		assertTrue("Instance has ended", instance.hasEnded());

		assertEquals("Message variable is changed", "About to finish!",
				instance.getContextInstance().getVariable("message"));
		showLogInfo("In end state", loggingInstance);

		// use second method to retrieve logs, LoggingSession
		jbpmContext.save(instance);
		LoggingSession loggingSession = jbpmContext.getLoggingSession();
		Map logMap = loggingSession.findLogsByProcessInstance(instance.getId());
		Map.Entry entry = (Entry) logMap.entrySet().iterator().next();
		ArrayList<Object> sessionLogs = ((ArrayList) entry.getValue());

		for (Object log : sessionLogs) {
			println("Log is: " + log.getClass().getName());
		}
		println("All done...");
		jbpmContext.close();
	}

	private void showLogInfo(String key, LoggingInstance loggingInstance) {
		List<ProcessLog> logs = loggingInstance.getLogs();
		SignalLog signalLog;
		NodeLog nodeLog;
		VariableCreateLog varCreateLog;

		for (Object obj : logs) {
			println("Logtype is: " + obj.getClass().getName());
			println("KEY: " + key);
			if (obj.getClass().getName().equals(SIGNAL_LOG)) {
				signalLog = (SignalLog) obj;
				println("    SignalLog: Token Fullpath: "
						+ signalLog.getToken().getFullName());
				println("    SignalLog: Node Name: "
						+ signalLog.getTransition().getTo().getName());
			} else if (obj.getClass().getName().equals(NODE_LOG)) {
				nodeLog = (NodeLog) obj;
				println("    NodeLog: " + nodeLog.getNode().getName());
				println("    NodeLog: Duration: " + nodeLog.getDuration());
			} else if (obj.getClass().getName().equals(NODE_LOG)) {
				nodeLog = (NodeLog) obj;
				println("    NodeLog: " + nodeLog.getNode().getName());
				println("    NodeLog: Duration: " + nodeLog.getDuration());
			} else if (obj.getClass().getName().equals(VARIABLE_CREATE_LOG)) {
				varCreateLog = (VariableCreateLog) obj;
				println("    VariableCreateLog: VarName:"
						+ varCreateLog.getVariableInstance().getName());
				println("    VariableCreateLog: Duration: "
						+ varCreateLog.getVariableInstance().getValue());
			}

			// use to show all log types
			// println("Key is: " + key + " LogType is: " + obj.getClass().getName() + " " + obj);
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

	private void println(String message) {
		System.out.println(message);
	}

}

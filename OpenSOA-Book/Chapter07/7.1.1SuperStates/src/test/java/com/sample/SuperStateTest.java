package com.sample;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.svc.Services;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class SuperStateTest extends TestCase {

  Token token;
  TaskMgmtSession taskMgmtSession;
  TaskInstance taskInstance;
  JbpmContext jbpmContext = null;
  JbpmConfiguration jbpmConfiguration = null;
  ProcessInstance instance = null;
  ProcessDefinition processDefinition = null;

  public void testSimpleProcess() throws Exception {

    // Verify that the definition is loaded property
    assertNotNull(
    		"Definition should not be null", 
    		processDefinition);

    // Create taskMgmtSession, which we'll use later
    taskMgmtSession = jbpmContext.getTaskMgmtSession();

    assertEquals(
    		"Instance is in start state", 
    		"start",
    		instance.getRootToken().getNode().getName());

    // Move the process instance from its start state to the first state, fork1
    instance.signal();
    assertEquals(
    		"Instance is in fork1 state", 
    		"fork1",
    		instance.getRootToken().getNode().getName());

    // We should now be entered into the various superstates, finance, hr and
    // security. To do this,
    // we'll need to identify the tokens which result from the fork.
    instance.signal();

    token = instance.findToken("/to-finance");

    assertEquals(
    		processDefinition.findNode("finance/appr timecard").toString(), 
    		token.getNode().toString());

    // The variable financeVar is set via a superstate-enter event script action
    // (see definition).
    assertEquals(
    	"Variable financeVar should be set", 
    	"finance val",
    	instance.getContextInstance().getVariable("financeVar"));

    List<TaskInstance> taskInstances = taskMgmtSession
        .findTaskInstancesByToken(token.getId());

    for (Iterator<TaskInstance> iter = taskInstances.iterator(); iter.hasNext();) {
      taskInstance = iter.next();
    }

    // Verify the single taskInstance is approve_timecard_task
    assertEquals(
    		"Task approve_timecard_task should be present", 
    		 "approve_timecard_task",
    		 taskInstance.getName());
    // Close the task
    //

    taskInstance.end();
    
    System.out.println("token: " + token.getName());
    token.signal("to_join1");
    
    // This token should be completed and in the join1 join node
    assertEquals(
    		"Task should be in join1 (join) node", 
    		"join1",
    		token.getNode().getName());

    /*
     * System.out.println("tokenn: " + token.getFullName());
     * 
     * List<Token> tokens = instance.findAllTokens(); for (Iterator<Token>
     * iter = tokens.iterator(); iter.hasNext();) { token = iter.next();
     * System.out.println("token: " + token.getName()) ; }
     */
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
    instance = jbpmContext.newProcessInstanceForUpdate("employee-termination");

  }

  public void deployProcess() {
    jbpmContext = jbpmConfiguration.createJbpmContext();
    try {
      processDefinition = ProcessDefinition
          .parseXmlResource("employeeTermination/processdefinition.xml");
      jbpmContext.deployProcessDefinition(processDefinition);

    } finally {
      jbpmContext.close();
    }
  }
}
package opensoa.book.chapter721;

import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.db.TaskMgmtSession;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.svc.Services;
import org.jbpm.taskmgmt.exe.TaskInstance;

public class SCAClientSOAPTest extends TestCase {

  Token token;
  TaskMgmtSession taskMgmtSession;
  TaskInstance taskInstance;
  JbpmContext jbpmContext = null;
  JbpmConfiguration jbpmConfiguration = null;
  ProcessInstance instance = null;
  ProcessDefinition processDefinition = null;

  public void testSimpleProcess() throws Exception {
    
    assertNotNull("Definition should not be null", processDefinition);

    assertEquals(
    		"Instance is in start state", 
    		"start",
    		instance.getRootToken().getNode().getName());

    instance.signal();
    
    assertEquals(
    		"Instance is in first state", 
    		"create-ticket",
    		instance.getRootToken().getNode().getName());

    token = instance.findToken("/");
    
    assertNotNull(
    		"root token should not be null", 
    		token);
    
    List<TaskInstance> taskInstances = taskMgmtSession.findTaskInstancesByToken(token.getId());
    
    assertEquals(
    		"Should only be one task instance",
    		1,
    		taskInstances.size());
    
    taskInstance = taskInstances.iterator().next();
    taskInstance.addVariables(populateTestData());
    taskInstance.end();
    
    assertEquals(
    		"Name should be John Doe", 
    		"John Doe",
    		instance.getContextInstance().getVariable("name"));
   
    assertEquals(
    		"Instance is in end state", 
    		"end",
    		instance.getRootToken().getNode().getName());
    
    assertNotNull(
    		"Case number should now be populated", 
    		instance.getContextInstance().getVariable("caseNum"));
    
    assertTrue(
    		"Instance has ended", 
    		instance.hasEnded());

    System.out.println("** Case number is: " + instance.getContextInstance().getVariable("caseNum"));
  }
  
  public void setUp() {

    // setup the jBPM context
    jbpmConfiguration = JbpmConfiguration.getInstance();
    DbPersistenceServiceFactory dbPersistenceServiceFactory = 
      (DbPersistenceServiceFactory) jbpmConfiguration
        .getServiceFactory(Services.SERVICENAME_PERSISTENCE);
    dbPersistenceServiceFactory.createSchema();
    deployProcess();

    jbpmContext = jbpmConfiguration.createJbpmContext();

    // Create an instance of the process definition
    instance = jbpmContext.newProcessInstanceForUpdate("scaSOAP");
    // Create taskMgmtSession, which we'll use later
    taskMgmtSession = jbpmContext.getTaskMgmtSession();
    
  }

  private void deployProcess() {
    jbpmContext = jbpmConfiguration.createJbpmContext();
    try {
      processDefinition = ProcessDefinition
          .parseXmlResource("scaSOAP/processdefinition.xml");
      jbpmContext.deployProcessDefinition(processDefinition);

    } finally {
      jbpmContext.close();
    }
  }

  private HashMap<String, Object> populateTestData() {
    HashMap<String, Object> vals = new HashMap<String, Object>();
    vals.put("name", "John Doe");
    vals.put("emailAddress", "jdoe@someplace.com");
    vals.put("title", "description of problem");
    vals.put("details","details of problem");
    vals.put("source", "customer");
    
    return vals;
  }
}

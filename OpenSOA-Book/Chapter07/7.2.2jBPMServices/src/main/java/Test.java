import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jbpm.JbpmConfiguration;
import org.jbpm.JbpmContext;
import org.jbpm.command.AbstractGetObjectBaseCommand;
import org.jbpm.db.GraphSession;
import org.jbpm.graph.def.Node;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.def.Transition;
import org.jbpm.persistence.db.DbPersistenceServiceFactory;
import org.jbpm.taskmgmt.exe.TaskMgmtInstance;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.jbpm.graph.node.State;
import org.jbpm.identity.Entity;
import org.jbpm.identity.hibernate.IdentitySession;
import org.jbpm.identity.xml.IdentityXmlParser;


public class Test extends AbstractGetObjectBaseCommand {

	JbpmContext jbpmContext = null;

	TaskMgmtInstance taskMgmtInstance = null;

	JbpmConfiguration jbpmConfiguration = null;
	
	GraphSession graphSession = null;
	
	private transient boolean firstExpression = true;
	
	public static void main(String[] args) {
		Test manage = new Test();
		
		// while good idea in concept, I can never get it to work with anything other than jbpm.cfg.xml
		manage.setUp("jbpm.cfg.xml");
		
		//manage.createProcessInstance("simple/processdefinition.xml");
		
		manage.test("jbpm.cfg.xml");
		
		
		manage.jbpmContext.close();
	}
	
	public void setUp(String config) {
		// setup the jBPM context
		jbpmConfiguration = JbpmConfiguration.getInstance(config);
		DbPersistenceServiceFactory dbPersistenceServiceFactory = (DbPersistenceServiceFactory) jbpmConfiguration
				.getServiceFactory(org.jbpm.svc.Services.SERVICENAME_PERSISTENCE);
				
		//dbPersistenceServiceFactory.createSchema();
		
		jbpmConfiguration = JbpmConfiguration.getInstance(config);
		
		jbpmContext = jbpmConfiguration.createJbpmContext();
		
		graphSession = jbpmContext.getGraphSession();
		
		//loadIdentities();
		
	}
	
    private String getConcatExpression() {
        if (firstExpression) {
            firstExpression = false;
            return " where ";
        }
        return " and ";
    }
    
    public List retrieveProcessInstanceDetails(List processInstanceList) {
        Iterator it = processInstanceList.iterator();
        while (it.hasNext()) {
            retrieveProcessInstance((ProcessInstance) it.next());
        }
        return processInstanceList;
    }
	
	public void test(String config) {
		
		ProcessDefinition processDef = jbpmContext.getGraphSession().getProcessDefinition(15);
		
		State st = null;
		
		//System.out.println("processDef: " + processDef.getNode("Criminal-Tracers").getClass().getName());
		
	
		ProcessInstance instance = jbpmContext.getGraphSession().getProcessInstance(109);
		
		List<Token> tokens = instance.findAllTokens();
		
		
		Token token;
	token = instance.findToken("/employment");
	System.out.println("token: " + token.getFullName());
	Node node = token.getNode();
	//instance.getContextInstance().createVariable("mytest2","dddd", token);
	System.out.println("Vars: " + node.getName());
	ExecutionContext executionContext = new ExecutionContext(token);
	node.leave(executionContext, "return");
	//Iterator it = instance.getTaskMgmtInstance().getTaskInstances().iterator();
	
	/*
	TaskInstance ti;
	for (Iterator<TaskInstance> iter = instance.getTaskMgmtInstance().getTaskInstances().iterator(); iter.hasNext();) {
		ti = iter.next();
		System.out.println("ti: " + ti.getName() + " vars: " + ti.getVariable("mytest2"));
		
	}
	*/
	//it.next();
	//System.out.println("Vars: " + ((TaskInstance) it.next()).getName());
	//instance.getContextInstance().createVariable("mytest2", new String("ddddd"), token);
		//token.h
		//Object obj = HibernateProxyHelper.getClassWithoutInitializingProxy(instance.getProcessDefinition().getNode("Criminal-Tracers"));
		//State st = null;
		//System.out.println("process: " +  instance.getProcessDefinition().getNode("Criminal-Tracers").getClass().isAssignableFrom(st.getClass()));
		Set <Transition> transitions;
		Transition transition;
		for (Iterator<Token> i = tokens.iterator(); i.hasNext();) {
			token = i.next();
			
			System.out.println("Token: " + token.getFullName() + " " + token.hasEnded());
			if (token.getNode().getName().equals("Criminal-NCDB")) {
				System.out.println("HERE!");
				
			//	token.addComment("test comment");
			//	token.signal("t5");
				//token.
				/*
				transitions = token.getAvailableTransitions();
				for (Iterator<Transition> tokenIter = transitions.iterator(); tokenIter.hasNext();) {
					transition = tokenIter.next();
					System.out.println("Transition is: " + transition.getName());
				}
				*/
				//token.
			}
			//Transition tran;
			//tran = (Transition) token.getAvailableTransitions().iterator().next();
			//System.out.println(tran.getFrom().g);
			//System.out.println(token.getNode() instanceof State);
//			/token.
		}
	}
	
	public void createProcessInstance(String processName) {
		/* Loading the latest version of a process definition, instead of creating a new version on one */
		ProcessDefinition definition = graphSession.findLatestProcessDefinition(processName);
		
		if (definition == null) {
			try {
				definition = ProcessDefinition.parseXmlResource("simple/processdefinition.xml");
				
				jbpmContext.deployProcessDefinition(definition);
			} catch (Exception e) {
				System.out.println("Unable to find process definition file: " + "simple" + "/processdefinition.xml");
			}			
		}
	}
	
	public void loadIdentities() {
		
		try {
			Entity[] et = IdentityXmlParser.parseEntitiesResource("identities-ht.xml");
			IdentitySession id = new IdentitySession(jbpmContext.getSession());
			for (int i = 0; i < et.length; i++) {
				id.saveEntity(et[i]);
			}
		} finally {
		}
	}

	public Object execute(JbpmContext jbpmContext) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}

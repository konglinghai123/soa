package opensoa.drools.tests;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import opensoa.drools.hellodrools117.HelloDroolsMainRuleFlow;
import opensoa.drools.hellodrools117.Person;
import org.drools.*;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
import org.drools.runtime.rule.FactHandle;
import junit.framework.TestCase;

public class Test11_7 extends TestCase {

	public void testMr() throws Exception {
		
    	//load up the rulebase
        final RuleBase ruleBase = readRule();
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        List results = new ArrayList();

        wm.setGlobal( "results", results );

        Person person = new Person ( "John Doe", 22, "M" );
        
        final FactHandle personFH = wm.insert( person );
        
        // start ruleflow
		wm.startProcess("opensoa.drools.hellodrools");
		
        wm.fireAllRules();  
        
        assertEquals( 
        		1, 
        		results.size() );
        
        assertEquals(
        		"Should be a Mr",
        		"Mr.",
        		results.get(0).toString());
        
		QueryResult qresult;
		QueryResults qresults = wm.getQueryResults("personQuery");
		Iterator it = (Iterator) qresults.iterator();
		Person p = null;
		
		while (it.hasNext()) {
			qresult = ( QueryResult ) it.next();
			p = (Person) qresult.get("person");
		}
		
		// check from query now
        assertEquals(
        		"Should be a Mr",
        		"Mr.",
        		p.getSalutation());

	}
	
	public void testMrs() throws Exception {
		
    	//load up the rulebase
        final RuleBase ruleBase = readRule();
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        List results = new ArrayList();

        wm.setGlobal( "results", results );

        Person person = new Person ( "John Doe", 22, "F" );
        
        final FactHandle personFH = wm.insert( person );
        
        // start ruleflow
		wm.startProcess("opensoa.drools.hellodrools");
		
        wm.fireAllRules();  
        
        assertEquals( 
        		1, 
        		results.size() );
        
        assertEquals(
        		"Should be a Mrs",
        		"Mrs.",
        		results.get(0).toString());
        
		QueryResult qresult;
		QueryResults qresults = wm.getQueryResults("personQuery");
		Iterator it = (Iterator) qresults.iterator();
		Person p = null;
		
		while (it.hasNext()) {
			qresult = ( QueryResult ) it.next();
			p = (Person) qresult.get("person");
		}
		
		// check from query now
        assertEquals(
        		"Should be a Mr",
        		"Mrs.",
        		p.getSalutation());
        
	}	
	private static RuleBase readRule() throws Exception {

		//read in the source
		Reader source = new InputStreamReader( HelloDroolsMainRuleFlow.class.getResourceAsStream( "/HelloDroolsRuleFlow.drl" ) );
		
		//Use package builder to build up a rule package.
		PackageBuilder builder = new PackageBuilder();

		/* rule flow setup follows */
		Reader flowsource = new InputStreamReader(
				HelloDroolsMainRuleFlow.class.getResourceAsStream("/HelloWorld.rf"));
		
		builder.addProcessFromXml(flowsource);
		
		//this will parse and compile in one step
		builder.addPackageFromDrl( source );

		//get the compiled package (which is serializable)
		Package pkg = builder.getPackage();
		
		//add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		return ruleBase;
	}
}

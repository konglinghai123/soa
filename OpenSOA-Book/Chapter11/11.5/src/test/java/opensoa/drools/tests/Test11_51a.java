package opensoa.drools.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import opensoa.drools.hellodrools115.Person;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.DrlParser;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderConfiguration;
import org.drools.lang.descr.PackageDescr;
import org.drools.rule.Package;
import org.drools.runtime.rule.Activation;
import org.drools.runtime.rule.FactHandle;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Test11_51a extends TestCase {

	
    protected RuleBase getRuleBase() throws Exception {
        return RuleBaseFactory.newRuleBase( RuleBase.RETEOO,
                                            null );
    }


	private RuleBase loadRuleBase(final Reader reader) throws IOException,
			DroolsParserException, Exception {
		return loadRuleBase(reader, new PackageBuilderConfiguration());
	}

	private RuleBase loadRuleBase(final Reader reader,
			final PackageBuilderConfiguration conf) throws IOException,
			DroolsParserException, Exception {
		
		final DrlParser parser = new DrlParser();
		final PackageDescr packageDescr = parser.parse(reader);
		if (parser.hasErrors()) {
			System.out.println(parser.getErrors());
			Assert.fail("Error messages in parser, need to sort this our (or else collect error messages)");
		}
		// pre build the package
		final PackageBuilder builder = new PackageBuilder(conf);
		builder.addPackage(packageDescr);
		final Package pkg = builder.getPackage();

		// add the package to a rulebase
		RuleBase ruleBase = getRuleBase();
		ruleBase.addPackage(pkg);

		return ruleBase;
	}

	public void testHelloWorld() throws Exception {
		
		final Reader reader = new InputStreamReader(getClass()
				.getResourceAsStream("/HelloDroolsAgendaGroupExample.drl"));
		
		final RuleBase ruleBase = loadRuleBase(reader);
		
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        List results = new ArrayList();

        wm.setGlobal( "results", results );

        Person person = new Person ( "John Doe", 22, "M" );
        
        final FactHandle personFH = wm.insert( person );
        
        Activation[] activations = wm.getAgenda().getActivations();
        
        // Check whether DateEffectiveTest was fired first, as it should be
        // based on it's saliance value of 100.
        assertEquals(
        		"Rule name match",
        		"DateEffectiveTest",
        		activations[0].getRule().getName());    
        
        // Check for the presence of the agenda groups
        assertEquals(
        		"Agenda Group Test",
        		"Mr",
        		wm.getAgenda().getAgendaGroup("Mr").getName());  
        
        assertEquals(
        		"Agenda Group Test",
        		"Mrs",
        		wm.getAgenda().getAgendaGroup("Mrs").getName());  
        
        wm.fireAllRules();  
        
        assertEquals( 
        		3, 
        		results.size() );
        
        // The HelloMr rule retracts the fact, so verify it's no longer in working memory
        assertNull("No fact handle should exist",
        		wm.getFactHandle(person));
        
        // We'll now check out the 2nd agenda group by inserting a female person
        person.setGender("F");
        wm.insert( person );
        
        // clear out existing results
        results = new ArrayList();
        wm.setGlobal( "results", results );
        
        wm.fireAllRules();  
        
        assertEquals( 
        		3, 
        		results.size() );
	}
}

package opensoa.drools.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.drools.runtime.rule.FactHandle;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Test11_53 extends TestCase {

	
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
				.getResourceAsStream("/HelloDroolsInsert.drl"));
		
		final RuleBase ruleBase = loadRuleBase(reader);
		
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();
        wm.setGlobal( "results", results );
        
        Integer flag = new Integer(0);
        wm.setGlobal( "flag", flag );

        Person person = new Person ( "John Doe", 22, "M" );
        
        final FactHandle personFH = wm.insert( person );
          
        wm.fireAllRules();  
        
        // only 2 rules should fire, because flag == 0
        assertEquals( 
        		2, 
        		results.size() );
        
        // the "Insert" rule should not have been fired
        assertFalse(
        		"Rule should not be fired",
        		checkRule(results, "Insert"));
	}
	
	public void testHelloWorld2() throws Exception {
		
		final Reader reader = new InputStreamReader(getClass()
				.getResourceAsStream("/HelloDroolsInsert.drl"));
		
		final RuleBase ruleBase = loadRuleBase(reader);
		
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();
        wm.setGlobal( "results", results );
        
        Integer flag = new Integer(1);
        wm.setGlobal( "flag", flag );

        Person person = new Person ( "John Doe", 22, "M" );
        
        final FactHandle personFH = wm.insert( person );
          
        wm.fireAllRules();  
        
        // 3 rules should fire cause flag == 1
        assertEquals( 
        		3, 
        		results.size() );
        
        // the "Insert" rule should not have been fired
        assertTrue(
        		"Rule should be fired",
        		checkRule(results, "Insert"));
        
	}
	
	public Boolean checkRule(List results, String rule) {
		
		String ruleName = null;
		for (Iterator iter = results.iterator(); iter.hasNext(); ) {	
			ruleName = iter.next().toString();
			if (ruleName.equalsIgnoreCase(rule)) 
				return true;
		}
		
		return false;
	}
}

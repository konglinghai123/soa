package opensoa.drools.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import opensoa.drools.hellodrools115.Person;
import opensoa.drools.hellodrools115.ZipCode;

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

public class Test11_52 extends TestCase {

	
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
				.getResourceAsStream("/HelloDroolsOperators.drl"));
		
		final RuleBase ruleBase = loadRuleBase(reader);
		
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();

        wm.setGlobal( "results", results );
        
        populateWorkingMemory(wm);
        
        wm.fireAllRules();  
        
        assertEquals( 
        		31, 
        		results.size() );
        
	}
	
	private void populateWorkingMemory(WorkingMemory workingMemory) {
        
        ArrayList<String> topInterests = new ArrayList<String>();
        topInterests.add("Golf");
        topInterests.add("Tennis");
        topInterests.add("Walking");
        topInterests.add("Reading");
        topInterests.add("Underwater Basket Weaving");
        
        workingMemory.setGlobal("topInterests", topInterests);
        
        ArrayList<String> interests = new ArrayList<String>();
        interests.add("Reading");
        interests.add("Golf");
        interests.add("Hacking");
        
        Person person = new Person ( "John Doe", 22, "M", interests );
        person.setFavoriteInterest("Golf");
        person.setHomeZip(80920);
        
        workingMemory.insert( person );
        addSomeZips ( workingMemory );
        
        workingMemory.fireAllRules();  
        
        interests = new ArrayList<String>();
        interests.add("Jogging");
        interests.add("Biking");
        interests.add("Mathmatics");
        
        person = new Person ( "Jane Dowdy", 24, "F", interests );
        person.setFavoriteInterest("Tennis");
        person.setHomeZip(54116);
        workingMemory.insert( person );
        workingMemory.fireAllRules();   
	}
	
	private static void addSomeZips(WorkingMemory wm) {
		ZipCode zip = new ZipCode("Colorado Springs", "CO", 80920);
		wm.insert(zip);
		zip = new ZipCode ("Denver", "CO", 80012);
		wm.insert(zip);
		zip = new ZipCode ("Oceanside", "CA", 92057);
		wm.insert(zip);
		zip = new ZipCode ("Green Bay", "WI", 54115);
		wm.insert(zip);
		
	}
}

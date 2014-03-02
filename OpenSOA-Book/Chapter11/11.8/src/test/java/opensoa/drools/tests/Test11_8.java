package opensoa.drools.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import opensoa.drools.hellodrools118.HelloDroolsMainDSL;
import opensoa.drools.hellodrools118.Person;
import opensoa.drools.hellodrools118.ZipCode;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
import junit.framework.TestCase;

public class Test11_8 extends TestCase {

	public void testDSLJohnDoe() throws Exception {
		
    	//load up the rulebase
        RuleBase ruleBase = readRule();
        WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();
        wm.setGlobal( "results", results );

        populateWorkingMemory1(wm);
        
        assertEquals( 
        		3, 
        		results.size() );
        
	}
	
	public void testDSLJaneDowdy() throws Exception {
		
    	//load up the rulebase
        RuleBase ruleBase = readRule();
        WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();
        wm.setGlobal( "results", results );

        populateWorkingMemory2(wm);
        
        assertEquals( 
        		1, 
        		results.size() );
        
	}
	
	private static RuleBase readRule() throws Exception {

		//read in the source
		Reader source = new InputStreamReader( HelloDroolsMainDSL.class.getResourceAsStream( "/HelloWorld.dslr" ) );
		Reader DSLsource = new InputStreamReader( HelloDroolsMainDSL.class.getResourceAsStream( "/helloworld.dsl" ) );
		
		//Use package builder to build up a rule package.
		PackageBuilder builder = new PackageBuilder();

		//this will parse and compile in one step
		builder.addPackageFromDrl( source, DSLsource );

		//get the compiled package (which is serializable)
		Package pkg = builder.getPackage();
		
		//add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		return ruleBase;
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
	
	private void populateWorkingMemory1(WorkingMemory workingMemory) {
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
          
	}
	
	private void populateWorkingMemory2(WorkingMemory workingMemory) {
        ArrayList<String> topInterests = new ArrayList<String>();
        topInterests.add("Golf");
        topInterests.add("Tennis");
        topInterests.add("Walking");
        topInterests.add("Reading");
        topInterests.add("Underwater Basket Weaving");
        
        workingMemory.setGlobal("topInterests", topInterests);
        
        ArrayList<String> interests = new ArrayList<String>();
        interests.add("Jogging");
        interests.add("Biking");
        interests.add("Mathmatics");
        
        Person person = new Person ( "Jane Dowdy", 24, "F", interests );
        person.setFavoriteInterest("Tennis");
        person.setHomeZip(54116);
        
        workingMemory.insert( person );
        addSomeZips ( workingMemory );
        
        workingMemory.fireAllRules(); 
        
	}
}

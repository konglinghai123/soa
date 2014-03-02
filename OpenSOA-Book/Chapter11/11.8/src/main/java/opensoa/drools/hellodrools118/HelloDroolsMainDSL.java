package opensoa.drools.hellodrools118;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.drools.*;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;

public class HelloDroolsMainDSL {

    public static final void main(String[] args) {
        try {
        	
        	//load up the rulebase
            RuleBase ruleBase = readRule();
            WorkingMemory workingMemory = ruleBase.newStatefulSession();
            
            final List results = new ArrayList();

            workingMemory.setGlobal( "results", results );
            
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
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
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
}

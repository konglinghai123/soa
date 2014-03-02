package opensoa.drools.hellodrools115;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.drools.*;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
import org.drools.runtime.rule.FactHandle;

public class HelloDroolsMainInsert {

    public static final void main(String[] args) {
        try {
        	
        	//load up the rulebase
            RuleBase ruleBase = readRule();
            WorkingMemory workingMemory = ruleBase.newStatefulSession();

            Person person = new Person ( "John Doe", 22, "M" );
            
            final List results = new ArrayList();
            workingMemory.setGlobal( "results", results );
            
            Integer flag = new Integer(0);
            workingMemory.setGlobal( "flag", flag );
            
            FactHandle personFH = workingMemory.insert( person );
            workingMemory.fireAllRules(); 
    		
    		for (Iterator iter = workingMemory.iterateFactHandles(); iter.hasNext(); ) {	 
    			System.out.println("iter: " + iter.next());
    		}
    		
    		workingMemory.retract( personFH );
    		flag = 1;
    		workingMemory.setGlobal( "flag", flag );
    		person.setName("John Doe"); // have to set name back cause it was modified in wm
    		workingMemory.insert( person );
    		workingMemory.fireAllRules(); 
    		
    		for (Iterator iter = workingMemory.iterateFactHandles(); iter.hasNext(); ) {	 
    			System.out.println("iter2: " + iter.next());
    		}
    		
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

	private static RuleBase readRule() throws Exception {

		//read in the source
		Reader source = new InputStreamReader( HelloDroolsMainInsert.class.getResourceAsStream( "/HelloDroolsInsert.drl" ) );
		
		//Use package builder to build up a rule package.
		PackageBuilder builder = new PackageBuilder();

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

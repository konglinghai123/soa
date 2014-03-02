package opensoa.drools.hellodrools117;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.drools.*;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;

public class HelloDroolsMainRuleFlow {

    public static final void main(String[] args) {
        try {
        	
        	//load up the rulebase
            RuleBase ruleBase = readRule();
            WorkingMemory workingMemory = ruleBase.newStatefulSession();

            final List results = new ArrayList();

            workingMemory.setGlobal( "results", results );
            
            Person person = new Person ( "John Doe", 22, "M" );
            
            workingMemory.insert( person );
            
    		// start ruleflow
    		workingMemory.startProcess("opensoa.drools.hellodrools");

            workingMemory.fireAllRules();   
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
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

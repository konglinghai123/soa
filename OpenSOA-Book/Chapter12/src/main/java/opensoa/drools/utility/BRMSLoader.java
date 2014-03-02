package opensoa.drools.utility;

import opensoa.drools.dto.Order;

import org.drools.WorkingMemory;

public class BRMSLoader {

	public static final void main(String[] args) throws Exception {
		WorkingMemory workingMemory = SessionHelper.getSession();
		
		SessionHelper.loadNVWorkingMemory(workingMemory);
		
		
		// load Order details
		LoadData ld = new LoadData();
		Order order = ld.loadOrders("../../../sample/order-gold-usd.xml");	
		workingMemory.insert( order );
		
		// start ruleflow
		workingMemory.startProcess("opensoa.drools.pricing");
		
		// fire the rule engine
		workingMemory.fireAllRules();  
		
		// display the results, and this also cleans up volatile mem objects
		//SessionHelper.showResults(workingMemory); 
	}
	
}

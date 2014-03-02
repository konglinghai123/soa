package opensoa.drools.utility;

import java.util.ArrayList;
import java.util.List;

import opensoa.drools.dto.Order;

import org.drools.WorkingMemory;

public class EmbeddedDrools {

	public static final void main(String[] args) {
		try {

			//load up the rulebase
			WorkingMemory workingMemory = SessionHelper.getEmbeddedSessionDRL();
			
			// load non-volatile data 
			SessionHelper.loadNVWorkingMemory(workingMemory);
			
			// run the engine with the provided order
			runEngine("../../../sample/order-gold-euro-qty-discount.xml", workingMemory);
			
			runEngine("../../../sample/order-gold-usd.xml", workingMemory);
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private static void runEngine (String orderFile, WorkingMemory workingMemory) throws Exception {
		
		LoadData ld = new LoadData();
		
        final List priceCalcResults = new ArrayList();
        workingMemory.setGlobal( "price_calc_results", priceCalcResults );
        final List shipmentCalcResults = new ArrayList();
        workingMemory.setGlobal( "shipment_calc_results", shipmentCalcResults );
        final List specialCalcResults = new ArrayList();
        workingMemory.setGlobal( "special_calc_results", specialCalcResults );
        
		// load Order details
		Order order = ld.loadOrders(orderFile);	
		workingMemory.insert( order );
		
		// start ruleflow
		workingMemory.startProcess("opensoa.drools.pricing");

		// fire the rule engine
		workingMemory.fireAllRules(); 
		
		// display the results, and this also cleans up volatile mem objects
		SessionHelper.showResults(workingMemory); 
	}
	
}


package opensoa.drools.tests;

import java.util.ArrayList;
import java.util.List;
import opensoa.drools.dto.Order;
import opensoa.drools.utility.LoadData;
import opensoa.drools.utility.SessionHelper;
import org.drools.WorkingMemory;
import org.drools.runtime.process.ProcessInstance;

import junit.framework.TestCase;

public class Test12 extends TestCase {

	WorkingMemory workingMemory;
    List priceCalcResults = new ArrayList();
    List shipmentCalcResults = new ArrayList();
    List priceCalcResultsDSL = new ArrayList();
    List specialCalcResults = new ArrayList();

	public void testGoldEuroOrder() throws Exception {

		loadRules();

		// run the engine with the provided order
		runEngine("../../../sample/order-gold-euro-qty-discount.xml", workingMemory);

		assertEquals(
				"price-calc rule flow group test",
				4, 
				priceCalcResults.size());
		
		assertEquals(
				"shipment-calc rule flow group test",
				3, 
				shipmentCalcResults.size());
		
		assertEquals(
				"special_calc_results rule flow group test",
				2, 
				specialCalcResults.size());		
	}
	
	public void testRegularEuroOrder() throws Exception {

		loadRules();

		// run the engine with the provided order
		runEngine("../../../sample/order-regular-euro.xml", workingMemory);

		assertEquals(
				"price-calc rule flow group test",
				3, 
				priceCalcResults.size());
		
		assertEquals(
				"shipment-calc rule flow group test",
				4, 
				shipmentCalcResults.size());
		
		assertEquals(
				"special_calc_results rule flow group test",
				2, 
				specialCalcResults.size());		
	}

	private void loadRules() throws Exception {

		// load up the rulebase
		workingMemory = SessionHelper.getEmbeddedSessionDRL();

		// load non-volatile data
		SessionHelper.loadNVWorkingMemory(workingMemory);

	}
	
	private void runEngine (String orderFile, WorkingMemory workingMemory) throws Exception {
		
        workingMemory.setGlobal( "price_calc_results", priceCalcResults );
        workingMemory.setGlobal( "shipment_calc_results", shipmentCalcResults );
        workingMemory.setGlobal( "special_calc_results", specialCalcResults );
        workingMemory.setGlobal( "price_calc_results_dsl", priceCalcResultsDSL );
        
		LoadData ld = new LoadData();
		
		// load Order details
		Order order = ld.loadOrders(orderFile);	
		workingMemory.insert( order );
		
		// start ruleflow
		ProcessInstance instance = workingMemory.startProcess("opensoa.drools.pricing");

		// fire the rule engine
		workingMemory.fireAllRules(); 
		
		// display the results, and this also cleans up volatile mem objects
		SessionHelper.showResults(workingMemory); 
	}
	

}

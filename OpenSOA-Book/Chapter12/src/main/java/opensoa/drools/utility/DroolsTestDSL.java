package opensoa.drools.utility;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

import opensoa.drools.dto.Order;
import opensoa.drools.dto.Party;
import opensoa.drools.dto.Product;
import opensoa.drools.dto.ProductPrice;
import opensoa.drools.dto.Products;
import opensoa.drools.dto.Shipping;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;

/**
 * This is a sample file to launch a rule package from a rule source file.
 */
public class DroolsTestDSL {

	public static final void main(String[] args) {
		try {

			//load up the rulebase
			RuleBase ruleBase = readRule();
			WorkingMemory workingMemory = ruleBase.newStatefulSession();
			
			LoadData ld = new LoadData();
			
			// load Order details
			Order order = ld.loadOrders("../../../sample/order1.xml");	
			workingMemory.insert( order );

			// load Pricing details
			ArrayList<ProductPrice> prices = ld.loadPrices();
			for (ProductPrice price:prices) {
				workingMemory.insert(price);
			}
			
			// load Product details
			Products product = ld.loadProducts();			
			for (Product prod:product.getProducts()) {
				workingMemory.insert(prod);
			}
			
			// load Party details
			ArrayList<Party> parties = ld.loadParties();
			for (Party party:parties) {
				workingMemory.insert(party);
			}
			
			// load Shipping details
			ArrayList<Shipping> shipping = ld.loadShipping();
			for (Shipping ship:shipping) {
				workingMemory.insert(ship);
			}
			
			// start ruleflow
			workingMemory.startProcess("opensoa.drools.pricing");

			Integer counter = 0;
			workingMemory.setGlobal("counter", counter);
			
			// fire the rule engine
			workingMemory.fireAllRules();   
	/*
			QueryResult result;
			QueryResults results = workingMemory.getQueryResults("FinalPrice");
			TotalPrice price = null;
			Order ord = null;
			for (Iterator it = results.iterator(); it.hasNext();) {
				result = ( QueryResult ) it.next();
				price = (TotalPrice) result.get("total");
				ord = (Order) result.get("order");
//				System.out.println("results: " + price.salePrice);
			}

			FactHandle priceFH = workingMemory.getFactHandle(price);
			FactHandle ordFH = workingMemory.getFactHandle(ord);
			System.out.println("fact handle is: " + priceFH);
			workingMemory.retract(priceFH);
			workingMemory.retract(ordFH);
			FactHandle fh;
			
			//for (Iterator iter = workingMemory.iterateFactHandles(); iter.hasNext(); ) {
				 
				//System.out.println("iter: " + iter.next());
			//}
*/			
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	/**
	 * Please note that this is the "low level" rule assembly API.
	 */
	private static RuleBase readRule() throws Exception {
		// read in the dsl
		Reader DSLsource = new InputStreamReader( DroolsTestDSL.class.getResourceAsStream( "/pricing.dsl" ) );
		
		//read in the source
		Reader source = new InputStreamReader( DroolsTestDSL.class.getResourceAsStream( "/CalculatePriceFlow.dslr" ) );
		Reader shippingSource = new InputStreamReader( DroolsTestDSL.class.getResourceAsStream( "/CalculateShippingFlow.drl" ) );
		Reader specialDiscSource = new InputStreamReader( DroolsTestDSL.class.getResourceAsStream( "/CalculateSpecialDiscountFlow.drl" ) );

		//optionally read in the DSL (if you are using it).
		//Reader dsl = new InputStreamReader( DroolsTest.class.getResourceAsStream( "/mylang.dsl" ) );

		//Use package builder to build up a rule package.
		//An alternative lower level class called "DrlParser" can also be used...

		PackageBuilder builder = new PackageBuilder();

		/* rule flow setup follows */
		Reader flowsource = new InputStreamReader(
				DroolsTestDSL.class.getResourceAsStream("/PriceCalculator.rf"));
		builder.addProcessFromXml(flowsource);
		
		//this will parse and compile in one step
		//NOTE: There are 2 methods here, the one argument one is for normal DRL.
		builder.addPackageFromDrl( source, DSLsource );
		builder.addPackageFromDrl( shippingSource );
		builder.addPackageFromDrl( specialDiscSource );
		
		//get the compiled package (which is serializable)
		Package pkg = builder.getPackage();

		//add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		return ruleBase;
	}
}
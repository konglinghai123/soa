package opensoa.drools.utility;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

import opensoa.drools.dto.Order;
import opensoa.drools.dto.Party;
import opensoa.drools.dto.Product;
import opensoa.drools.dto.ProductPrice;
import opensoa.drools.dto.Products;
import opensoa.drools.dto.Shipping;
import opensoa.drools.dto.TotalPrice;

import org.drools.FactHandle;
import org.drools.QueryResult;
import org.drools.QueryResults;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.WorkingMemory;
import org.drools.agent.RuleAgent;
import org.drools.compiler.PackageBuilder;
import org.drools.event.AfterActivationFiredEvent;
import org.drools.event.DefaultAgendaEventListener;
import org.drools.rule.Package;

public class SessionHelper {
	private static RuleBase        rulebase;
	private static StatefulSession session;

	private SessionHelper(){
	}

	public static StatefulSession getSession() {

		if ( rulebase == null ) {
			rulebase = loadRuleBaseFromRuleAgent();
		}

		session = rulebase.newStatefulSession();

		session.addEventListener( new DefaultAgendaEventListener() {
			public void afterActivationFired(AfterActivationFiredEvent event, WorkingMemory workingMemory) {
				super.afterActivationFired( event, workingMemory );
				System.out.println( "Event: " + event.getActivation().getRule().getName()) ;
			}
		});
		
		// we're just using this counter to demonstrate global variable usage
		Integer counter = 0;
		//session.setGlobal("counter", counter);

		return session;
	}

	public static StatefulSession getEmbeddedSessionDRL() {

		if ( rulebase == null ) {
			try {
				
				rulebase = loadRuleBaseFromRuleAgent();
				
				// following will load rules from DRL and RF files manually
				//rulebase = readEmbeddedRules();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		session = rulebase.newStatefulSession();
		session.addEventListener( new DefaultAgendaEventListener() {
			public void afterActivationFired(AfterActivationFiredEvent event, WorkingMemory workingMemory) {
				super.afterActivationFired( event, workingMemory );
				System.out.println( "Event: " + event.getActivation().getRule().getName()) ;
			}
		});
		// we're just using this counter to demonstrate global variable usage
		Integer counter = 0;
		session.setGlobal("counter", counter);

		return session;
	}
	private static RuleBase loadRuleBaseFromRuleAgent() {
		RuleAgent agent = RuleAgent.newRuleAgent( "/rule.properties" );
		RuleBase rulebase = agent.getRuleBase();
		return rulebase;
	}

	public static void loadNVWorkingMemory (WorkingMemory workingMemory) throws Exception {
		LoadData ld = new LoadData();

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
	}

	private static RuleBase readEmbeddedRules() throws Exception {
		//read in the source
		Reader source = new InputStreamReader( SessionHelper.class.getResourceAsStream( "/CalculatePriceFlow.drl" ) );
		Reader shippingSource = new InputStreamReader( SessionHelper.class.getResourceAsStream( "/CalculateShippingFlow.drl" ) );
		Reader specialDiscSource = new InputStreamReader( SessionHelper.class.getResourceAsStream( "/CalculateSpecialDiscountFlow.drl" ) );

		PackageBuilder builder = new PackageBuilder();

		/* rule flow setup follows */
		Reader flowsource = new InputStreamReader(
				SessionHelper.class.getResourceAsStream("/PriceCalculator.rf"));
		builder.addProcessFromXml(flowsource);

		builder.addPackageFromDrl( source );
		builder.addPackageFromDrl( shippingSource );
		builder.addPackageFromDrl( specialDiscSource );

		//get the compiled package (which is serializable)
		Package pkg = builder.getPackage();

		//add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		return ruleBase;
	}
	
	

	public static TotalPrice showResults (WorkingMemory workingMemory) {

		QueryResult result;
		TotalPrice price = null;
		Order ord = null;

		// get the TotalPrice results from the query 
		QueryResults results = workingMemory.getQueryResults("FinalPrice");

		// scroll through the query results, and get a handle to the TotalPrice
		// and Order objects
		for (QueryResult qresult : results) {
			result = (QueryResult) qresult;
			price = (TotalPrice) result.get("total");
			ord = (Order) result.get("order");
		}

		// retrieve a fact handle for those objects we want to remove after processing
		FactHandle priceFH = workingMemory.getFactHandle(price);
		FactHandle ordFH = workingMemory.getFactHandle(ord);

		// clear these volatile items out of memory
		workingMemory.retract(priceFH);
		workingMemory.retract(ordFH);
		return price;

		// if you wanted, you could also use following to iterate through all working memory objects
		/*
		FactHandle fh;

		for (Iterator iter = workingMemory.iterateFactHandles(); iter.hasNext(); ) {	 
			System.out.println("iter: " + iter.next());
		}
		 */
	}
}

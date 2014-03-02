package opensoa.drools.service.impl;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.tuscany.sdo.api.SDOUtil;
import org.drools.WorkingMemory;

import commonj.sdo.helper.HelperContext;

import opensoa.drools.DroolsFactory;
import opensoa.drools.dto.Order;
import opensoa.drools.dto.OrderProduct;
import opensoa.drools.dto.TotalPrice;
import opensoa.drools.salesorder.SalesorderFactory;
import opensoa.drools.salesorder.impl.PriceCalculatorRequestImpl;
import opensoa.drools.salesorder.impl.PriceCalculatorResponseImpl;
import opensoa.drools.salesorder.impl.productImpl;
import opensoa.drools.service.SessionManager;
import opensoa.drools.utility.SessionHelper;

public class PriceCalculatorProcessor {

	DroolsFactory dfactory;
	SalesorderFactory salesFactory;
	PriceCalculatorRequestImpl order;
	WorkingMemory workingMemory;
	
	public PriceCalculatorProcessor (PriceCalculatorRequestImpl order) {
		this.order = order;
		HelperContext scope = SDOUtil.createHelperContext();
		dfactory = DroolsFactory.INSTANCE;
		DroolsFactory.INSTANCE.register(scope);		
		salesFactory = salesFactory.INSTANCE;
		SalesorderFactory.INSTANCE.register(scope);
	}
	
	public PriceCalculatorResponseImpl process(SessionManager sessionManager) {
		
		
		workingMemory = sessionManager.getWorkingMemory();
		
		System.out.println("The Order Id is: " + order.getOrder().getHeader().getOrderId());
		
		Order dorder = convertToBaseObj();
		
		PriceCalculatorResponseImpl response = null;
		try {
			response = runRules(dorder);
			//response.setOrderId(order.getOrder().getHeader().getOrderId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	/* Use to convert from SDO to standard Order object, since the business rules developed
	 * previously used this object.
	 */
	private Order convertToBaseObj() {
		Order stdorder = new Order();
		
		stdorder.setCurrency(order.getOrder().getHeader().getCurrency());
		stdorder.setOrderId(order.getOrder().getHeader().getOrderId());
		stdorder.setPartyContactId(order.getOrder().getHeader().getPartyContactId());
		stdorder.setPartyId(order.getOrder().getHeader().getPartyId());
		stdorder.setShippingCarrier(order.getOrder().getHeader().getShipping().getCarrier());
		stdorder.setShippingMethod(order.getOrder().getHeader().getShipping().getMethod());
		
		ArrayList<OrderProduct> lines = new ArrayList<OrderProduct>();
		OrderProduct prod;
		productImpl prodItem; 
		
		Iterator iter = order.getOrder().getLines().getProduct().iterator();
		
		while (iter.hasNext()) {
			prodItem = (productImpl) iter.next();
			prod = new OrderProduct(prodItem.getProductId(), prodItem.getCnt(), prodItem.getLineId());
			lines.add(prod);
		}
		
		stdorder.setLines(lines);
		/*
		prod = new OrderProduct(String productId, int cnt, String lineId,
			float stdPrice, float stdShipping, float qntDiscountPrice)
		*/
		
		return stdorder;
		
	}

	private PriceCalculatorResponseImpl runRules(Order order) throws Exception {

		/*
		WorkingMemory workingMemory = SessionHelper.getEmbeddedSessionDRL();
		SessionHelper.loadNVWorkingMemory(workingMemory);
		*/
		workingMemory.insert( order );
		
		// start ruleflow
		workingMemory.startProcess("opensoa.drools.pricing");

		// fire the rule engine
		workingMemory.setGlobal( "price_calc_results", new ArrayList());
		workingMemory.fireAllRules(); 
		
		// display the results, and this also cleans up volatile mem objects
		TotalPrice total = SessionHelper.showResults(workingMemory); 
		
		PriceCalculatorResponseImpl response = (PriceCalculatorResponseImpl) salesFactory.createPriceCalculatorResponse();
		response.setOrderId(total.getOrderId());
		response.setSalePrice(total.getSalePrice());
		response.setShippingPrice(total.getShippingPrice());
		response.setTotalPrice(total.getTotalPrice());
		response.setComments(total.getComments());
		response.setCurrency(total.getCurrency());
		
		return response;
	}
}

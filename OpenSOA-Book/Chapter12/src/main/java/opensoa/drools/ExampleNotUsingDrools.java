package opensoa.drools;

import java.util.ArrayList;

import org.xml.sax.SAXException;

import opensoa.drools.dto.Order;
import opensoa.drools.dto.OrderProduct;
import opensoa.drools.dto.Party;
import opensoa.drools.dto.Product;
import opensoa.drools.dto.ProductPrice;
import opensoa.drools.dto.Products;
import opensoa.drools.utility.LoadData;

public class ExampleNotUsingDrools {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws SAXException, Exception {
    	LoadData ld = new LoadData();
    	
		// load Pricing details
		ArrayList<ProductPrice> prices = ld.loadPrices();
		
		// load Product details
		Products product = ld.loadProducts();			
		
		// load Party details
		ArrayList<Party> parties = ld.loadParties();

		// load Order details
		Order order = ld.loadOrders("../../../sample/order-gold-euro-qty-discount.xml");	
		ArrayList<OrderProduct> orderLines = order.getLines();
		
		// scroll through the products
		for (OrderProduct line:orderLines) {
			// find product prices for each line item
			for (ProductPrice price:prices) {
				if (price.getProductId().equals(line.getProductId())  
						&& price.getPriceType().equals(ProductPrice.DISCOUNT_PRICE)) {
					// find matching party object related to order
					for (Party party:parties) {
						if (party.getPartyId().equals(order.getPartyId())) {
							if (party.getPartyTypeId().equals(Party.GOLD) 
									|| party.getPartyTypeId().equals(Party.SILVER)) {
								line.setStdPrice(line.getCnt() * price.getPrice());
								System.out.println("Item: " + line.getProductId() + " Price: " + line.getStdPrice());
							}
						}
					}
				}
			}
		}
		
		
	}

}

package opensoa.drools.utility;

import java.io.IOException;
import java.util.ArrayList;

import opensoa.drools.dto.Party;
import opensoa.drools.dto.Product;
import opensoa.drools.dto.ProductPrice;
import opensoa.drools.dto.Products;
import opensoa.drools.dto.Shipping;

import org.jboss.cache.pojo.PojoCache;
import org.jboss.cache.pojo.PojoCacheFactory;
import org.xml.sax.SAXException;

public class PojoCacheLoader {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws SAXException, Exception {
		String configFile = "replSync-service.xml";
		boolean toStart = true;

		PojoCache pcache = PojoCacheFactory.createCache(configFile, toStart);
		//pcache.start();
		
		LoadData ld = new LoadData();

		// load product prices
		ArrayList<ProductPrice> prices = ld.loadPrices();
		for (ProductPrice price:prices) {
			pcache.attach("/opensoa/drools/salesorder/productprice/" + price.hashCode(), price);
		}

		// load products
		Products product = ld.loadProducts();		
		Product proditem;
		for (Product prod:product.getProducts()) {
			pcache.attach("/opensoa/drools/salesorder/product/" + prod.hashCode(), prod);
		}
		
		// load party details
		ArrayList<Party> parties = ld.loadParties();
		for (Party party:parties) {
			pcache.attach("/opensoa/drools/salesorder/party/" + party.hashCode(), party);
		}
		
		// load Shipping details
		ArrayList<Shipping> shipping = ld.loadShipping();
		for (Shipping ship:shipping) {
			pcache.attach("/opensoa/drools/salesorder/ship/" + ship.hashCode(), ship);
		}

		try {
			System.out.println("PojoCache server started (press enter to shutdown)");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		pcache.stop();
	}

}

package opensoa.drools.utility;

import java.net.URL;
import java.util.ArrayList;

import opensoa.drools.dto.*;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

public class LoadData {
	static final String PRODUCTS = "../../../sample/product-normalized.xml";
	static final String PRICES = "../../../sample/productPrice-normalized.xml";
	static final String PARTIES = "../../../sample/parties-normalized.xml";
	static final String SHIPPING = "../../../sample/shipping-normalized.xml";
	
	Digester digester;
	
	public Order loadOrders(String xmlFile) throws Exception, SAXException {
		ArrayList<Order> order = new ArrayList<Order>();
		ArrayList<OrderProduct> orderProducts = new ArrayList<OrderProduct>();
		
		digester = new Digester();
		digester.addObjectCreate("Order", opensoa.drools.dto.Order.class);
		digester.addCallMethod("Order/header/orderId","setOrderId",0);
		digester.addCallMethod("Order/header/partyId","setPartyId",0);
		digester.addCallMethod("Order/header/partyContactId","setPartyContactId",0);
		digester.addCallMethod("Order/header/currency","setCurrency",0);
		digester.addCallMethod("Order/header/shipping/carrier","setShippingCarrier",0);
		digester.addCallMethod("Order/header/shipping/method","setShippingMethod",0);		
		
		digester.addObjectCreate("Order/lines/product", opensoa.drools.dto.OrderProduct.class);
		digester.addCallMethod("Order/lines/product/lineId","setLineId",0);
		digester.addCallMethod("Order/lines/product/productId","setProductId",0);
		digester.addCallMethod("Order/lines/product/cnt","setCnt",0, new Class[] {int.class});
		digester.addSetNext("Order/lines/product", "addOrderItem");
		
		digester.addSetNext("Order", "add");
		digester.push(order);

		URL path = LoadData.class.getResource(xmlFile);
		digester.parse(path);
		//Order order = (Order) digester.parse(path);
		
		//System.out.println("order: " + order.get(0).getOrderId());
		//System.out.println("order items: " + order.get(0).getLines().get(1).getCnt());
		return order.get(0);
	}
	
	public ArrayList<Shipping> loadShipping() throws Exception, SAXException {
		ArrayList<Shipping> shippings = new ArrayList<Shipping>();
		
		digester = new Digester();
		digester.addObjectCreate("CarrierShipmentMethods/CarrierShipmentMethod", opensoa.drools.dto.Shipping.class);
		digester.addCallMethod("CarrierShipmentMethods/CarrierShipmentMethod/carrier","setCarrier",0);
		digester.addCallMethod("CarrierShipmentMethods/CarrierShipmentMethod/shippingMethod","setShippingMethod",0);
		digester.addCallMethod("CarrierShipmentMethods/CarrierShipmentMethod/multiplier","setMultiplier",0, new Class[] {float.class});
		
		digester.addSetNext("CarrierShipmentMethods/CarrierShipmentMethod", "add");

		URL path = LoadData.class.getResource(SHIPPING);

		digester.push( shippings);
		digester.parse(path);
		
//		System.out.println("shipping: " + shippings.size());
		
		return shippings;
	}
	
	public ArrayList<Party> loadParties() throws Exception, SAXException {
		ArrayList<Party> parties = new ArrayList<Party>();
		ArrayList<PartyContact> partyContacts = new ArrayList<PartyContact>();
		
		digester = new Digester();
		digester.addObjectCreate("Partys/Party", opensoa.drools.dto.Party.class);
		digester.addCallMethod("Partys/Party/partyId","setPartyId",0);
		digester.addCallMethod("Partys/Party/partyTypeId","setPartyTypeId",0);
		digester.addCallMethod("Partys/Party/partyName","setPartyName",0);
		
		digester.addObjectCreate("Partys/Party/partyContacts/partyContact", opensoa.drools.dto.PartyContact.class);
		digester.addCallMethod("Partys/Party/partyContacts/partyContact/partyContactId","setPartyContactId",0);		
		digester.addCallMethod("Partys/Party/partyContacts/partyContact/fname","setFname",0);
		digester.addCallMethod("Partys/Party/partyContacts/partyContact/lname","setLname",0);
		digester.addCallMethod("Partys/Party/partyContacts/partyContact/email","setEmail",0);
		
		digester.addSetNext("Partys/Party/partyContacts/partyContact", "addPartyContact");
		
		digester.addSetNext("Partys/Party", "add");
		URL path = LoadData.class.getResource(PARTIES);

		digester.push(parties);
		//digester.push(partyContacts);
		digester.parse(path);
		
	//	System.out.println("parties: " + parties.size());
		//System.out.println("partyContats: " + ((PartyContact) parties.get(1).getPartyContacts().get(0)).getFname());
		return parties;
	}
	
	public ArrayList<ProductPrice> loadPrices() throws Exception, SAXException {
		ArrayList<ProductPrice> prices = new ArrayList<ProductPrice>();
		
		digester = new Digester();
		digester.addObjectCreate("ProductPrices/ProductPrice", opensoa.drools.dto.ProductPrice.class);
		digester.addCallMethod("ProductPrices/ProductPrice/productId","setProductId",0);
		digester.addCallMethod("ProductPrices/ProductPrice/priceType","setPriceType",0);
		digester.addCallMethod("ProductPrices/ProductPrice/price","setPrice",0, new Class[] {float.class});
		digester.addCallMethod("ProductPrices/ProductPrice/fromDate","setFromDate",0);
		
		digester.addSetNext("ProductPrices/ProductPrice", "add");

		URL path = LoadData.class.getResource(PRICES);

		digester.push( prices);
		digester.parse(path);
		//System.out.println("productId: " + prices.get(0).getProductId());
		//System.out.println("prices: " + prices.size());
		return prices;
	}

	public Products loadProducts() throws Exception, SAXException {
		
		Products prods;
		ArrayList<Product> products = new ArrayList<Product>();
		
		digester = new Digester();
		digester.addObjectCreate("Products/Product", opensoa.drools.dto.Product.class);
		digester.addCallMethod("Products/Product/productId","setProductId",0);
		digester.addCallMethod("Products/Product/productTypeId","setProductTypeId",0);
		digester.addCallMethod("Products/Product/productName","setProductName",0);
		digester.addCallMethod("Products/Product/description","setDescription",0);
		digester.addCallMethod("Products/Product/chargeShipping","setChargeShipping",0, new Class[] {boolean.class});
		digester.addCallMethod("Products/Product/shippingWeight","setWeight",0, new Class[] {float.class});
		digester.addSetNext("Products/Product", "add");

		URL path = LoadData.class.getResource(PRODUCTS);

		digester.push( products);
		digester.parse(path);

		prods = new Products(products);
		
		return prods;
		
	}
	public static void main(String[] args) throws SAXException, Exception {
		LoadData ld = new LoadData();
		
		Products products = ld.loadProducts();
		System.out.println("Loaded " + products.getProducts().size() + " products");
		
		ld.loadPrices();
		ld.loadParties();
		ld.loadShipping();
		
		ld.loadOrders("../../../sample/order1.xml");
	}


}

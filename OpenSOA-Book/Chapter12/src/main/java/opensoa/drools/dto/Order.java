package opensoa.drools.dto;

import java.util.ArrayList;

public class Order {
	public String orderId;
	private String partyId;
	private String partyContactId;
	private String shippingCarrier;
	private String shippingMethod;
	public String currency;
	public ArrayList<OrderProduct> lines;
	
	public Order() {
		lines = new ArrayList<OrderProduct>();
	}
	
	public void addOrderItem(Object obj) {
		lines.add((OrderProduct) obj);
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getPartyContactId() {
		return partyContactId;
	}
	public void setPartyContactId(String partyContactId) {
		this.partyContactId = partyContactId;
	}
	public ArrayList<OrderProduct> getLines() {
		return lines;
	}
	public void setLines(ArrayList<OrderProduct> lines) {
		this.lines = lines;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShippingCarrier() {
		return shippingCarrier;
	}

	public void setShippingCarrier(String shippingCarrier) {
		this.shippingCarrier = shippingCarrier;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}

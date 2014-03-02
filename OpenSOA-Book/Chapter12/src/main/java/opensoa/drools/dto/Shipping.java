package opensoa.drools.dto;

import org.jboss.cache.pojo.annotation.Replicable;

@Replicable
public class Shipping {
	public String carrier;
	public String shippingMethod;
	public float multiplier;
	
	// shipment methods
	public static final String STANDARD="STANDARD";
	public static final String EXPRESS="EXPRESS";
	public static final String WILLCALL="LOCAL_DELIVERY";
	public static final String GROUND="GROUND";
	public static final String AIR="AIR";
	public static final String NEXT_DAY="NEXT_DAY";
	public static final String NONE="NO_SHIPPING";
	public static final String NEXT_PM="NEXT_PM";
	public static final String SECOND_DAY="SECOND_DAY";
	
	// carriers
	public static final String DHL="DHL";
	public static final String NA="_NA_";
	public static final String UPS="UPS";
	public static final String USPS="USPS";
	public static final String COMPANY="Company";
	
		
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public float getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(float multiplier) {
		this.multiplier = multiplier;
	}
	
}
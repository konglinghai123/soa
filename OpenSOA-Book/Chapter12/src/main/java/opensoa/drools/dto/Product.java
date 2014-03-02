package opensoa.drools.dto;

import java.io.Serializable;

import org.jboss.cache.pojo.annotation.Replicable;

@Replicable
public class Product implements Serializable {
	public String productId;
	public String productTypeId;
	public String productName;
	public String description;
	public boolean chargeShipping;
	public float weight;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isChargeShipping() {
		return chargeShipping;
	}
	public void setChargeShipping(boolean chargeShipping) {
		this.chargeShipping = chargeShipping;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
    
}

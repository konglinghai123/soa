package opensoa.drools.dto;

public class OrderProduct {
	public String productId;
	public int cnt;
	public String lineId;
	public float stdPrice;
	public float stdShipping;
	public float qntDiscountPrice;
	
	public OrderProduct(String productId, int cnt, String lineId) {
		super();
		this.productId = productId;
		this.cnt = cnt;
		this.lineId = lineId;
	}
	
	public OrderProduct() {
		
	}
	
	public float getQntDiscountPrice() {
		return qntDiscountPrice;
	}
	public void setQntDiscountPrice(float qntDiscountPrice) {
		this.qntDiscountPrice = qntDiscountPrice;
	}
	
	public String getLineId() {
		return lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}
	public float getStdPrice() {
		return stdPrice;
	}
	public void setStdPrice(float stdPrice) {
		this.stdPrice = stdPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public float getStdShipping() {
		return stdShipping;
	}
	public void setStdShipping(float stdShipping) {
		this.stdShipping = stdShipping;
	}
	
	
}

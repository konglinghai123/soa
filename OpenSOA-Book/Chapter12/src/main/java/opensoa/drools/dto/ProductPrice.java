package opensoa.drools.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jboss.cache.pojo.annotation.Replicable;

@Replicable

public class ProductPrice {

	private static final long serialVersionUID = 1L;
	public String productId;
	public String priceType;
	public Date fromDate;
	public float price;

	public final static String LIST_PRICE="DEFAULT_PRICE";
	public final static String DISCOUNT_PRICE="LIST_PRICE";
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId; 
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(String sfromDate) {
		SimpleDateFormat format =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parsed;
		try {
			parsed = format.parse(sfromDate);
			this.fromDate = parsed;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
}

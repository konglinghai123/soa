package opensoa.drools.dto;

import java.util.ArrayList;
import java.util.List;

public class Products {
	List<Product> products = new ArrayList<Product>();

	public Products(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

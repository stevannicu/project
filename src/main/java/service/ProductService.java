package service;

import basic.BasicService;
import model.Product;

public interface ProductService extends BasicService<Product> {

	public boolean validate(Product product);
	
	public boolean isCarType(Product product);
}

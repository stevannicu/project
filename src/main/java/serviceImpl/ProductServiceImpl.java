package serviceImpl;

import basic.BasicServiceImpl;
import basic.BasicValidator;
import dao.ProductDAO;
import model.Product;
import service.ProductService;

public class ProductServiceImpl  extends BasicServiceImpl<Product, ProductDAO> implements ProductService{
	
	
	public ProductServiceImpl(ProductDAO dao, BasicValidator<Product> validator) {
		super(dao, validator);
	}

	public boolean validate(Product product){
		return validator.validate(product);
		
	}

	@Override
	public boolean isCarType(Product product) {
		String productType = product.getProductType();
		return productType.equals("Car");
	}
	

	
}

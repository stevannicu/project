package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import basic.BasicServiceImpl;
import basic.BasicValidator;
import dao.ElementaryProductDAO;
import model.ElementaryProduct;
import service.ElementaryProductService;
import service.ProductService;

public class ElementaryProductServiceImpl extends BasicServiceImpl<ElementaryProduct, ElementaryProductDAO> implements ElementaryProductService {

	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	public ElementaryProductServiceImpl(ElementaryProductDAO dao, BasicValidator<ElementaryProduct> validator) {
		super(dao, validator);
	}

	public boolean validate(ElementaryProduct dataBean){
		return validator.validate(dataBean);	
	}
	
}

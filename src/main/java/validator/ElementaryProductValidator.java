package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import basic.BasicValidator;
import model.ElementaryProduct;
import service.ProductService;

public class ElementaryProductValidator implements BasicValidator<ElementaryProduct>{

	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@Override
	public boolean validate(ElementaryProduct dataBean) {
		boolean productValidated = productService.validate(dataBean.getProduct());

		if (productService.isCarType(dataBean.getProduct())) {
			boolean validatetBonusMalus = validatetBonusMalus(dataBean.getBonusMalus());
			return productValidated && validatetBonusMalus;
		}

		return productValidated;
	}
	
	private boolean validatetBonusMalus(int bonusMalus){
		if(bonusMalus<-10){
			return false;
		}
		return true;
	}
}

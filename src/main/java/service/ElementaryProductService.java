package service;

import basic.BasicService;
import model.ElementaryProduct;

public interface ElementaryProductService extends BasicService<ElementaryProduct>{

	public boolean validate(ElementaryProduct elementaryProduct);
	
}

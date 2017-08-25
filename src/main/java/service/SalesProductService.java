package service;

import basic.BasicService;
import model.SalesProduct;

public interface SalesProductService extends BasicService<SalesProduct> {

	public boolean validate(SalesProduct dataBean);
}

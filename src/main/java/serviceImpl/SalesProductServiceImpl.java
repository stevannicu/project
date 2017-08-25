package serviceImpl;

import basic.BasicServiceImpl;
import basic.BasicValidator;
import dao.SalesProductDAO;
import model.SalesProduct;
import service.SalesProductService;

public class SalesProductServiceImpl extends BasicServiceImpl<SalesProduct, SalesProductDAO> implements SalesProductService {

	public SalesProductServiceImpl(SalesProductDAO dao,BasicValidator<SalesProduct> valdator) {
		super(dao,valdator);
	}

	public boolean validate(SalesProduct dataBean) {
		return validator.validate(dataBean);
	}
}

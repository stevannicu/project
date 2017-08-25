package dao;

import basic.BasicDao;
import model.SalesProduct;

public interface SalesProductDAO extends BasicDao<SalesProduct> {

	@Override
	public  SalesProduct selctOne();
	
	@Override
	public void insert(SalesProduct dataBean);
	
	@Override
	public void update (SalesProduct dataBean);
	
	@Override
	public void delete(SalesProduct dataBean);
}

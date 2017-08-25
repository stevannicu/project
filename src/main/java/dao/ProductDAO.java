package dao;

import basic.BasicDao;
import model.Product;

public interface ProductDAO extends BasicDao<Product> {

	@Override
	public  Product selctOne();
	
	@Override
	public void insert(Product dataBean);
	
	@Override
	public void update (Product dataBean);
	
	@Override
	public void delete(Product dataBean);
}

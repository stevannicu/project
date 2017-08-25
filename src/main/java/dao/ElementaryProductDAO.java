package dao;

import basic.BasicDao;
import model.ElementaryProduct;

public interface ElementaryProductDAO extends BasicDao<ElementaryProduct>  {
	
	@Override
	public  ElementaryProduct selctOne();
	
	@Override
	public void insert(ElementaryProduct dataBean);
	
	@Override
	public void update (ElementaryProduct dataBean);
	
	@Override
	public void delete(ElementaryProduct dataBean);
	
}

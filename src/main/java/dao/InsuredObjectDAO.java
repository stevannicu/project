package dao;

import basic.BasicDao;
import model.InsuredObject;

public interface InsuredObjectDAO extends BasicDao<InsuredObject> {

	@Override
	public  InsuredObject selctOne();
	
	@Override
	public void insert(InsuredObject dataBean);
	
	@Override
	public void update (InsuredObject dataBean);
	
	@Override
	public void delete(InsuredObject dataBean);
	
}

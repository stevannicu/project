package basic;

public class BasicServiceImpl<TMODEL extends BasicModel,TDAO extends BasicDao<TMODEL>> implements BasicService<TMODEL>{

	protected TDAO dao;
	
	protected BasicValidator<TMODEL> validator;

	public BasicServiceImpl(TDAO dao, BasicValidator<TMODEL> validator) {
		this.dao=dao;
		this.validator=validator;
	}

	public void doInsert(TMODEL dataBean) {
		dao.insert(dataBean);
	}
	
	@Override
	public void insert(TMODEL dataBean)  {
			try{
				preInsert(dataBean);
				doInsert(dataBean);
				postInsert(dataBean);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void update(TMODEL dataBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TMODEL dataBean) {
		// TODO Auto-generated method stub
		
	}
	
	public void preInsert(TMODEL dataBean)  {
	}
	
	public void postInsert(TMODEL dataBean) {
		
	}
}

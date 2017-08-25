package basic;

public interface BasicDao<TMODEL> {

	public  TMODEL selctOne();
		
	public void insert(TMODEL dataBean);
	
	public void update (TMODEL dataBean);
	
	public void delete(TMODEL dataBean);
	
	
}

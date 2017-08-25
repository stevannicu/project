package basic;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface  BasicService<TMODEL> {
		
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE)
	public void insert(TMODEL dataBean);
	
	public void update(TMODEL dataBean);
	
	public void delete(TMODEL dataBean);

	
}

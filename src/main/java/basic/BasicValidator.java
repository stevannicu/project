package basic;

public interface BasicValidator<TMODEL extends BasicModel> {
	
	public boolean validate(TMODEL dataBean);
}

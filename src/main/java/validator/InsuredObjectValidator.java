package validator;

import basic.BasicValidator;
import model.InsuredObject;

public class InsuredObjectValidator implements BasicValidator<InsuredObject>  {

	@Override
	public boolean validate(InsuredObject dataBean) {
		System.out.println("User 1 feature A");
		boolean validateMileage = false;
		return validateMileage;
	}

	private boolean validateMileage(InsuredObject insuredObject){
		System.out.println("User 1 feature A");
		if(insuredObject.getMileage()> 250000){
			return false;
		}
		return true;
	}
}

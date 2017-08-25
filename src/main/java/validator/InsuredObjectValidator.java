package validator;

import basic.BasicValidator;
import model.InsuredObject;

public class InsuredObjectValidator implements BasicValidator<InsuredObject>  {

	@Override
	public boolean validate(InsuredObject dataBean) {
		boolean validateMileage = validateMileage(dataBean);
		return validateMileage;
	}

	private boolean validateMileage(InsuredObject insuredObject){
		System.out.println("Feature B");
		if(insuredObject.getMileage()> 250000){
			return false;
		}
		return true;
	}
}

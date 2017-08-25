package validator;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import basic.BasicValidator;
import model.Product;
import service.InsuredObjectService;
import service.SalesProductService;

public class ProductValidator implements BasicValidator<Product> {

	@Autowired
	@Qualifier("salesProductService")
	private SalesProductService salesProductService;
	
	@Autowired
	@Qualifier("insuredObjectService")
	private InsuredObjectService insuredObjectService;
	
	@Override
	public boolean validate(Product dataBean) {
		
		boolean validateRegion=validateRegion(dataBean);
		boolean validateInsuredPersonAge = validateInsuredPersonAge(dataBean);
		boolean validateCarType = validateCarType(dataBean);
		
		boolean basicValidation = validateRegion && validateInsuredPersonAge && validateCarType;
		
		
		if(dataBean.getSalesProduct()!=null){
		boolean validateSalesProduct = salesProductService.validate(dataBean.getSalesProduct());
		return basicValidation && validateSalesProduct;
		}
		
		return basicValidation;
		
	}

	private boolean validateRegion(Product product) {
		if (product.getRegion().equals("East")) {
			return true;
		}
		return false;
	}

	private boolean validateInsuredPersonAge(Product product) {
		DateTime dateOfBirthInsuredPerson = new DateTime(product.getDateOfBirthYoungest());
		DateTime now = new DateTime();
		int yearDifference = Years.yearsBetween(dateOfBirthInsuredPerson, now).getYears();
		if (yearDifference < 18 || yearDifference > 65) {
			return false;
		}
		return true;
	}

	private boolean validateConstructionYear(Product product) {
		if (product.getConstructionYear() < 1980) {
			return false;
		}
		return true;
	}

	private boolean validateCarType(Product product) {
		boolean carType = product.getProductType().equals("Car");
		if (carType) {
			boolean validateMileage = insuredObjectService.validate(product.getInsuredObject());
			boolean validateConstructionYear = validateConstructionYear(product);
			return validateMileage && validateConstructionYear;
		}

		System.out.println("Git first commit");
		System.out.println("Git second commit");
		System.out.println("Git user2 commit");
		return true;
	}

		

}

package validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Years;

import basic.BasicValidator;
import model.SalesProduct;

public class SalesProductValidator implements BasicValidator<SalesProduct> {

	@Override
	public boolean validate(SalesProduct salesProduct){
		boolean validateContractStart=validateContractStart(salesProduct);
		boolean validateCurrency=validateCurrency(salesProduct);
		boolean validateDuration=validateDuration(salesProduct);
		return (validateContractStart && validateCurrency && validateDuration);
	}
	
	private boolean validateContractStart(SalesProduct salesProduct)  {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date targetDate=null;
			try {
				targetDate = sdf.parse("2011-01-12");//set to be configurable 2011-01-12
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(salesProduct.getContractStart().compareTo(targetDate) < 0) {
				return false;
			}
		return true;
	}
	
	private boolean validateCurrency(SalesProduct salesProduct)  {
		if(!salesProduct.getCurrency().equals("EUR")){//set to be configurable EUR
			return false;
		}
		return true;
	}
	
	private boolean validateDuration(SalesProduct salesProduct)  {
		DateTime startDate = new DateTime(salesProduct.getContractStart());
		DateTime endDate = new DateTime(salesProduct.getContractEnd());
		
	    long duration = Years.yearsBetween(startDate, endDate).getYears();
		
	    if(duration>1){
	    	return false;
	    }
	    
	    return true;
	}
		
}

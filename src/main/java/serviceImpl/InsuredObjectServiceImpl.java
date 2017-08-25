package serviceImpl;

import basic.BasicServiceImpl;
import basic.BasicValidator;
import dao.InsuredObjectDAO;
import model.InsuredObject;
import service.InsuredObjectService;

public class InsuredObjectServiceImpl extends BasicServiceImpl<InsuredObject, InsuredObjectDAO> implements InsuredObjectService {

	public InsuredObjectServiceImpl(InsuredObjectDAO dao, BasicValidator<InsuredObject> vaidator) {
		super(dao,vaidator);
	}

	public boolean validate(InsuredObject dataBean) {
		return validator.validate(dataBean);
	}
}

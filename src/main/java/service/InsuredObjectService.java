package service;

import basic.BasicService;
import model.InsuredObject;

public interface InsuredObjectService extends BasicService<InsuredObject> {

	public boolean validate(InsuredObject dataBean);
}

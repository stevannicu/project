package model;

import javax.xml.bind.annotation.XmlRootElement;

import basic.BasicModel;

@XmlRootElement
public class InsuredObject implements BasicModel {

	private int insuredObjectId;
	
	private int engineCapacity;
	
	private int mileage;
	
	private String name;
	
	private String ownersName;

	public InsuredObject() {
		super();
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public int getInsuredObjectId() {
		return insuredObjectId;
	}

	public void setInsuredObjectId(int insuredObjectId) {
		this.insuredObjectId = insuredObjectId;
	}

	@Override
	public String tableName() {
		return "insuredObject";
	}
	
}

package model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import basic.BasicModel;

@XmlRootElement
public class Product implements BasicModel {

	private int productID;
	
	private boolean garage;
	
	private int constructionYear;
	
	private Date dateOfBirthYoungest;
	
	private int objectValue;
	
	private String region;
	
	private String type;
	
	private String productType;
	
	private InsuredObject insuredObject;
	
	private SalesProduct salesProduct;
	
	public Product() {
		super();
	}

	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public Date getDateOfBirthYoungest() {
		return dateOfBirthYoungest;
	}

	public void setDateOfBirthYoungest(Date dateOfBirthYoungest) {
		this.dateOfBirthYoungest = dateOfBirthYoungest;
	}

	public int getObjectValue() {
		return objectValue;
	}

	public void setObjectValue(int objectValue) {
		this.objectValue = objectValue;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public InsuredObject getInsuredObject() {
		return insuredObject;
	}

	public void setInsuredObject(InsuredObject insuredObject) {
		this.insuredObject = insuredObject;
	}

	public SalesProduct getSalesProduct() {
		return salesProduct;
	}

	public void setSalesProduct(SalesProduct salesProduct) {
		this.salesProduct = salesProduct;
	}

	@Override
	public String tableName() {
		return "product";
	}


}

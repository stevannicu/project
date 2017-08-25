package model;

import javax.xml.bind.annotation.XmlRootElement;

import basic.BasicModel;

@XmlRootElement
public class ElementaryProduct implements BasicModel {

	private int elementaryProductId;
	
	private int bonusMalus;
	
	private int deductible;
	
	private int comprehensive;
	
	private int partial;
	
	private int legacyPremium;
	
	private double premium;

	private Product product;
	
	public ElementaryProduct() {
		super();
	}


	public int getElementaryProductId() {
		return elementaryProductId;
	}

	public void setElementaryProductId(int elementaryProductId) {
		this.elementaryProductId = elementaryProductId;
	}
	
	public int getBonusMalus() {
		return bonusMalus;
	}

	public void setBonusMalus(int bonusMalus) {
		this.bonusMalus = bonusMalus;
	}

	public int getDeductible() {
		return deductible;
	}

	public void setDeductible(int deductible) {
		this.deductible = deductible;
	}

	public int getComprehensive() {
		return comprehensive;
	}

	public void setComprehensive(int comprehensive) {
		this.comprehensive = comprehensive;
	}

	public int getPartial() {
		return partial;
	}

	public void setPartial(int partial) {
		this.partial = partial;
	}

	public int getLegacyPremium() {
		return legacyPremium;
	}

	public void setLegacyPremium(int legacyPremium) {
		this.legacyPremium = legacyPremium;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	@Override
	public String tableName() {
		return "elementaryProduct";
	}
	
}

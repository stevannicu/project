package model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import basic.BasicModel;

@XmlRootElement
public class SalesProduct implements BasicModel {
	
	private int salesProductId;
	
	private Date contractStart;
	
	private Date contractEnd;
	
	private String currency;

	public SalesProduct() {
		super();
	}

	public int getSalesProductId() {
		return salesProductId;
	}

	public void setSalesProductId(int salesProductId) {
		this.salesProductId = salesProductId;
	}

	public Date getContractStart() {
		return contractStart;
	}

	public void setContractStart(Date contractStart) {
		this.contractStart = contractStart;
	}

	public Date getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(Date contractEnd) {
		this.contractEnd = contractEnd;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String tableName() {
		return "salesProduct";
	}
	
}

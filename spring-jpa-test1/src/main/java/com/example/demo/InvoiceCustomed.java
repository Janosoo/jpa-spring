package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvoiceCustomed {
	
	@Id
	private long id;
	
	@Column(name = "CUSTOMER_ID")
	private long customerID;
	
	private Integer moneyAmount;
	
	private String CustomerFirstName;
	
	private String CustomerLastName;
	
	private String CustomerAddress;
	
	private String CustomerCity;
	
	private String CustomerProvince;
	
	private String CustomerCountry;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	public Integer getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(Integer moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	public String getCustomerFirstName() {
		return CustomerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		CustomerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return CustomerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		CustomerLastName = customerLastName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return CustomerCity;
	}

	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

	public String getCustomerProvince() {
		return CustomerProvince;
	}

	public void setCustomerProvince(String customerProvince) {
		CustomerProvince = customerProvince;
	}

	public String getCustomerCountry() {
		return CustomerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		CustomerCountry = customerCountry;
	}

	@Override
	public String toString() {
		return "InvoiceCustomed [id=" + id + ", customerID=" + customerID + ", moneyAmount=" + moneyAmount
				+ ", CustomerFirstName=" + CustomerFirstName + ", CustomerLastName=" + CustomerLastName
				+ ", CustomerAddress=" + CustomerAddress + ", CustomerCity=" + CustomerCity + ", CustomerProvince="
				+ CustomerProvince + ", CustomerCountry=" + CustomerCountry + "]";
	}
	
	
	public InvoiceCustomed() {
		// TODO Auto-generated constructor stub
	}

	public InvoiceCustomed(long id, long customerID, Integer moneyAmount, String customerFirstName,
			String customerLastName, String customerAddress, String customerCity, String customerProvince,
			String customerCountry) {
		this.id = id;
		this.customerID = customerID;
		this.moneyAmount = moneyAmount;
		this.CustomerFirstName = customerFirstName;
		this.CustomerLastName = customerLastName;
		this.CustomerAddress = customerAddress;
		this.CustomerCity = customerCity;
		this.CustomerProvince = customerProvince;
		this.CustomerCountry = customerCountry;
	}
	
	
	
	

}

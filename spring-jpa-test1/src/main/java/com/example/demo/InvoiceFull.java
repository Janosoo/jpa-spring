package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvoiceFull {
	
	@Id
	private long id;
	
	@Column(name = "CUSTOMER_ID")
	private long customer_id;
	
	@Column(name = "ADRESS_ID")
	private long adress_id;
	
	private Integer moneyAmount;
	
	private String firstName;
	
	private String lastName;
	
	private String adress;
	
	private String city;
	
	private String province;
	
	private String country;
	
	public InvoiceFull() {
	}

	public InvoiceFull(long id, long customer_id, long adress_id, Integer moneyAmount, String firstName,
			String lastName, String adress, String city, String province, String country) {
		this.id = id;
		this.customer_id = customer_id;
		this.adress_id = adress_id;
		this.moneyAmount = moneyAmount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.city = city;
		this.province = province;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public long getAdress_id() {
		return adress_id;
	}

	public void setAdress_id(long adress_id) {
		this.adress_id = adress_id;
	}

	public Integer getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(Integer moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "InvoiceFull [id=" + id + ", customer_id=" + customer_id + ", adress_id=" + adress_id + ", moneyAmount="
				+ moneyAmount + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + ", city="
				+ city + ", province=" + province + ", country=" + country + "]";
	}
	
	
}

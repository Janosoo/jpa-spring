package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String adress;
	
	private String city;
	
	private String province;
	
	private String country;
	
	@OneToOne(mappedBy = "adress")
	private Customer customer;
	
	protected Adress() {}
	
	public Adress(String adress, String city, String province, String country) {
		this.adress = adress;
		this.city = city;
		this.province = province;
		this.country = country;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	@Override
	public String toString() {
		return "Adress [id=" + id + ", adress=" + adress + ", city=" + city + ", province=" + province + ", country="
				+ country + ", customer=" + customer.getFirstName() + "]";
	}

	
	
	
	

}



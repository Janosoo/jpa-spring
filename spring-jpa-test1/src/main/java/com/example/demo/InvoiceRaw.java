package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVOICE")
public class InvoiceRaw {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "CUSTOMER_ID")
	private long customer_id;
	
	private Integer moneyAmount;
	
	public InvoiceRaw() {
		// TODO Auto-generated constructor stub
	}

	public InvoiceRaw(long customer_id, Integer moneyAmount) {
		this.customer_id = customer_id;
		this.moneyAmount = moneyAmount;
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



	public Integer getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(Integer moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	@Override
	public String toString() {
		return "InvoiceRaw [id=" + id + ", customer_id=" + customer_id + ", moneyAmount=" + moneyAmount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}


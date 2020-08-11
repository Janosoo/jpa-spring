package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  
  @JsonManagedReference
  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Adress adress;
  
  @JsonManagedReference
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", fetch = FetchType.LAZY)
  //@Transient
  private Set<Invoice> invoices;
  

  protected Customer() {}
  
  
  public Customer(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.invoices = new HashSet<>();
}

 
  public Customer(String firstName, String lastName, Adress adress) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.adress = adress;
	this.adress.setCustomer(this);
	this.invoices = new HashSet<>();
}
  








@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress
			+ ", invoices=" + invoices + "]";
}


public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

public Adress getAdress() {
	return adress;
}

public void setAdress(Adress adress) {
	this.adress = adress;
	adress.setCustomer(this);
}

public Set<Invoice> getInvoices() {
	return invoices;
}

public void setInvoices(Set<Invoice> invoices) {
	this.invoices = invoices;
	for (Invoice invoice : invoices) {
		invoice.setCustomer(this);
	}
	
}



}
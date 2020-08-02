package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Adress adress;
  
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
  private Set<Invoice> invoices;
  

  protected Customer() {}

 
  public Customer(String firstName, String lastName, Adress adress) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.adress = adress;
	this.adress.setCustomer(this);
	invoices = new HashSet<>();
}
  



@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + "]";
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
}

public Set<Invoice> getInvoice() {
	return invoices;
}

public void setInvoices(Set<Invoice> invoices) {
	this.invoices = invoices;
	for (Invoice invoice : invoices) {
		invoice.setCustomer(this);
	}
	
}

}
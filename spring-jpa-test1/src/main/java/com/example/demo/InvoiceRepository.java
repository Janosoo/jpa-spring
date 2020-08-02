package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

  List<Invoice> findByCustomer(Customer customer);

  Invoice findById(long id);

}

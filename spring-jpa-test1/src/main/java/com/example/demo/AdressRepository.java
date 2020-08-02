package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdressRepository extends CrudRepository<Adress, Long> {
	
	List<Adress> findByProvince(String province);
	
	Adress findById(long id);
	
}


package com.example.demo;



import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import servicios.CustomerService;
import servicios.InitialRunService;
import servicios.InvoiceCustomedService;

@ComponentScan({"controllers"})
@ComponentScan({"servicios"})
@SpringBootApplication
public class AccessingDataJpaApplication {

  private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataJpaApplication.class);
    
    
  }

  @Bean
  @Transactional
  public CommandLineRunner demo(InitialRunService initialRunService) {
    return (args) -> {
    	
    	initialRunService.updates();
    	
    	initialRunService.findAllCustomers();
    	
    	initialRunService.customerSpecificationTest();
    	
    	
    	
      
    };
  
    
  }

}
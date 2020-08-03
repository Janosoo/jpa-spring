package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

  private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataJpaApplication.class);
  }

  @Bean
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
      // save a few customers
      repository.save(new Customer("Jack", "Bauer", new Adress("Calle falsa 123", "Springfield", "Montana", "EEUU")));
      repository.save(new Customer("Chloe", "O'Brian", new Adress("Calle falsa 124", "Springfield", "Montana", "EEUU")));
      repository.save(new Customer("Kim", "Bauer", new Adress("Calle falsa 125", "Springfield", "Montana", "EEUU")));
      repository.save(new Customer("David", "Palmer", new Adress("Calle falsa 126", "Springfield", "Montana", "EEUU")));
      repository.save(new Customer("Michelle", "Dessler", new Adress("Calle falsa 127", "Springfield", "Montana", "EEUU")));



      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (Customer customer : repository.findAll()) {
        log.info(customer.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      Customer customer = repository.findById(1L);
      log.info("Customer found with findById(1L):");
      log.info("--------------------------------");
      log.info(customer.toString());
      log.info("");

      // fetch customers by last name
      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      repository.findByLastName("Bauer").forEach(bauer -> {
        log.info(bauer.toString());
      });
      // for (Customer bauer : repository.findByLastName("Bauer")) {
      //  log.info(bauer.toString());
      // }
      log.info("");
    };
  }
  
  
  @Bean
  public CommandLineRunner demo2(AdressRepository repository) {
    return (args) -> {
    	
      // save a few customers
    
     

      // fetch all customers
      log.info("Adress found with findAll():");
      log.info("-------------------------------");
      for (Adress adress : repository.findAll()) {
        log.info(adress.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      Adress adress = repository.findById(2L);
      log.info("Adress found with findById(2L):");
      log.info("--------------------------------");
      log.info(adress.toString());
      log.info("");

      // fetch customers by last name
      log.info("Adress found with findByProvince('Montana'):");
      log.info("--------------------------------------------");
      repository.findByProvince("Montana").forEach(Montana -> {
        log.info(Montana.toString());
      });
      // for (Customer bauer : repository.findByLastName("Bauer")) {
      //  log.info(bauer.toString());
      // }
      log.info("");
    };
  }
  
  @Bean
  public CommandLineRunner demo3(InvoiceRawRepository repository) {
    return (args) -> {
      // save a few customers
    	
        repository.save(new InvoiceRaw(1L, 1990));
        repository.save(new InvoiceRaw(1L, 1992));
        repository.save(new InvoiceRaw(1L, 1991));
        repository.save(new InvoiceRaw(3L, 2990));

      // fetch all customers
      log.info("Adress found with findAll():");
      log.info("-------------------------------");
      for (InvoiceRaw invoice : repository.findAll()) {
        log.info(invoice.toString());
      }
      log.info("");

    };
  }
  
  @Bean
  public CommandLineRunner demo4(InvoiceRepository repository) {
    return (args) -> {
      // save a few customers
    	


      // fetch all customers
      log.info("Adress found with findAll():");
      log.info("-------------------------------");
      for (Invoice invoice : repository.findAll()) {
        log.info(invoice.toString());
      }
      

    };
  }
  
  
  @Bean
  public CommandLineRunner demo5(CustomerRepository repository) {
    return (args) -> {
      // save a few customers


      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (Customer customer : repository.findAll()) {
        log.info(customer.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      Customer customer = repository.findById(1L);
      log.info("Customer found with findById(1L):");
      log.info("--------------------------------");
      log.info(customer.toString());
      log.info("");

      // fetch customers by last name
      log.info("Customer found with findByLastName('Bauer'):");
      log.info("--------------------------------------------");
      repository.findByLastName("Bauer").forEach(bauer -> {
        log.info(bauer.toString());
      });
      // for (Customer bauer : repository.findByLastName("Bauer")) {
      //  log.info(bauer.toString());
      // }
      log.info("");
    };
  }

}
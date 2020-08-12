package servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccessingDataJpaApplication;
import com.example.demo.Adress;
import com.example.demo.AdressRepository;
import com.example.demo.Customer;
import com.example.demo.CustomerRepository;
import com.example.demo.Invoice;
import com.example.demo.InvoiceCustomed;
import com.example.demo.InvoiceCustomedRepository;
import com.example.demo.InvoiceRaw;
import com.example.demo.InvoiceRawRepository;
import com.example.demo.InvoiceRepository;
import specifications.CustomerSpecification;
import specifications.CustomerSpecificationBuilder;
import specifications.InvoiceSpecificationBuilder;
import specifications.SearchCriteria;
import specifications.SearchOperation;
import specifications.SpecSearchCriteria;

@Service
public class InitialRunService {
	
	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AdressRepository adressRepository; 
	
	@Autowired
	private InvoiceRawRepository invoiceRawRepository;
	
	@Autowired 
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private InvoiceCustomedService invoiceCustomedService;
	
	@Autowired
	
	private InvoiceCustomedRepository InvoiceCustomerRepository;
	
	
	
	@Transactional
	  public void updates() {
	  	
		    
		  // save a few customers
		     customerRepository.saveAndFlush(new Customer("Jack", "Bauer", new Adress("Calle falsa 123", "Springfield", "Montana", "EEUU")));
		     customerRepository.saveAndFlush(new Customer("Chloe", "O'Brian", new Adress("Calle falsa 124", "Springfield", "Montana", "EEUU")));
		     customerRepository.saveAndFlush(new Customer("Kim", "Bauer", new Adress("Calle falsa 125", "Springfield", "Montana", "EEUU")));
		     customerRepository.saveAndFlush(new Customer("David", "Palmer", new Adress("Calle falsa 126", "Springfield", "Montana", "EEUU")));
		     customerRepository.saveAndFlush(new Customer("Michelle", "Dessler", new Adress("Calle falsa 127", "Springfield", "Montana", "EEUU")));



		     // fetch all customers
		     log.info("Customers found with findAll():");
		     log.info("-------------------------------");
		     for (Customer customer : customerRepository.findAll()) {
		       log.info(customer.toString());
		     }
		     log.info("");

		     // fetch an individual customer by ID
		     Customer customer = customerRepository.findById(1L);
		     log.info("Customer found with findById(1L):");
		     log.info("--------------------------------");
		     log.info(customer.toString());
		     log.info("");

		     // fetch customers by last name
		     log.info("Customer found with findByLastName('Bauer'):");
		     log.info("--------------------------------------------");
		     customerRepository.findByLastName("Bauer").forEach(bauer -> {
		       log.info(bauer.toString());
		     });
		     // for (Customer bauer : repository.findByLastName("Bauer")) {
		     //  log.info(bauer.toString());
		     // }
		     log.info("");
		     
		     
		     // save a few customers
		     
		     

		      // fetch all customers
		      log.info("Adress found with findAll():");
		      log.info("-------------------------------");
		      for (Adress adress : adressRepository.findAll()) {
		        log.info(adress.toString());
		      }
		      log.info("");

		      // fetch an individual customer by ID
		      Adress adress = adressRepository.findById(2L);
		      log.info("Adress found with findById(2L):");
		      log.info("--------------------------------");
		      log.info(adress.toString());
		      log.info("");

		      // fetch customers by last name
		      log.info("Adress found with findByProvince('Montana'):");
		      log.info("--------------------------------------------");
		      adressRepository.findByProvince("Montana").forEach(Montana -> {
		        log.info(Montana.toString());
		      });
		      // for (Customer bauer : repository.findByLastName("Bauer")) {
		      //  log.info(bauer.toString());
		      // }
		      log.info("");
		      
		      
		      
		      invoiceRawRepository.save(new InvoiceRaw(1L, 1990));
		        invoiceRawRepository.saveAndFlush(new InvoiceRaw(1L, 1992));
		        invoiceRawRepository.saveAndFlush(new InvoiceRaw(1L, 1991));
		        invoiceRawRepository.saveAndFlush(new InvoiceRaw(3L, 2990));

		      // fetch all customers
		      log.info("Adress found with findAll():");
		      log.info("-------------------------------");
		      for (InvoiceRaw invoice : invoiceRawRepository.findAll()) {
		        log.info(invoice.toString());
		      }
		      log.info("");
		      
		      
				 // fetch all customers
		      log.info("Invoices found with findAll():");
		      log.info("-------------------------------");
		      for (Invoice invoice : invoiceRepository.findAll()) {
		        log.info(invoice.toString());
		      }
		     
		      
		      
		      
		      
		  
		      
		      
		      // fetch all customers
		      log.info("Customers found with findAll():");
		      log.info("-------------------------------");
		      
		      Integer cuenta = customerService.invoicesAmount(1L);
		      
		      log.info("La cuenta total es " + cuenta);
		      log.info("");
		      
		      
		      
		      
		      
		      
		      invoiceCustomedService.updateInvoiceCustomed();
		      // fetch all customers
		      log.info("Customers found with findAll():");
		      log.info("-------------------------------");
		      
		      
		      
		      for (InvoiceCustomed invoiceCustomed : InvoiceCustomerRepository.findAll()) {
		          log.info(invoiceCustomed.toString());}
		      
		      
		      log.info("");

		    };
		    
		    @Transactional
		    public void findAllCustomers() {
		    	 // save a few customers


			      // fetch all customers
			      log.info("Customers found with findAll():");
			      log.info("-------------------------------");
			      for (Customer customer1 : customerRepository.findAll()) {
			        log.info(customer1.toString());
			      }
			      log.info("");

			      // fetch an individual customer by ID
			      Customer customer1 = customerRepository.findById(1L);
			      
			      log.info("Customer found with findById(1L):");
			      log.info("--------------------------------");
			      log.info(customer1.toString());
			      log.info("");

			      // fetch customers by last name
			      log.info("Customer found with findByLastName('Bauer'):");
			      log.info("--------------------------------------------");
			      customerRepository.findByLastName("Bauer").forEach(bauer -> {
			        log.info(bauer.toString());
			      });
			      // for (Customer bauer : repository.findByLastName("Bauer")) {
			      //  log.info(bauer.toString());
			      // }
			      log.info("");
		    }
		    
		    @Transactional
		    public void customerSpecificationTest() {
		    	CustomerSpecificationBuilder builder = new CustomerSpecificationBuilder();
		    	 
	    	    SpecSearchCriteria spec = new SpecSearchCriteria("firstName", SearchOperation.EQUALITY, "Jack");
	    	    SpecSearchCriteria spec1 = new SpecSearchCriteria("AND","lastName", SearchOperation.EQUALITY, "Bauer");
	    	    List<Customer> results = customerRepository.findAll(builder.with(spec).with(spec1).build());
	    	    log.info("LISTA DE CUSTOMER CON SPEC");
	    	    for(Customer customer: results) {
	    	    	log.info(customer.toString());
	    	    }
	    }
		   @Transactional 
		   public void invoiceSpecificationTest() {
			   
			   InvoiceSpecificationBuilder builder = new InvoiceSpecificationBuilder();
			   
			   SpecSearchCriteria spec = new SpecSearchCriteria("moneyAmount", SearchOperation.GREATER_THAN, 1990);
			   List<Invoice> results = InvoiceRepository.findAll(builder.with(spec).build());
			   
			   
		   }
	    
	
		    
		    
		    
		    


}

package servicios;

import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccessingDataJpaApplication;
import com.example.demo.Adress;
import com.example.demo.Customer;
import com.example.demo.CustomerRepository;
import com.example.demo.Invoice;


@Service
public class CustomerService implements ICustumerService {
	
	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	@Autowired
	private CustomerRepository repository;
	
	
	@Transactional
	public Integer invoicesAmount(long id){
		
		
		log.info("Customer de servicio");
		
		Customer customer = repository.findById(id);
		
		log.info(customer.toString());
		
		
		Set<Invoice> invoices = customer.getInvoices();
		

		
		
		Integer amount = 0; 
		
		for(Invoice invoice : invoices){
			log.info(invoice.toString());
			amount += invoice.getMoneyAmount();
			   System.out.println(amount);
			}
		
		return amount;
		
		
		
	}
	
	

	
	
	

}

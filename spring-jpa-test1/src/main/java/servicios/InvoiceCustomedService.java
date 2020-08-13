package servicios;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Adress;
import com.example.demo.Customer;
import com.example.demo.CustomerRepository;
import com.example.demo.Invoice;
import com.example.demo.InvoiceCustomed;
import com.example.demo.InvoiceCustomedRepository;

@Service
public class InvoiceCustomedService {
	
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private InvoiceCustomedRepository invoiceCustomedRepository;
	
	@Transactional
	public void updateInvoiceCustomed() {
		
		for (Customer customer: customerRepository.findAll()) {
			
			Adress adress = customer.getAdress();
			
			Set<Invoice> invoices = customer.getInvoices();
			
			for(Invoice invoice: invoices) {
				
				InvoiceCustomed invoiceCustomed = new InvoiceCustomed(invoice.getId(), customer.getId(), invoice.getMoneyAmount(), 
						customer.getFirstName(), customer.getLastName(), adress.getAdress(), adress.getCity(), adress.getProvince(), 
						adress.getCountry());
				
				invoiceCustomedRepository.save(invoiceCustomed);
				
				
						
			}
			
			
			
		}
		
		
	}
	

}

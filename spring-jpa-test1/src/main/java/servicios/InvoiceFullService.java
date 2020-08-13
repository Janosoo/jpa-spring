package servicios;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccessingDataJpaApplication;
import com.example.demo.Invoice;
import com.example.demo.InvoiceFull;
import com.example.demo.InvoiceRepository;
import com.example.demo.InvoiceFullRepository;



@Service
public class InvoiceFullService {
	
	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Autowired 
	private InvoiceFullRepository invoiceFullRepository;
	
	@Transactional
	public void updateTable( ) {
		log.info("Comenzando a guardar informacion en tabla");
		for (Invoice invoice : invoiceRepository.findAll()) {
			invoiceFullRepository.save(new InvoiceFull(invoice.getId(), 
					invoice.getCustomer().getId(), 
					invoice.getCustomer().getAdress().getId(), 
					invoice.getMoneyAmount(), invoice.getCustomer().getFirstName(), 
					invoice.getCustomer().getLastName(), 
					invoice.getCustomer().getAdress().getAdress(), 
					invoice.getCustomer().getAdress().getCity(), 
					invoice.getCustomer().getAdress().getProvince(),
					invoice.getCustomer().getAdress().getCountry()));	
		}

		
	}
	

}

package controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.InvoiceRaw;
import com.example.demo.InvoiceRawRepository;

@RestController
@RequestMapping("/invoicing")
public class InvoiceRawRestController {
	
	@Autowired
	private InvoiceRawRepository repository;
	
	
	@GetMapping("/invoices")
	public List<InvoiceRaw> index(){
		return (List<InvoiceRaw>) repository.findAll();
		
	}
	
	@PostMapping("/invoices/lessthan")
	public List<InvoiceRaw> invoicesLess(@RequestBody Integer moneyAmount){
		return (List<InvoiceRaw>) repository.findByMoneyAmountLessThan(moneyAmount);
		
	}
	
	@GetMapping("/invoices/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
		
	}
	
	
	@PostMapping("/invoices")
	@ResponseStatus(HttpStatus.CREATED)
	public InvoiceRaw create(@RequestBody InvoiceRaw invoice) {
		return repository.save(invoice);
	}
	
	
	
	@PutMapping("/invoices/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public InvoiceRaw update(@RequestBody InvoiceRaw updatedInvoiceRaw, @PathVariable Long id) {

		InvoiceRaw invoiceRaw = repository.findById(id).get();
		
		
		invoiceRaw.setCustomer_id(updatedInvoiceRaw.getCustomer_id());		
		invoiceRaw.setMoneyAmount(updatedInvoiceRaw.getMoneyAmount());		
		return repository.save(invoiceRaw);
	

	}

}

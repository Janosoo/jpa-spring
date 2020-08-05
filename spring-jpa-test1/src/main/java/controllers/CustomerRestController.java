package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Customer;
import com.example.demo.CustomerRepository;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/customer")
	public List<Customer> index(){
		return (List<Customer>) repository.findAll();
		
	}

}

package com.customer.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.details.model.CustomerDetails;
import com.customer.details.service.CustomerDetailsService;

@RestController
@RequestMapping("/contact")
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService customerserv;
	
	@GetMapping
	public ResponseEntity<List<CustomerDetails>> getCustomers(){
		return new ResponseEntity<>(customerserv.getCustomers(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addCustomer(@RequestBody CustomerDetails bill) {
		customerserv.addCustomer(bill);
	}
	
	

}

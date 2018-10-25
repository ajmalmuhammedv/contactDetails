package com.customer.details.service;

import java.util.List;

import com.customer.details.model.CustomerDetails;



public interface CustomerDetailsService {
	
	List<CustomerDetails> getCustomers();
	void addCustomer(CustomerDetails bill);

}

package com.customer.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.details.dao.CustomerDetailsDao;
import com.customer.details.model.CustomerDetails;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	public CustomerDetailsDao customerDao;

	@Override
	public List<CustomerDetails> getCustomers() {
	   return customerDao.findAll();
	}

	@Override
	public void addCustomer(CustomerDetails bill) {
		customerDao.save(bill);
	}

}

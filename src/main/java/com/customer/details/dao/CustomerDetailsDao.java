package com.customer.details.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.details.model.CustomerDetails;

public interface CustomerDetailsDao extends JpaRepository<CustomerDetails, Integer> {
	
	

}

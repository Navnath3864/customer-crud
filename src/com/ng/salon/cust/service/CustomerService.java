package com.ng.salon.cust.service;

import com.ng.salon.cust.model.Customer;

public interface CustomerService {
	/**
	 * this method will save and return customer customer as param will be saved
	 * into database Customer as return type will be return after saved into
	 * database.
	 * 
	 * @param customer
	 * @return
	 */
	// this is method declaration
	Customer saveCustomer(Customer customer);

}

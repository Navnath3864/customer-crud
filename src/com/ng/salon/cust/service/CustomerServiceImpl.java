package com.ng.salon.cust.service;

import com.ng.salon.cust.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer saveCustomer(Customer customer) {
		// Logic / implememntation to store /save customer into DB
		// assume customer is store into database and id is returned
		customer.id = customer.id;
		return customer;
	}

}

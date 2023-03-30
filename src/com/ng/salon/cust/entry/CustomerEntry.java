package com.ng.salon.cust.entry;

import com.ng.salon.cust.model.Customer;
import com.ng.salon.cust.service.CustomerService;
import com.ng.salon.cust.service.CustomerServiceImpl;

public class CustomerEntry {
	public static void main(String[] args) {
		System.out.println("Starting customer service");
		Customer cust = new Customer();
		cust.fName = "Navnath";
		cust.lName = "Gutte";
		cust.address = "Kasarwadi";
		cust.mobNumber = "9665653864";
		CustomerService custService = new CustomerServiceImpl();
		Customer custResponse = custService.saveCustomer(cust);
		System.out.println(custResponse.id);
		
		Customer cust2 = new Customer();
		cust2.fName = "hfv";
		cust2.lName = "Gutte";
		cust2.address = "Kasarwadi";
		cust2.mobNumber = "9159";
		Customer custResponse2 = custService.saveCustomer(cust2);
		System.out.println(custResponse2.mobNumber);
	}
}

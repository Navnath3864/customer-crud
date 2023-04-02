package com.ng.salon.billing.service;

import com.ng.salon.billing.bill.Bill;
import com.ng.salon.cust.model.Customer;
import com.ng.salon.product.model.Product;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillServiceImpl implements BillService {

	@Override
	public Bill generateBill(Customer customer, Product product, int quantity) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();  
		Bill bill = new Bill();
		bill.id = 6;
		bill.date=formatter.format(date);
		bill.customerName=(customer.fName).concat("").concat(customer.fName);
		bill.mobileNumber=customer.mobNumber;
		bill.productName=product.name;
		bill.quantity=quantity;
		bill.total=(product.price)*quantity;
		return bill;
	}

}

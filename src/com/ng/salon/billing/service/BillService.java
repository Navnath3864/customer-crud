package com.ng.salon.billing.service;

import com.ng.salon.billing.bill.Bill;
import com.ng.salon.cust.model.Customer;
import com.ng.salon.product.model.Product;

public interface BillService {
 Bill generateBill(Customer customer,Product product,int quantity);
}

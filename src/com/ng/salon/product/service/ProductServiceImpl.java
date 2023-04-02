package com.ng.salon.product.service;

import com.ng.salon.product.productdetails.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public Product addProduct(Product product) {
		//new id is set and returned.
		product.id = 1;
		return product;
	}

	@Override
	public Product getProductById(int id) {
		Product product = new Product();
		product.id = id;
		product.name = "Loreal";
		product.price = 600;
		product.desc = "shampoo";
		return product;
	}

	@Override
	public Product getProductByName(String name) {
		Product product = new Product();
		product.id = 2;
		product.name = name;
		product.price = 600;
		product.desc = "Conditioner";
		return product;
	}

}

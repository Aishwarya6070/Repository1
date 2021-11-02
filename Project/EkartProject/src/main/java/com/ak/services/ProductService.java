package com.ak.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.ak.models.Product;

@Service 
public class ProductService {

	private static final Predicate<? super Product> strategy = null;

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123", "Tobbacraft", "Party White Cluth-Regular Size ", 400.4, "Tooba Handicraft"));
		listOfProducts.add(new Product("124", "Leather Land", "Brown Women Sling Bag-Regular Size", 300.4, "Belladona Designer "));
		listOfProducts.add(new Product("125", "Baggit", "Casual Multicolor Bag", 200.4, "Baggit india"));

		return listOfProducts;
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}

	public Object getPayment() {
		// TODO Auto-generated method stub
		return null;
	}
}



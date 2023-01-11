package com.skillstorm.practice.services;

import java.util.List;

import com.skillstorm.practice.models.Product;

public interface ProductService {
	
	// CRUD functions
	
	Iterable<Product> findAll();
	
	Product findById(int id);
	
	Iterable<Product> findByName(String name);
	
	Product save(Product product);
	
	Product update(Product product);
	
	void delete(Product product);
	
	void deleteById(int id);
	
	void deleteAll(List<Product> products);

}

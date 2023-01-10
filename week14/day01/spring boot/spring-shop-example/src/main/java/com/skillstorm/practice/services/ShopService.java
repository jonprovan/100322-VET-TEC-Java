package com.skillstorm.practice.services;

import java.lang.Iterable;

import com.skillstorm.practice.models.Shop;

public interface ShopService {
	
	// CRUD functionality
	
	Iterable<Shop> findAll();
	
	Shop findById(int id);
	
	Shop save(Shop shop);
	
	Shop update(Shop shop);
	
	void delete(Shop shop);

	void deleteById(int id);

}

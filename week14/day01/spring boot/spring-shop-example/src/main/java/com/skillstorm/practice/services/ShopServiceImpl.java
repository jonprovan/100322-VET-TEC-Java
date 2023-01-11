package com.skillstorm.practice.services;

import java.lang.Iterable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.practice.models.Shop;
import com.skillstorm.practice.repositories.ShopRepository;

@Service // this tells spring boot this class is a "component" that it needs to create an instance of at startup
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository repository;

	@Override
	public Iterable<Shop> findAll() {
		return repository.findAll();
	}

	@Override
	public Shop findById(int id) {
		Optional<Shop> shop = repository.findById(id);
		return shop.isPresent() ? shop.get() : null;
	}

	
	// This method could work two ways:
	// 1. check if it exists already, if so don't overwrite it
	// 2. go ahead and save it, if it already exists it will be overwritten
	@Override
	public Shop save(Shop shop) { // The save implementation 
		// Method 1:
		if (!repository.existsById(shop.getId())) {
			System.out.println("Inside service save " + shop);
			Shop createdShop =  repository.save(shop);
			System.out.println("Created shop " + createdShop);
			return createdShop;
		}
		return shop;
	}

	// This method will be only slightly different
	// If the given id doesn't exist, don't do anything
	@Override
	public Shop update(Shop shop) {
		if (repository.existsById(shop.getId())) {
			return repository.save(shop); // I cannot change the id because I can't search by one Id and set with another id
		}                                 // Idea to implement this: delete the entry of the old idea using deleteById() and save(shop) with new id
		return null; 
	}
	
	@Override
	public void deleteById(int id) {
		if (repository.existsById(id))
			repository.deleteById(id); // org.springframework.dao.EmptyResultDataAccessException: No class com.skillstorm.practice.models.Shop entity with id 3 exists!
	}

	@Override
	public void delete(Shop shop) {
		repository.delete(shop);
	}

}

package com.skillstorm.practice.services;

import java.lang.Iterable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public Shop save(Shop shop) {
		return repository.save(shop);
	}

	@Override
	public Shop update(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Shop shop) {
		// TODO Auto-generated method stub
		
	}

}

package com.skillstorm.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.practice.models.Product;
import com.skillstorm.practice.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repo;

	@Override
	public Iterable<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Product> findByName(String name) {
		return repo.findByNameLikeIgnoreCase(name);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product product, int id) {
		if (product == null || !repo.existsById(id)) {
			return null;
		} else {
			product.setId(id);
			return repo.save(product);
		}
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(List<Product> products) {
		// TODO Auto-generated method stub
		
	}

}

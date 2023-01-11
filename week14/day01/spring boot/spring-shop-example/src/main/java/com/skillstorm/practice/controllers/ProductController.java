package com.skillstorm.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.practice.dtos.ProductDto;
import com.skillstorm.practice.models.Product;
import com.skillstorm.practice.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public Iterable<Product> findAll(@RequestParam(name = "name", required = false) String name) {
		if (name == null)
			return service.findAll();
		return service.findByName(name);
	}
	
	@GetMapping("/{id}")
	public ProductDto findById(@PathVariable int id) {
		return null;
	}
	
	// java.lang.IllegalStateException: Ambiguous handler methods mapped for '/products/1'
//	@GetMapping("/{name}") // this is identical path to /{id} just a diff variable name, so instead
//	@GetMapping("/name/{name}")
//	@GetMapping // instead have them /products?name=bread&type=white
//	public Iterable<Product> findByName(@RequestParam(name = "name") String name) { // Prefered solution bc we are filtering not identifying one resource
//		return service.findByName(name);
//	}
//	
	
	

}

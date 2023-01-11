package com.skillstorm.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	public Product findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	// java.lang.IllegalStateException: Ambiguous handler methods mapped for '/products/1'
//	@GetMapping("/{name}") // this is identical path to /{id} just a diff variable name, so instead
//	@GetMapping("/name/{name}")
//	@GetMapping // instead have them /products?name=bread&type=white
//	public Iterable<Product> findByName(@RequestParam(name = "name") String name) { // Prefered solution bc we are filtering not identifying one resource
//		return service.findByName(name);
//	}
//	
	
	// 200 successful or 404 not found or 400 bad request if couldn't find it
	@PutMapping("/{id}")
	public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable int id) {
		Product result = service.update(product, id);
		if (result == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(product);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product save(@RequestBody Product product) {
		return service.save(product);
	}
	
	@DeleteMapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Product product) {
		service.delete(product);
	}
	
	@DeleteMapping("/{id}") 
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delte(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@DeleteMapping("/all") // not the best solution, TODO handle the ambiguous delete mapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteAll(@RequestBody List<Product> products) {
		service.deleteAll(products);
	}

}

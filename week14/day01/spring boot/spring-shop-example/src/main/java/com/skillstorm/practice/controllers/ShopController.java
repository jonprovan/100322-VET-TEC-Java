package com.skillstorm.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.skillstorm.practice.models.Shop;

import com.skillstorm.practice.services.ShopService;


@Controller // This
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired // this gets created for us
	private ShopService service; // this is property dependency injection (rather than constructor dependency injection)
	
// Method 1 of defining our api endpoints
//	@RequestMapping(value = "/shop", method = RequestMethod.GET)
//	public @ResponseBody List<Shop> findAll() {
//		System.out.println("Inside findAll");
//		return null;
//	}
	
// Method 2
//	@GetMapping("/shop") // warning: if this defined at the class level, don't define it here! or it will be /shop/shop
	
// Method 3
	@GetMapping // convenience annotation that lets us avoid passing a bunch of parameters
	public @ResponseBody Iterable<Shop> findAll() {
		System.out.println("Inside findAll");
		
		return service.findAll();
	}
	
	// I will define a more specific path for this GET
	@GetMapping("/{id}") // { } tells Spring Boot this endpoint has a path parameter we want to parse
	public @ResponseBody Shop findById(@PathVariable int id) { // if variable name does not match, specify it @PathVariable(name = "id")
		
		System.out.println("Inside findById");
		return service.findById(id);
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.POST)
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Shop save(Shop shop) {
		System.out.println("Inside save");
		return service.save(shop);
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.PUT)
	@PutMapping
	public @ResponseBody Shop update(Shop shop) {
		System.out.println("Inside update");
		return service.update(shop);
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
//	public @ResponseBody void deleteById(int id) {
//		System.out.println("Inside deleteById");
//		return null;
//	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void delete(Shop shop) {
		System.out.println("Inside delete");
		service.delete(shop);
	}

}

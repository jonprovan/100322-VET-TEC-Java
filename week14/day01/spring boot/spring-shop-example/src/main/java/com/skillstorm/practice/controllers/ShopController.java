package com.skillstorm.practice.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.skillstorm.practice.models.Shop;

import com.skillstorm.practice.services.ShopService;


@Controller // This is better for controllers that return views (html pages)
@RequestMapping("/shop")
public class ShopController {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
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
		log.debug("Inside findAll");
		
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
	public @ResponseBody Shop save(@RequestBody Shop shop) {
		System.out.println("Inside controller save " + shop);
		Shop shopCreated = service.save(shop);
		System.out.println("Inside controller save " + shopCreated);
		return shopCreated;
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.PUT)
	@PutMapping("/{id}")
	public @ResponseBody Shop update(@RequestBody Shop shop, @PathVariable int id) {
		System.out.println("Inside update");
		shop.setId(id); // probably better to do this in the Service layer, controller should just forward everything to the service
		return service.update(shop); // TODO if returns null update the status code to not 200 OK
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
	@DeleteMapping("/{id}") // TODO 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void deleteById(@PathVariable("id") int id) {
		// Trying changing the return type to ResponseEntity<> with manually setting the response entity status code
		System.out.println("Inside deleteById");
		service.deleteById(id);
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public @ResponseBody void delete(@RequestBody Shop shop) {
		System.out.println("Inside delete");
		service.delete(shop);
	}

}

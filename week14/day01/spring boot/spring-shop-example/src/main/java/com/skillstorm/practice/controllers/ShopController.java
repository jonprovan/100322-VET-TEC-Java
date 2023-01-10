package com.skillstorm.practice.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skillstorm.practice.models.Shop;



@Controller
public class ShopController {
	
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public @ResponseBody List<Shop> findAll() {
		System.out.println("Inside findAll");
		return null;
	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.POST)
	public @ResponseBody Shop save(Shop shop) {
		System.out.println("Inside save");
		return null;
	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.PUT)
	public @ResponseBody Shop update() {
		System.out.println("Inside update");
		return null;
	}
	
//	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
//	public @ResponseBody List<Shop> deleteById(int id) {
//		System.out.println("Inside deleteById");
//		return null;
//	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.DELETE)
	public @ResponseBody List<Shop> delete(Shop shop) {
		System.out.println("Inside findAll");
		return null;
	}

}

package com.skillstorm.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.services.DummyService;

@RestController
public class HelloController {

	@Autowired
	private DummyService service;
	
	@GetMapping("/hello")
	public String hello() {
		service.doSomething();
		return "<h1>Hello Spring Security!</h1>";
	}
	
	@GetMapping("/admin/hello")
	public String adminHello() {
		return "Super secret admin stuff";
	}
}

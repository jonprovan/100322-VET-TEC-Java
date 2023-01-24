package com.skillstorm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Message;
import com.skillstorm.services.MessageService;

@RestController
public class HelloController {
	
	@Autowired
	MessageService service;

	@GetMapping("/hello")
	public Iterable<Message> findAll() {
		return service.findAll();
	}
}
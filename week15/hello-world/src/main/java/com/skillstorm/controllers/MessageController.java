package com.skillstorm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Message;
import com.skillstorm.services.MessageService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")
public class MessageController {
	
	@Autowired
	MessageService service;
	
	@GetMapping
	public Iterable<Message> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Message save(@RequestBody Message message) {
		return service.save(message);
	}

}

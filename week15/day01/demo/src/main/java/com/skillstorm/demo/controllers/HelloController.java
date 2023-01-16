package com.skillstorm.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.Hello;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public Hello hello() {
		Hello msg = new Hello();
		msg.setMessage("Hello World!");
		msg.setUrgent(true);
		return msg;
	}
}

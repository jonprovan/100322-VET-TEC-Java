package com.skillstorm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Message;

@RestController // This tells Spring that I will return data in the body of responses instead of HTML views
// @Controller
// @ResponseBody
public class HelloController {

	@GetMapping("/hello")
	public Message hello() {
		Message msg = new Message("Hello world!", true);
		return msg;
	}
	
}

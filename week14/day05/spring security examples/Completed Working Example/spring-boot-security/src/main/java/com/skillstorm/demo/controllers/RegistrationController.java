package com.skillstorm.demo.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.dto.UserDto;
import com.skillstorm.demo.services.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	// POST requires me to have the CSRF token by default
	@PostMapping("/register")
	// Auto unpacks username and password from request body
	public void register(@RequestBody UserDto user) {
		service.register(user.getUsername(), user.getPassword());
	}
	
	@GetMapping("/admin/users")
	public List<UserDto> findAll(Principal principal, Authentication auth) {
		// Grab from the SecurityContext the authenticated user
		System.out.println(principal.getName());
		// Authentication is the same as principal, but with way more material
		System.out.println(auth.getAuthorities());
		return service.findAll();
	}
	
}

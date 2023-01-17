package com.skillstorm.demo.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

	@PreAuthorize("hasAnyRole('ADMIN')")
	public void doSomething() {}
}

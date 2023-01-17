package com.skillstorm.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncryptionConfiguration {

	@Bean // This will let Spring know I will need this for dependency injection, so it will create one for me at application startup
	@Primary
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(10); // we have to use the same number we used for our dummy data in our database passwords saved so far
	}
}

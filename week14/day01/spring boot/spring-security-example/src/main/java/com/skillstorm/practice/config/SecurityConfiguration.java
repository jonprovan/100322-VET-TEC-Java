package com.skillstorm.practice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	// NOTE: The class we are extending is deprecated bc instead we should be configuring using beans
	// We will just override methods bc it is easier to understand for now
	// To see the bean configuration technique go to https://howtodoinjava.com/spring-boot2/security-rest-basic-auth-example/
	
	// To use Postman with basic auth set up, 
	// - Go under Authentication
	// - Put in user and the generated password
	// - after the first request, you can go ahead and remove that authorization header, and requests can still go through bc of the JSession cookie
	// - If you delete jsession cooklie, you're effefctively logged out
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// -----------------------------------------
		// By overriding this method and not including anything, I've turned all security of
//		http.formLogin(); // This is the default login page behaviour we saw
		http.httpBasic(); // This is the one that is going to make most sense if you decide to do this with your rest endpoints
		
		
		// -----------------------------------------------------------------------------------
		// Because post is not "safe" aka it can update the state of the database, by default csrf filter is enabled
		// To disable this we need to 
		http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

		// -----------------------------------------------------------------------------------
		// This is how we can control which api endpoints need authentication and/or authorization
		http.authorizeHttpRequests().mvcMatchers("/**").authenticated(); // Every HTTP request MUST be authenticated
		http.authorizeHttpRequests().mvcMatchers("/logout").permitAll(); // Let anyone call logout
		
	}
}

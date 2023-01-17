package com.skillstorm.practice.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

// We are going to use JDBC (Uses some sql schema to store users and role)
// - Spring has multiple options:
//   - In-memory (only for testing like what we are doing for demo purposes only the data doesn't persist whe nthe application shuts down)
//   - LDP (Lighweight Directory Access Protocol) 
//   - SAML (SSO)
//   - JDBC is what we are using in this


// JDBC
/*
 * 1. Extract the username and password from the Authorization header
 * 2. (Sent with some Base64 encoding it will have to unencode it)
 * 3. Hash the password with Bcrypt (one way hashing that is done repeatedly a number of times ex: 8-12 so well scrambled but not too slow)
 * 4. Get the username, password, enabled from the database
 * 5. If enabled then continue else stop here and send back 401
 * 6. compare the passwords that are both hashed 
 * 7. at this point they are authenticated and the request can go to the controller
 */

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	// NOTE: The class we are extending is deprecated bc instead we should be configuring using beans
	// We will just override methods bc it is easier to understand for now
	// To see the bean configuration technique go to https://howtodoinjava.com/spring-boot2/security-rest-basic-auth-example/
	
	// To use Postman with basic auth set up, 
	// - Go under Authentication
	// - Put in user and the generated password from the spring tool suite console
	// - after the first request, you can go ahead and remove that authorization header, and requests can still go through bc of the JSession cookie
	// - If you delete jsession cooklie, you're effefctively logged out
	
	
	@Autowired
	private DataSource datasource; // make sure this is from javax.sql!!!
	
	@Autowired // This give me bcrypt
	private EncryptionConfiguration encoder; // define this in a seperate configuration file
	
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
	
	
	// Tell it about the encryption of passwords
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(encoder);
		
	}

}

package com.skillstorm.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

// Spring Boot will auto @Import your configuration classes
// Adding this class will override the default behavior of Spring Security
@Configuration
// The deprecated class still works even when removed for backwards compatability reasons
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource datasource;
	
	@Autowired // This gives me BCrypt
	private PasswordEncoder encoder;
	
	// Spring will recognize this name
	@Autowired // Autowires the AuthenticationManagerBuilder object using setter injection
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// In Spring Security there are multiple options for auth
		// In-Memory (Not production. For test purposes)
		// LDAP (Lightweight Directory Access Protocol) Linux, Windows Active Directory
		// SAML (SSO)
		// JDBC (Uses some SQL schema to store users and roles)
		
		/*
		 * Steps for JDBC Auth
		 * 1. Extract the username and password from the Authorization Header
		 * 2. Decode the Base64 encoded password and username
		 * 3. Hash the password with BCrypt
		 * 4. JDBC Auth select username, password, enabled from users where username = ?
		 * 5. If enabled == true ? proceed : 401 status code
		 * 6. At this point they are authenticated and proceed to DispatcherServlet
		 * 7. User Principal (User Details) is stored in the HttpSession
		 */
		
		// JDBC auth FORCES you to use a password encoder
		auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(encoder);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Overridding this method removes all the default spring security behavior
//		http.formLogin();
		http.httpBasic();
//		http.csrf().disable(); // Do not this in production
		// This will generate me the CSRF Cookie
		// To access any endpoint, I now need a X-XSRF-TOKEN header containing the value of cookie
		// This is required for any non-safe HTTP methods (POST, PUT, DELETE, PATCH)
		http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
			.ignoringAntMatchers("/register");
		
		// mvcMatchers is a pattern matcher that applies specific rules to particular URLs
		// antMatchers is similar to mvcMatchers, but is hyper specific
		// antMatchers("/hello") this would apply to /hello, but not /hello/
		// mvcMatchers would work for both
		
		// Every HTTP request MUST be authenticated
		http.authorizeHttpRequests().mvcMatchers("/hello/**").authenticated();
		// Must have a role of admin to access this endpoint
		http.authorizeHttpRequests().mvcMatchers("/admin/**").hasAnyRole("ADMIN");
		http.authorizeHttpRequests().mvcMatchers("/register").permitAll();
		http.authorizeHttpRequests().mvcMatchers("/**").permitAll();
		
		// This clears the JSESSIONID cookie and invalidates the session
		// Effectively logging out the person completely. Will need to reauthenticate
		http.logout().deleteCookies("JSESSIONID").invalidateHttpSession(true);
	}
}

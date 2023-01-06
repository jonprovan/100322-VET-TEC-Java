package com.skillstorm.practice;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SalesDBConfig {
	
	// This is the singleton design pattern so there is only ever one instance of it
	// Why not make all of these methods static? That is a different approach sure
	
	private static SalesDBConfig instance; // only ever one instance of this class!
	private String url;
	private String username;
	private String password;
	
	private SalesDBConfig() { // don't let anyone but us call this method
		try {
			// Load it into memory immediately so that I have it
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Read the properties (key/value pairs) from the application.properties
			try (InputStream input = SalesDBConfig.class.getClassLoader()
					.getResourceAsStream("application.properties")) {
				// Properties object
				Properties props = new Properties();
				props.load(input); // Load in the file we opened
				
				// Grab out the keys that I want
				this.url = props.getProperty("db.url");
				this.username = props.getProperty("db.username");
				this.password = props.getProperty("db.password");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static SalesDBConfig getInstance() {
		if (SalesDBConfig.instance == null)
			instance = new SalesDBConfig(); // this only ever runs once
		return instance;
	}
	


	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	// Makes it simpler to retrieve a connection
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}

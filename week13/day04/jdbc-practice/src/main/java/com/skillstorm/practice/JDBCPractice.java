package com.skillstorm.practice;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCPractice {
	
	/**
	 * JDBC = Java Database Connectivity
	 * 
	 * It's used to connect our Java Application to our database
	 * It was once the preferred way of connecting to SQL databases
	 * It's not anymore, but you'll still see/hear about it
	 * 
	 * How does JDBC work?
	 * 
	 * - JDBC works by establishing a connection normally over HTTP(S)
	 * - We are able to write our queries in our Java code itself
	 * 
	 * 
	 * Downsides:
	 * - We write out SQL queries directly in the Java code
	 * -  they will be stored as Strings can be buggy with string concatenation
	 * - It's too low level control JPA will abstract away the need to write the queries ourselves
	 * 
	 * 
	 * 
	 * JPA = what we will you next week (let's hold off on this)
	 * - JPA = Java Persistence API
	 * - Acts as a layer of abstraction between us and the sql
	 * - built on top of JDBC
	 * - object mapper so we can turn our Java objects into records in our tables and vice versa
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		/*
		 * Steps to use the JDBC connector:
		 * 1. Load the MySQL driver
		 * 2. Create the connection
		 * 3. Create a query
		 * 4. Execute the query
		 * 5. parse the results
		 * 6. Close the connection!
		 * 
		 */
		
		
		// Step 1: Load the driver if it does not load, handle the exception some how
		// open an alert 
		// used back up cached data
		// etc. whatever recovery mechanism you have
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Step 2: Create the connection
		
		String url = ""; // protocol:host:port/dbname 
		String user = "";
		String password = ""; // DO NOT hard code the password here especially if you ar pushing your code to github
		                      // instead put this in an environment file that is not pushed to github
		                      //    to make sure it's not pushed add it to the .gitignore
		
		// Import java.io
		// getResourceAsStream will look inside of src/main/resources so if your file is not directly inside it
		// use "./parctice/config/application.properties" or whatever path from src/main/resources takes you to your config file
		try (InputStream input = JDBCPractice.class.getClassLoader().getResourceAsStream("application.properties")) {
			// once we have our inputstream we can load the values from it into a properties object
			Properties props = new Properties(); // import from java.util.Properties
			props.load(input);
			
			url = props.getProperty("db.url");
			user = props.getProperty("db.user");
			password = props.getProperty("db.password");
			
			try (Connection dbConnection = DriverManager.getConnection(url, user, password)) {
				// Step 3: Create a query
				String sql = "SELECT * FROM inventory";
				Statement stmt = dbConnection.createStatement(); // This allows us to run queries or inserts or updates etc.
				
				// Step 4: Execute our query
				ResultSet rs = stmt.executeQuery(sql);
				
				// Step 5: Parse the results
				while (rs.next()) {
					System.out.print(rs.getInt(1) + " "); // note it is NOT zero indexed, the first column is 1
					System.out.println(rs.getString("item_name")); // you can also use the column name
				}
				
				// step 6: close connection -- this done for us by the try-with-resources
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

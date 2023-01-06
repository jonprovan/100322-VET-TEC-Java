package com.skillstorm.practice;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class InventoryDAO {
	

	
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
	
	private Properties getProperties() {
		
		// step 1: load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// first we have to read from the application.properties
		try (InputStream input = 
				InventoryDAO.class.getClassLoader().getResourceAsStream("application.properties")) {
			Properties props = new Properties(); // from java.util.Properties makes grabbing the key-value pairs easy
			props.load(input);
			
			return props;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Item> findAll() {
		// step 2: make the connection
		Properties props = getProperties();

		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String password = props.getProperty("db.password");
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// step 3: making the query
			String sql = "SELECT * FROM inventory";
			Statement stmt = conn.createStatement();
			
			// step 4: executing the query
			if (stmt.execute(sql)) { // returns true if the query has a result set
				ResultSet rs = stmt.getResultSet();
				
				// step 5: parse the result set -- print out or parse and make a list
				List<Item> items = new ArrayList<Item>(); // create a list to store the results
				while (rs.next()) {
					String name = rs.getString("item_name"); // I could use the column index remember it's NOT ZERO indexed
					int id = rs.getInt("item_id");
					// create an object
					Item item = new Item();
					item.itemName = name;
					item.itemId = id;
					// add it to my result list
					items.add(item);
				}
				
				return items;
			}
			return null;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	/*
	 * 
   - Add CRUD functionality
   - findAll()
   - findById(int id)
   - findByName(String name)
   - save(Item item)
   - update(Item item)
   - delete(int id)
	 */
	
	
	
	

}

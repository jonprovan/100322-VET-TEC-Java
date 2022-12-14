package com.skillstorm.practice;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class InventoryDAO { // Data Access Object
	
	// step 1: load driver (this is done in our config class)
	static SalesDBConfig config = SalesDBConfig.getInstance();
	

	/*
	 * Steps to use the JDBC connector: 1. Load the MySQL driver 2. Create the
	 * connection 3. Create a query 4. Execute the query 5. parse the results 6.
	 * Close the connection!
	 * 
	 */
	// Step 1.5 Get the properties you will need to make the connection each time -- moved this to config class
//	private Properties getProperties() {
//		// first we have to read from the application.properties
//		try (InputStream input = InventoryDAO.class.getClassLoader().getResourceAsStream("application.properties")) {
//			Properties props = new Properties(); // from java.util.Properties makes grabbing the key-value pairs easy
//			props.load(input);
//
//			return props;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	public List<Item> findAll() {
		// step 2: make the connection
//		Properties props = getProperties(); -- moved this to config class
//
//		String url = props.getProperty("db.url");
//		String user = props.getProperty("db.user");
//		String password = props.getProperty("db.password");

		try (Connection conn = config.getConnection()) {
			// step 3: making the query
			String sql = "SELECT * FROM inventory";
			Statement stmt = conn.createStatement();

			// step 4: executing the query
			stmt.execute(sql); // returns true if the query has a result set EVEN IF result set is empty
			ResultSet rs = stmt.getResultSet();

			// step 5: parse the result set -- print out or parse and make a list
			List<Item> items = new ArrayList<Item>(); // create a list to store the results
			while (rs.next()) {
				String name = rs.getString("item_name"); // I could use the column index remember it's NOT ZERO
															// indexed
				int id = rs.getInt("item_id");
				// create an object
				Item item = new Item();
				item.setItemName(name);
				item.setItemId(id);
				// add it to my result list
				items.add(item);
			}

			return items;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public Item findById(int id) {
		// step 2: make connection
//		Properties props = getProperties();
		try (Connection conn = config.getConnection()) {

			// step 3: make the query
			String sql = "SELECT * FROM inventory WHERE item_id = " + id;
			Statement stmt = conn.createStatement();

			// step 4: execute the query
			if (stmt.execute(sql)) { // checks if there is a result set
				ResultSet rs = stmt.getResultSet();

				// step 5: parse the results
				if (rs.next()) { // we only are getting one record so no need to while loop
					String name = rs.getString(2);
					int itemId = rs.getInt(1);
					// create an object
					Item item = new Item();
					// set the properties
					item.setItemId(itemId);
					item.setItemName(name);
					// return the object
					return item;
//					System.out.println(name + " " + itemId);
				} else {
					System.out.println("The result set was empty!");
				}
				rs.close();
				stmt.close(); // this will happen automatically when the connection is closed for us by the
								// try-with-resources
			}
			// else
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} // in the finally make sure you close the connection if this is not a
			// try-with-resources
	}

	public List<Item> findByName(String itemName) { // TODO debug the ? notation for parameterized queries
		// step 2: make the connection
//		Properties props = getProperties();
//
//		String url = props.getProperty("db.url");
//		String user = props.getProperty("db.user");
//		String password = props.getProperty("db.password");

		try (Connection conn = config.getConnection()) {
			// step 3: making the query
			// like SELECT * FROM inventory WHERE item_name LIKE '%" + itemName + "%'
//			String sql = "SELECT * FROM inventory WHERE item_name LIKE '%" + itemName + "%'"; // DO NOT DO THIS
//			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM inventory WHERE item_name = ?"; // use placeholder ? for any strings you want concatenated in
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, itemName ); // this will sanitize the string

			// step 4: executing the query
			ResultSet rs = stmt.executeQuery();// returns the result set (only use on statements that contain a SELECT)

			// step 5: parse the result set -- print out or parse and make a list
			List<Item> items = new ArrayList<Item>(); // create a list to store the results
			while (rs.next()) {
				String name = rs.getString("item_name"); // I could use the column index remember it's NOT ZERO
															// indexed
				int id = rs.getInt("item_id");
				// create an object
				Item item = new Item();
				item.setItemName(name);
				item.setItemId(id);
				// add it to my result list
				items.add(item);
			}
			return items;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public Item save(Item item) {
		return null;
	}
	
	public Item update(Item item) {
		return null;
	}
	
	/*
	 * 
	 * - Add CRUD functionality - findAll() - findById(int id) - findByName(String
	 * name) - save(Item item) - update(Item item) - delete(int id)
	 */

	public void delete(Item item) {
		// transaction = I want all of my statements to run successfully
		// !!! if ANY of them fail, ROLLBACK aka undo the ones that worked
		
		try (Connection conn = config.getConnection()) {
			String sql = "UPDATE items SET item_id = NULL WHERE item_id = ?";
			String sql2 = "DELETE FROM inventory WHERE item_id = ?";
			
			PreparedStatement ps1 = conn.prepareStatement(sql);
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			
			ps1.setInt(1, item.getItemId());
			ps2.setInt(1, item.getItemId());
			
			// Start a transaction
			conn.setAutoCommit(false); // Prevents each query from immediately altering the database
			
			int rowsAffected = ps1.executeUpdate(); // updates table with foreign keys referencing what I want to delete
			System.out.print("Update effected " + rowsAffected + " rows");
			int rowsAffected2 = ps2.executeUpdate(); // delete statement removes from table
			
			if (rowsAffected2 == 0)
				conn.rollback();
			else
				conn.commit();
			
			conn.setAutoCommit(true);
			// connection closes here bc of try-with-resources
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAll(List<Item> items) {
		
	}
}

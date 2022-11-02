package day02;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
	
	public static void main(String[] args) {
		// Student logins -- for class of 23 students
		// HashMap<Username, Password>
		HashMap<String, String> logins = new HashMap<>(30);
		
		// add a login
		logins.put("bob", "password");
		logins.put("Johns", "1234");
		logins.put("Troy", "P@$w0rD");
		logins.put("Ferris Beuler", "porsch123");
		System.out.println(logins);
		
		
		// get a login
		String username = "bob";
		String password = "password";
		
		// step 1: get stored password
		String storedPassword = logins.get(username);
		// step 2: compare stored password
		System.out.println("Login successful? " +(storedPassword.equals(password)));
		
		
		// get a login
		username = "Troy";
		password = "password";
		storedPassword = logins.get(username);
		System.out.println(username + " Login successful? " + (storedPassword.equals(password)));
		
		
		// get a login
		login("Johns", "01234", logins);
		login("Johns","", logins);
		login("Johns", null, logins);
		
		
//		login(null, "1234", logins);
		// null key test
		logins.put(null, "123456");
		System.out.println("The value at key null is " + logins.get(null));
		
		
		// get a list of all the keys
		Set<String> keys = logins.keySet();
		System.out.println(keys);
		
		
		// add a duplicate key
		System.out.println("Before duplicate: " + logins);
//		logins.put("bob", "password1234");
		logins.putIfAbsent("bob", "password1234");
		System.out.println(logins);
		
		
		// PRINTED ORDER IS NOT INSERTION ORDER
		/*
		 * data structures guarentees of order
		 * - array = item at index where stored it
		 * - ArrayList = guarentees item at index where stored
		 * - LinkedList = guarentees item is where you put it
		 * - deque = guarentees item is at beginning or end whichever place you added it
		 * - stack = item on top, first in last out
		 * - queue = item at the back
		 * - priority queue = item is inserted according to priority
		 * - HashSet = NO ORDER GUARENTEED
		 * - HashMap = NO ORDER GUARENTEED
		 */
		
		
		// add new key, duplicate value
		logins.put("boots", "kibble");
		logins.put("pinky", "kibble");
		System.out.println(logins);
		
	}
	
	public static void login(String user, String password, HashMap<String, String> loginsInfo) {
		// step 0: check for null password before use .equals on it
		if (password == null) { // don't need to use .equals when comparing to null
			System.out.println("Must enter a password");
			return;
		}
		// step 1: extract password to compare to
		String storedPassword = loginsInfo.get(user);
		// step 2: compare the password passed-in with the password-in-the-loginsInfo-map
		System.out.println(user + " Login successful? " + (password.equals(storedPassword)));
	}

}

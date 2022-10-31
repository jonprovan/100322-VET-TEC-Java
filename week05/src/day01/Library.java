package day01;

import java.util.HashSet;

public class Library {
	
	static HashSet<Book> catalog = new HashSet<>();
	
	public static void main(String[] args) {
		
		// add
		catalog.add(null);
		catalog.add(null);
		System.out.println(catalog);
		Person author1 = new Person("Stephen King", 1947);
		Person author2 = new Person("Mark Twain", 1835);
		Person author3 = new Person("Michelle Obama", 1970);
		
		Book book1 = new Book("The Shining", author1);
		Book book1b = (new Book("The Shining", author1));
		book1b.setIsHardcover(true);
		Book book2 = new Book("Mysterious Stranger", author2);
		Book book3 = new Book("Becoming", author3);
		
		// IMPORTANT! hashset is NOT ordered
		catalog.add(book3); // becoming
		catalog.add(book2); // mysterious
		catalog.add(book1); // the shining
		catalog.add(book1); // NOT ADDED -- bc already .equals() an obj in the bucket
		catalog.add(book1b);
		
		// When would you use a HashSet vs NOT?
		/*
		 * Ex: Programmer known languages -- yes
		 *     Programmer used languages on each project -- no
		 *     
		 * Ex: library catalog -- yes
		 *     keeping track of all the books available -- no
		 *     
		 * Ex: what types of Halloween candy I have
		 *     vs each peice of Halloween candy I have
		 *     
		 * Ex: usernames in a db -- unique
		 *      passwords - not unique
		 *      
		 * Ex: items available at a grocery store
		 *     vs at Target how many of each is available
		 */
		
		System.out.println(catalog);
		
		// remove
		
		System.out.println(catalog.remove(null));
		System.out.println(catalog.remove(null));
		
		System.out.println(catalog);
		
		System.out.println(catalog.size());
		
		// contains
		System.out.println(catalog.contains(book1b)); // hardcover shining
		
		// clear
		catalog.clear();
		System.out.println(catalog);
		
		// isEmpty
		System.out.println(catalog.isEmpty());
	}

}

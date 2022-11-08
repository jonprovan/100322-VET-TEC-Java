package day02;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorPractice {
	
	/*
	 * What is an iterator?
	 * - alternative to 
	 *          -- stream
	 *          -- loops - while, for, for-each 
	 *                - or recursion
	 * - uses iteration (not recursion to traverse a collection)
	 *      collection - generic list, set, array, map
	 *      
	 *      
	 *  Pros - we can start and stop and continuing from where left off
	 *       - we remove safely in the middle of iterating over LinkedList / ArrayList / HashSet / HashMap
	 *       
	 *  - UNLIKE STREAM we are operating on the list or collection ITSELF -- mutates the list
	 *          - does not create a new list or collection
	 *  
	 *  EXPLORE ON YOUR OWN
	 *  - ListIterator - can get previous 
	 */
	
	public static void main(String[] args) {
		LinkedList<String> programmingLanguages = new LinkedList<>(Arrays.asList("Rust", "Python", "Ruby", "Go", 
				                                           "C#", "Pascal", "Java", "JavaScript"));
		
		Iterator<String> iter = programmingLanguages.iterator();
		String language1 = iter.next();
		String language2 = iter.next();
		System.out.println(language1);
		System.out.println(language2);
		System.out.println("more? " + iter.hasNext());
		String language3 = iter.next();
		System.out.println(language3);
		
		// go through all the rest
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		System.out.println(programmingLanguages);
//		for (int i = 0; i < programmingLanguages.size(); i++) {
//			if (programmingLanguages.get(i).equals("Java")) {
//				programmingLanguages.remove(i);                   // do not remove as iterate over a list using for
//			} else {
//
//				System.out.println(programmingLanguages.get(i));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Iterator<String> iter2 = programmingLanguages.iterator();
		while (iter2.hasNext()) {
			String language = iter2.next();
			// OTHER COOL CODE GOES HERE to do stuff with each element
			// as I go I want to also remove safely
			if (language.equals("Java")) {
				iter2.remove();
			}
		}
		System.out.println(programmingLanguages);
	}

}

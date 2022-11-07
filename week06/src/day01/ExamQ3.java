package day01;

import java.awt.Desktop.Action;
import java.util.HashSet;

public class ExamQ3 {
   public static void main(String[] args) {
	   
	   
	  
      HashSet<String> mySet = new HashSet<>();
      String person1 = "Mark"; // identical twin
      String person3 = "Rachel";
      
      
      
      
      
      mySet.add(person1);
      mySet.add(person1);
      mySet.add(person3);
      
      ////////////////////////////////////
      

      String person2 = "Mark"; // I can use this to "match" person1 in a search
      
      mySet.remove("Mark"); // what comparison method does this use? .equals() so NOT obj address
      
      
      for (String person : mySet) {
         System.out.println(person);
      }
      
    	   

   }
   // Q4
   
   // index refers to arrays for example
   // unordered - HashSet, HashMap
   // ordered - lists : arrays, ArrayList, LinkedList 
   
   
}
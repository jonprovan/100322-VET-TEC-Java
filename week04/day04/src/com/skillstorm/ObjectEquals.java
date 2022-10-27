package com.skillstorm;

public class ObjectEquals {

	public static void main(String[] args) {
		
		// COMPARING OBJECTS
		
		System.out.println("Is 1 equal to 1?");
		System.out.println(1 == 1);

		System.out.println();
		
		System.out.println("Is 'Skittle' equal to 'Skittle'?");
		System.out.println("Skittle" == "Skittle");
		
		System.out.println();
		
		Skittle skittle1 = new Skittle("Blue", "The Rainbow");
		Skittle skittle2 = new Skittle("Blue", "The Rainbow");

		
		System.out.println("Is skittle1 equal to skittle2?");
		System.out.println(skittle1 == skittle2);
		// this now works, because we have overridden the .equals() method inside of Skittle
		System.out.println(skittle1.equals(skittle2));
		// CANNOT do this with the simple version of the override, since we cannot cast Object to Skittle
		// System.out.println(skittle1.equals(new Object()));
		
		System.out.println();
		
		System.out.println("No, because what's being compared are these memory addresses:");
		System.out.println(skittle1);
		System.out.println(skittle2);
		
		System.out.println();
		
		// we must override the .equals() method for our Skittle object
		
		System.out.println(skittle1.equals(skittle2));
		
		System.out.println();
		
		System.out.println("Strings are a little weird...they're equal as literals but not when they're declared as new objects:");
		String first = new String("String");
		String second = new String("String");
		
		System.out.println(first == second);
		System.out.println(first.equals(second));
		
		
	}

}

package day01;

import java.util.Objects;

public class Cat {
	
	// TODO fully encapsulate it
	String name;
	String owner;
	Toy toy;
	
	public Cat(String name, String owner, Toy toy) {
		this.name = name;
		this.owner = owner;
		this.toy = toy;
	}

	// HOW WE WILL USE THIS
	@Override
	public int hashCode() {
		return Objects.hash(name, owner, toy); 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(name, other.name) && Objects.equals(owner, other.owner); 
	}
	
	@Override
	public String toString() {
		return "Cat " + name + " owned by " + owner;
	}
	// HashCode 
	/* - deterministic = always get the same result (exception: restarting the program can change it)
	 * - equal objects have equal hashcodes
	 * - unequal objects DONT ALWAYS have diff hashcodes
	 */
	
	// PEEK UNDER THE HOOD
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : (int)name.charAt(0)); // cannot "dehash" and get the value
//		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
//		return result;
//	}
//	
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cat other = (Cat) obj;
//		// compare property 1
//		// step 1: make sure it's not null
//		if (name == null) {
//			if (other.name != null)
//				return false;
//	    // step 2: call .equals on the property
//		} else if (!name.equals(other.name))
//			return false;
//		
//		if (owner == null) {
//			if (other.owner != null)
//				return false;
//		} else if (!owner.equals(other.owner))
//			return false;
//		return true;
//	}

}

package day05;

public class InstanceOf {

	public static void main(String[] args) {
		
		// INSTANCEOF vs. GETCLASS
		
		Person person = new Person();
		
		// instanceof -- returns a boolean
		// 
		
		System.out.println(person instanceof Person);
		
		// getClass() -- returns a class type
		
		System.out.println(person.getClass());
		
		System.out.println();
		
		SleepyPerson sleepyPerson = new SleepyPerson();
		
		System.out.println(sleepyPerson.getClass());
		
		// SleepyPerson still "contains" an instance of each of its parent classes and the interfaces it implements
		System.out.println(sleepyPerson instanceof SleepyPerson);
		System.out.println(sleepyPerson instanceof Person);
		System.out.println(sleepyPerson instanceof Organism);
		System.out.println(sleepyPerson instanceof MovingThing);
		
		SleepyPerson sleepyPerson2 = null;
		
		//this does not work and throws an error because we're trying to execute an operation on a null object
		//System.out.println(sleepyPerson2.getClass());
		
		//this does work, because we're just asking if the null object is equal to something
		System.out.println(sleepyPerson2 instanceof Person);
		
		// false, because a person is not necessarily a SleepyPerson
		System.out.println(person instanceof SleepyPerson);
		
		// what if I do this?
		System.out.println((MovingThing)sleepyPerson instanceof SleepyPerson);
		// no matter how we cast our object, it's still a SleepyPerson underneath

	}

}

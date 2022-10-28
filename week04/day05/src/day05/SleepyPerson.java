package day05;

public class SleepyPerson extends Person {
	
	// properties
	private boolean sleepy;
	
	// constructor -- not technically "default," but still a no-args constructor (no arguments)
	public SleepyPerson () {
		this.sleepy = true;
	}
	
	public SleepyPerson(boolean alive, String name, int age, boolean sleepy) {
		super(alive, name, age);
		this.sleepy = sleepy;
	}

	public boolean isSleepy() {
		return sleepy;
	}

	public void setSleepy(boolean sleepy) {
		this.sleepy = sleepy;
	}

	@Override
	public String toString() {
		return "SleepyPerson [sleepy=" + sleepy + "]";
	}
	
	

}

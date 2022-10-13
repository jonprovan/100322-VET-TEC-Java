package com.skillstorm;

// a class does not extend an interface, it implements

// an interface CAN extend another interface, using the extends keyword
// public interface Guitar extends MusicalInstrument

public class Guitar implements MusicalInstrument, CollectorsItem {
	
	private String make;
	private int value;
	
	// constructors
	public Guitar() {
		super();
	}
	
	public Guitar(String make) {
		this.make = make;
	}

	@Override
	public void play() {
		System.out.println("Strum!");
	}

	@Override
	public void stop() {
		System.out.println("Screech.");
	}
	
	@Override
	public int appraise() {
	
		switch (make) {
			case "Gibson":
				value = 3000;
				break;
			case "Fender":
				value = 1500;
				break;
			case "Joe's Discount Axes":
				value = 20;
				break;
			default:
				value = 200;
				break;
		}
		
		return value;
	}

	// MUST implement methods from an interface with the exact same signature
	// CAN overload to create another method with the same name but different parameters
	@Override
	public int buy(int myCash) {
		
		if (myCash >= value)
			return (myCash - value);
		else
			return myCash;
	}

	@Override
	public int auction() {
		return value;
	}

	
	
}

package day02;

public enum Day {
	// NAMING CONVENTION --  just like when we used capslock for constants, use capslock for enum values
	
	// PROVIDED METHODS
	// - name() -- return String 
	// - ordinal() -- returns an int b
	
	// static valueOf( class , string )
	// static valueOf( string )
	// static values() -- returns all the values so I can iterate over them

	
	MONDAY(1), // 0 is returned when .ordinal() is called    and "MONDAY" when name() is called
	TUESDAY(2), // 1
	WEDNESDAY(3), // 2
	THURSDAY(4), // 3
	FRIDAY(5), // 4
	SATURDAY(6), // 5
	SUNDAY(7); // 6
	
	private int number;
	
	private Day(int num) {
		this.number = num;
	}
	
	public Day getDay(int number) {
		return MONDAY; // TODO fix logic
	}
	
	public Day getNextDay(Day day) {
		// to get next day use getDay(int)
		// making sure to wrap around -- if day= 7, nextday = 1
		return MONDAY; // TODO fix logic
	}
}

package com.skillstorm.meetingcode;

public class Meeting {
	
	public static final int MAX_NUMBER_OF_PEOPLE = 4; 
	private int numPeople;
	private Attendee[] attendees;
	
	public Meeting() {
		this.numPeople = 0;
		this.attendees = new Attendee[MAX_NUMBER_OF_PEOPLE];
	}
	
	// getters and setters
	public int getNumPeople() {
		return this.numPeople;
	}
	
	// TODO write a add method
	public void add(Attendee attendee) throws JoinMeetingException {
		// Try to add a person
		try {
			attendees[numPeople] = attendee; // if it is full it will throw an error
			

			// if it is not full continue
			// --------------------------
			// increment the numPeople
			numPeople++;
			System.out.println("The meeting now has " + numPeople + " attendees");
		} catch(ArrayIndexOutOfBoundsException e) {
			throw new JoinMeetingException("The meeting is full.");
		} 
		
		
	}
	
	

}

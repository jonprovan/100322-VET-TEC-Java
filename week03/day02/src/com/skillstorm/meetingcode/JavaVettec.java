package com.skillstorm.meetingcode;

public class JavaVettec {
	
	
	public static void main(String[] args) {

		Meeting officeHours = new Meeting();
		
		Member person1 = new Member();
		Guest person2 = new Guest();
		Guest person3 = new Guest();
		Guest person4 = new Guest();
		Guest person5 = new Guest();
		
		person1.join(officeHours);
		person2.join(officeHours);
		person3.join(officeHours);
		person4.join(officeHours);
		person5.join(officeHours);
		
		
		
	}

}

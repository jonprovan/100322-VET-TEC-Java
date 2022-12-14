package com.skillstorm.meetingcode;

public class Guest implements Attendee {

	@Override
	public void join(Meeting meeting) {
		try {
			meeting.add(this);
			System.out.println("Joining waiting room.");
		} catch (JoinMeetingException e) {
			System.out.println(e.getMessage());
		}
	}

}

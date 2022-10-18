package com.skillstorm.meetingcode;

public class JoinMeetingException extends Exception {
	private static final long serialVersionUID = 1389239160760555622L; // don't worry about this
	// we'll cover this later when we get to databases and data transfer and serialization

	// no-arg
	public JoinMeetingException() {
		super("Unable to join meeting for some reason.");
	}
	
	
	// message
	public JoinMeetingException(String message) {
		super(message);
	}
	
	
	// cause
	public JoinMeetingException(Throwable cause) {
		super(cause);
	}

}

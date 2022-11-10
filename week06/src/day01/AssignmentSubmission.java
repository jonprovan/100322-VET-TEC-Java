package day01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Objects;

public class AssignmentSubmission {
	
	// due date and time
	public static final LocalDateTime DUE_DATE = LocalDateTime.of(2022, 11, 8, 23, 59);
	
	
	private String student; // name
	private int score; // 0 to 100
	private boolean cheated; // true means they cheated, false means they didn't
	
	// submission date and time
	private LocalDateTime submittedAt;
	
	
	public AssignmentSubmission() {
		this("Test Student", 0, false, DUE_DATE);
	}
	

	public AssignmentSubmission(String student) {
		this(student, 0, false, DUE_DATE.plusMinutes(1));
	}
	
	public AssignmentSubmission(String student, int score) {
		this(student, score, false, DUE_DATE);
	}
	
	public AssignmentSubmission(String student, int score, boolean cheated) {
		this(student, score, cheated, DUE_DATE);
	}
	
	
	public AssignmentSubmission(String student, int score, boolean cheated, LocalDateTime submittedAt) {
		setStudent(student);
		setScore(score);
		setCheated(cheated);
		setSubmittedAt(submittedAt);
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		if (student == null || student.isEmpty())
			throw new IllegalArgumentException("Student must have a name");
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0)
			throw new IllegalArgumentException("Score cannot be negative");
		if (score > 100) 
			throw new IllegalArgumentException("Score cannot be over 100");
		this.score = score;
	}

	public boolean getCheated() {
		return cheated;
	}

	public void setCheated(boolean cheated) {
		this.cheated = cheated;
	}
	
	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}
	
	public void setSubmittedAt(LocalDateTime submittedAt) {
		// reject dates in the future
//		LocalDateTime now = LocalDateTime.now();
//		Period difference = Period.between(now, submittedAt);
		
		if (isInFuture(submittedAt))
			throw new IllegalArgumentException("Cannot have future date and time");
		
		// TODO
		
		this.submittedAt = submittedAt;
	}
	
	// true IF in future
	private boolean isInFuture(LocalDateTime submittedAt) {
		// step 1: get the seconds
		// use Instant --- a Java class for working with Temporal objects
		Instant nowInstant = Instant.now();
		Instant submitionInstant = submittedAt.atZone(ZoneId.of("America/New_York")).toInstant();
		
		// step 2: use Instant class .isBefore(instant)
		return nowInstant.isBefore(submitionInstant);
	}
	

	@Override
	public String toString() {
		String result =  student + " scored " + score;
		if (cheated)
			result += " but cheated";
		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cheated, score, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssignmentSubmission other = (AssignmentSubmission) obj;
		return cheated == other.cheated && score == other.score && Objects.equals(student, other.student);
	}
	
}

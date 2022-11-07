package day01;

import java.util.Objects;

public class AssignmentSubmission {
	
	private String student; // name
	private int score; // 0 to 100
	private boolean cheated; // true means they cheated, false means they didn't
	
	public AssignmentSubmission() {
		this("Test Student", 0, false);
	}
	
	public AssignmentSubmission(String student, int score) {
		this(student, score, false);
	}
	
	public AssignmentSubmission(String student) {
		this(student, 0, false);
	}
	
	public AssignmentSubmission(String student, int score, boolean cheated) {
		setStudent(student);
		setScore(score);
		setCheated(cheated);
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

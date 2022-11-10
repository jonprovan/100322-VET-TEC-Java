package day01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	
	public static void main(String[] args) {
		List<AssignmentSubmission> submissions = 
				Arrays.asList(new AssignmentSubmission("Sara", 80, false, AssignmentSubmission.DUE_DATE.plusDays(1)),
							  new AssignmentSubmission("Cara", 70),
							  new AssignmentSubmission("Lara", 100, true),
							  new AssignmentSubmission("Tara", 0)); // YOUR CODE HERE
		
		
		// Problem 1: Find the highest score (excluding students that cheated)
		
		// STEP 0: STREAM
		Stream<AssignmentSubmission> submissionStream = submissions.stream();
		// STEP 1: FILTER
		Stream<AssignmentSubmission> filtered = submissionStream.filter((s)->!s.getCheated());
		// STEP 2: MAP to extract scores
		Stream<Integer> scores = filtered.map((submission)->submission.getScore());
		// STEP 3: REDUCE to find high score
		int highScore = scores.reduce(0, (soFar, score) -> Math.max(soFar, score));
		System.out.println("High score: " + highScore);
		
		
		
		
		
		
		
		
		
		
		// Problem 2: Find the low score (excluding students that didn't take the exam -- assume those are the only 0 scores)
		
		// STEP 0: STREAM
		submissionStream = submissions.stream();
		// STEP 1: FILTER
		filtered = submissionStream.filter((student) -> student.getScore() > 0);
		// STEP 2: MAP to extract scores
		scores = filtered.map((student)->student.getScore());
		// STEP 3: REDUCE to find low score
		int lowScore = scores.reduce(100, (soFar, score) -> Math.min(soFar, score));
		System.out.println("Low score: " + lowScore);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Problem 3: Set the scores of all the students who cheated to 0
		
		// STEP 0: STREAM
		submissionStream = submissions.stream();
		// STEP 2: MAP
		Stream<AssignmentSubmission> updatedStream = submissionStream.map((submission) -> {
			AssignmentSubmission updatedSubmission = new AssignmentSubmission();
			
			updatedSubmission.setStudent(submission.getStudent());
			
			updatedSubmission.setCheated(submission.getCheated());
			
			if (submission.getCheated())
				updatedSubmission.setScore(0);
			else 
				updatedSubmission.setScore(submission.getScore());
			
			
			return updatedSubmission;
		});
		List<AssignmentSubmission> updatedScores = updatedStream.collect(Collectors.toList());
		System.out.println(updatedScores);
		
		
		
		// Problem 4: Set the scores of all the students who submitted late to be -5 points per day
		// STEP 0: STREAM
		Stream<AssignmentSubmission> lateStream = submissions.stream();
		// STEP 1: MAP
		Stream<AssignmentSubmission> updatedLateStream = lateStream.map((as) -> { 
			// check if late
			if (isLate(as)) {
				int days = daysLate(as);
				int pointsOff = days * 5;
				int score = as.getScore();
				if (pointsOff > score || days > 7) {
					// set score to 0
					as.setScore(0); // 
				} else {
					// set score to old - ptsoff
					as.setScore(score - pointsOff); //
				}
			}
			return as;
		});
		List<AssignmentSubmission> updatedLateScores = updatedLateStream.collect(Collectors.toList());
		System.out.println(updatedLateScores);
		
		int days = daysLate(new AssignmentSubmission("Sara", 80, false, AssignmentSubmission.DUE_DATE.plusDays(1)));
		System.out.println("days late is " + days);
		
	}
	
	public static boolean isLate(AssignmentSubmission submission) {
		// Create two instances
		// due date
		// submission date
		Instant submissionInstant = submission.getSubmittedAt().atZone(ZoneId.of("America/New_York")).toInstant();
		Instant dueDateInstant = AssignmentSubmission.DUE_DATE.atZone(ZoneId.of("America/New_York")).toInstant();
		
		// compare
		return dueDateInstant.isBefore(submissionInstant); // if submission was after dueDate return true
	}
	
	// what to do if it isn't late? only call this if it isLate...
	public static int daysLate(AssignmentSubmission submission) {
		// what to do if it is over a month late and .getDays() returns 1 instead of 32 days?
		// throw illegalargumentexception
		
		// Convert to LocalDate bc Period does not support time
		LocalDate submitted = LocalDate.from(submission.getSubmittedAt());
		LocalDate dueDate = LocalDate.from(AssignmentSubmission.DUE_DATE);
		// get the Period between them
		Period lateness = Period.between(dueDate, submitted);
		// return the number of days
		return lateness.getDays();
	}

}

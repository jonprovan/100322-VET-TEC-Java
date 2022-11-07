package day01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	
	public static void main(String[] args) {
		List<AssignmentSubmission> submissions = 
				Arrays.asList(new AssignmentSubmission("Sara", 80),
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
	}

}

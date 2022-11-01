package day02;

import java.util.HashMap;

public class HomeworkAssignment {
	
	// property -- KEY: student name 
	//          -- VALUE: grade on the assignment
	private HashMap<String, Integer> grades; // a value 0 to 100 (percent)
	
	// constructor
	public HomeworkAssignment() {
		this.grades = new HashMap<>();
	}
	
	// 3 methods
	public int findHighest() {
		int maxGrade = 0;
		// access the instance property grades
		// for (int i = 0; i < grades.size(); i++) {
		for (String student: grades.keySet()) {
			int grade = grades.get(student);
			maxGrade = Math.max(maxGrade, grade);
		}
		return maxGrade;
	}
	
	public int findLowest() {
		return 0;
	}
	
	public int findAverage() {
		// avg = total / count
		int total = 0;
		int count = 0;
		// USE FOR EACH when you dont NEED the index (even if you have it, you can)
		// Here we HAVE TO use FOR EACH bc there are NO INDEXES IN HASHMAP -- unordered, no indexes/positions
		for (String name : grades.keySet()) { // FOR EACH somethin IN something 
			int grade = grades.get(name);
			total += grade; // total = total + grade;
			count++; // count = count + 1
		}
		return total / count;
	}
	
	// bonus
	public String findTopStudent() {
		String result = "";
		int topScore = findHighest();
		for (String name : grades.keySet()) {
			int score = grades.get(name);
			if (score == topScore)
				result += name + " "; // "Brian " -> "Brian Kelvin "
		}
		return result;
	}
	
	// getter
	public HashMap<String, Integer> getGrades() {
		return grades;
	}
	// setter
	public void setGrades(HashMap<String, Integer> grades) {
		this.grades = grades;
	}

}

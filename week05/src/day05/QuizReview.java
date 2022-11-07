package day05;

public class QuizReview {
	   public static void doStuff(int num, Action action) {
	      System.out.println(action.act(num));
	   }

	   public static void main(String[] args) {
	      doStuff(3, num -> num * 2); // lambda 
	   }
	}

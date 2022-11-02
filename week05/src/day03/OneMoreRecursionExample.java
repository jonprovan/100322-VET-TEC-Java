package day03;

public class OneMoreRecursionExample {
	
	public static void main(String[] args) throws InterruptedException {
		countDown(10);
	}
	
	public static void countDown(int t) throws InterruptedException {
		if (t <= 0) 
			System.out.println("Blast off!");
		else {
			// print
			System.out.println(t);
			Thread.sleep(1000); // wait 1000 miliseconds
			// call next guy
			countDown(t - 1);
		}
			
	}

}

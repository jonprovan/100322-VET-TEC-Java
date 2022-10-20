package com.skillstorm.review;

public class BreakExample {
	
	public static void main(String[] args) {
		sue: for (int i = 0; i < 4; i++) {
			          for (int j = 0; j < 3; j++) {
			        	  System.out.println("i = " + i + ", j = " + j);
			        	  if (i == 2 && j == 2) {
			        		  break sue;
			        	  }
			          }
					}
	}

}

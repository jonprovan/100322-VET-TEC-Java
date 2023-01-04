package com.skillstorm;

public class Problem6 {
	
	public static void main(String[] args) {
		boolean flag = true;
		if(flag = false){ // This is an assignment operator that returns the value on the right.
		   System.out.println("1");
		}else if(flag){ // Flag is false from line 7, so this is false
		   System.out.println("2");
		}else if(!flag){ // Flag is false from line 7, so !flag is true
		   System.out.println("3"); // 3 is printed out
		}else System.out.println("4");
	}

}

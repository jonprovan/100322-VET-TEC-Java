package com.skillstorm;

public class BetterBilliardBall {
	
	private byte number;
	
//	public BetterBilliardBall() {
//		super();
//	}
	
	public BetterBilliardBall(byte number) {
		if (number >= 0 && number <= 15) {
			this.number = number;
		} else {
			System.out.println("Default cue ball created!");
		}
	}
	
	// setter for number
	public BetterBilliardBall setNumber(byte number) {
		
		if (number >= 0 && number <= 15) {
			this.number = number;
		} else {
			System.out.println("Invalid Number!");
		}
		
		return this;
	}
	
	public BetterBilliardBall getPattern() {
		
		if (number <= 8)
		System.out.println("Solid");
		else System.out.println("Striped");
		return this;
		
	}
	
	public String getColor() {
		
		switch (this.number) {
		
			case 0:
				return "White";
			case 1:
			case 9:
				return "Yellow";
			case 2:
			case 10:
				return "Blue";
			case 3:
			case 11:
				return "Red";
			case 4:
			case 12:
				return "Purple";
			case 5:
			case 13:
				return "Orange";
			case 6:
			case 14:
				return "Green";
			case 7:
			case 15:
				return "Maroon";
			case 8:
				return "Black";
			default: return "Invalid number!";
		}
		
	}

}

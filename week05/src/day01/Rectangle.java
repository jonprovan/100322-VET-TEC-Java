package day01;

public class Rectangle {
	
	int width;
	int height;
	
	@Override
	public int hashCode() { // cannot "dehash" -- this is like given the area, can you guess the height and width?
		int prime = 31;
		int result = 1;
		result = prime * result + width;
		result = prime * result + height;
		return result;
	}

}

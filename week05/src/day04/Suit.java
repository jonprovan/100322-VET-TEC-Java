package day04;

import java.util.Objects;

public class Suit {

	
	private String color;
	
	private int threadCount; // stitches per square inch
	
	private boolean hasTie;
	
	private double price; // comparator
	
	private int size; // size -- chest size
	
	
	// constructors
	public Suit() {
		
	}
	
	public Suit(String color, int threadCount, boolean hasTie, double price, int size) {
		setColor(color); // I wrote validation in my setter -- to avoid rewriting validation code -- calling the setter
		setThreadCount(threadCount);
		setHasTie(hasTie);
		setPrice(price);
		setSize(size);
	}
	
	// getters and setters
	public String getColor() {
		return color;
	}
	
	public boolean getHasTie() {
		return hasTie;
	}
	
	public int getThreadCount() {
		return threadCount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setColor(String color) {
		if (color == null || color.isEmpty()) {
			throw new IllegalArgumentException("Please provide a valid color");
		}
		this.color = color;
	}
	
	public void setThreadCount(int count) { // no declaration needed bc it is a RuntimeException -- Java doesn't care!
		if (count < 100 || count > 300) {
			throw new IllegalArgumentException("Please provide a number between 100 and 300");
		}
		this.threadCount = count;
	}
	
	public void setHasTie(boolean tie) {
		this.hasTie = tie;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Please provide a nonnegative price");
		}
		this.price = price;
	}
	
	public void setSize(int size) {
		if (size < 30 || size > 60) {
			throw new IllegalArgumentException("Invalid sizse. Please enter a value between 30 and 60");
		}
		this.size = size;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		Suit other = (Suit) o;
		if (other.color == null) { // for non-primitives in equals check for null before compare -- or use a null-safe equals method Objects.equals(name, other.name);
			if (this.color != null) {
				return false;
			}
		}
		return this.hasTie == other.hasTie && this.threadCount == other.threadCount && this.price == other.price && this.size == other.size;
	}
	
	@Override
	public int hashCode() { // important to implement this if using HashSet or HashMap
		int prime = 31;
		int result = 1;
		result = result * prime + color.hashCode();
		result = result * prime + (hasTie ? 1: 0);
		result = result * prime + threadCount;
		result = result * prime + size;
		result = result * prime + (int) (price * 100);
		return result;
	}

	@Override
	public String toString() {
		return "Suit [color=" + color + ", threadCount=" + threadCount + ", hasTie=" + hasTie + ", price=" + price
				+ ", size=" + size + "]";
	}
	
	

}

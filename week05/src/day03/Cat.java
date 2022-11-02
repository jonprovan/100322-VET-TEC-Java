package day03;

public class Cat implements Comparable {
	// TODO encapsulate this
	String name;
	int cuteness;
	
	public Cat(String name, int cuteness) {
		this.name = name;
		this.cuteness = cuteness;
	}

	@Override
	// returns negative when this is less cute than other
	// returns 0 when they are equal
	// returns positive when this is more cute
	public int compareTo(Object o) {
		// TODO null check
		// TODO class check before cast
		Cat other = (Cat) o;
		if (this.cuteness < other.cuteness)
			return -1;
		else if (this.cuteness > other.cuteness) 
			return 1;
		else
			return 0;
		
		// instead just do
		// return this.cuteness - o.cuteness;
	}

}

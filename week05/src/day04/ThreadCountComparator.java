package day04;

import java.util.Comparator;

public class ThreadCountComparator implements Comparator<Suit> {

	// if equal return 0
	// if o1 < o2 return negative
	// if o1 > o2 return positive
	@Override
	public int compare(Suit o1, Suit o2) {
		return o1.getThreadCount() - o2.getThreadCount();
	}

}

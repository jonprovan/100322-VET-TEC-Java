package day04;

import java.util.Comparator;

public class SizeComparator implements Comparator<Suit> {

	@Override
	public int compare(Suit o1, Suit o2) {
		return o1.getSize() - o2.getSize();
	}

}

package day04;

import java.util.Comparator;

public class PriceComparator implements Comparator<Suit> {

	@Override
	public int compare(Suit o1, Suit o2) {
		return (int) (o1.getPrice() * 100) - (int) (o2.getPrice() * 100);
	}

}

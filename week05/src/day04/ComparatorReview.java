package day04;

import java.util.LinkedList;

public class ComparatorReview {
	
	public static void main(String[] args) {
		
		Suit suit1 = new Suit();
		Suit suit2 = new Suit("black", 200, true, 300.99, 40);
		Suit suit3 = new Suit("black", 200, true, 300.99, 40);
		Suit suit4 = new Suit("black", 250, true, 300.99, 30);
		Suit suit5 = new Suit("black", 250, true, 300.99, 35);

		Suit suit6 = new Suit("black", 200, true, 200.99, 40);
		Suit suit7 = new Suit("black", 200, true, 200.99, 40);
		Suit suit8 = new Suit("black", 250, true, 200.99, 30);
		Suit suit9 = new Suit("black", 250, true, 200.99, 35);
		

		Suit suit10 = new Suit("black", 200, true, 100.99, 40);
		Suit suit11 = new Suit("black", 200, true, 100.99, 40);
		Suit suit12 = new Suit("black", 250, true, 100.99, 30);
		Suit suit13 = new Suit("black", 250, true, 100.99, 35);
		
		LinkedList<Suit> suits = new LinkedList<>();
		suits.add(suit1); // CTRL-ALT-DOWNARROW copies this line 
		suits.add(suit2);
		suits.add(suit3);
		suits.add(suit4);
		suits.add(suit5);
		suits.add(suit6);
		suits.add(suit7);
		suits.add(suit8);
		suits.add(suit9);
		suits.add(suit10);
		suits.add(suit11);
		suits.add(suit12);
		suits.add(suit13);
		suits.sort(new PriceComparator());
		prettyPrint(suits);
		suits.sort(new SizeComparator());
		prettyPrint(suits);
		suits.sort(new ThreadCountComparator());
		prettyPrint(suits);
	}

	private static void prettyPrint(LinkedList<Suit> suits) {
		for (Suit suit : suits) {
			System.out.println(suit);
		}
	}

}

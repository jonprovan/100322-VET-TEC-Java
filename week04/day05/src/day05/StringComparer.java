package day05;

import java.util.Comparator;

public class StringComparer implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		
		return string1.compareToIgnoreCase(string2);
		
	}

}

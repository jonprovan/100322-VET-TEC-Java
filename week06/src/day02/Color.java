package day02;

public enum Color {
	
	RED("#FF0000"), // final constants so define property here -- RGB red, green, blue are the parts of our color
	ORANGE("#FFA500"),
	YELLOW("#FFFF00"),
	GREEN("#008000"),
	BLUE("#0000FF"); // don't forget semicolon
	
	private String hexValue;
	
	private Color(String hexValue) { // NO PUBLIC CONSTRUCTORS -- don't let user construct more, set is final
		this.hexValue = hexValue;
	}
	
	public String getHexValue() {
		return hexValue;
	}
	
	// should we create a setter?
	// NO these are constants (final) so should not be changing

}

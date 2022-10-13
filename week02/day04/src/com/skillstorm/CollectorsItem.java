package com.skillstorm;

public interface CollectorsItem {
	
	// properties -- public, static, and final by default
	boolean RARE = true;
	
	// methods -- abstract by default
	int appraise();
	int buy(int myCash);
	int auction();
	
}

package com.skillstorm.practice;

public class Item {
	
	// match your table's columns
	
	private int itemId;
	private String itemName;
	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return itemId + " " + itemName + "\n";
	}

}

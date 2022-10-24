package com.skillstorm.arraylists;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
	
	
	@Override
	public void add(int index, E element) {
		if (index <= this.size()) {
			super.add(index, element);
		} else {
			for (int i = this.size(); i < index; i++) {
				super.add(i, null);
			}
			super.add(index, element);
		}
	}
	
	@Override
	public boolean remove(Object o) {
		boolean found = false;
		// remove ALL instances
		while (this.contains(o)) {
			int index = this.indexOf(o);
			remove(index);
			found = true;
		}
		// CANNOT USE INDEXES TO ITERATE BC THEY CHANGE MIDLOOP -- 
		//for (int i = 0; i < this.size() - 1; i++) {
		//	if ((this.get(i)).equals(o)) {
		//		found = true;
		//		remove(i);
		//	}
		//}
		return found;
	}
	

}

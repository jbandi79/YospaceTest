package com.yospace.locator;


public class LocatorSolution1 implements Locator {
	
	public int getIndex(String itemSought, String[] candidates) {
		
		if(candidates != null) {
			for(int i=0; i < candidates.length; i++) {
				if(itemSought != null && itemSought.equals(candidates[i]) ) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
}

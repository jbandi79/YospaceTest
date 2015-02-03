package com.yospace.locator;

import java.util.Arrays;


public class LocatorSolution implements Locator {

	public int getIndex(String itemSought, String[] candidates) {
		
		if(candidates != null && itemSought != null) {
			Arrays.sort(candidates);
			int index = Arrays.binarySearch(candidates, itemSought);
	        index = index >= 0 ? index : -1;
	        return index;
		}
		return -1;
		
	}
	
}

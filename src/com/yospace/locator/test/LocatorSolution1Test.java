package com.yospace.locator.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.yospace.locator.LocatorSolution1;

public class LocatorSolution1Test {

	@Test
	public void testGetIndex() {
		String strToFind = "abc";
		String strArray[] = null; //{"aaa", "abb", "acc", "bbb" };
		
		LocatorSolution1 locatorSolution1 = new LocatorSolution1();
		int result = locatorSolution1.getIndex(strToFind, strArray);
		assertEquals(-1, result);		
		
	}

}

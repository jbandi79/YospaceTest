package com.yospace.locator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yospace.locator.LocatorSolution;

public class LocatorSolutionTest {

	@Test
	public void testGetIndex() {
		String strToFind = "abc";
		String strArray[] =  {"aaa", "abc", "abd", "bbb" };
		
		LocatorSolution locatorSolution = new LocatorSolution();
		int result = locatorSolution.getIndex(strToFind, strArray);
		assertEquals(1, result);		
		
	}	
}

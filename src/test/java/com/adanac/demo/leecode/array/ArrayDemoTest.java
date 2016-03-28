package com.adanac.demo.leecode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ArrayDemoTest extends TestCase {
	private ArrayDemo arr;

	@Before
	protected void setUp() throws Exception {

		arr = new ArrayDemo();
		System.out.println("实例化ArrayDemo...");
	}

	@After
	protected void tearDown() throws Exception {
		arr = null;
		System.out.println("ArrayDemo...");
	}

	@Test
	public void testContainsDuplicate() {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1 };
		boolean flag = arr.containsDuplicate(nums);
		System.out.println(flag);
	}

}

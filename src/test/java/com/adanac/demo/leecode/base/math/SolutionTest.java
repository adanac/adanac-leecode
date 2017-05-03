package com.adanac.demo.leecode.base.math;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	protected Solution solution;

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
		System.out.println("初始化solution...");
	}

	@After
	public void tearDown() throws Exception {
		solution = null;
		System.out.println("释放solution...");
	}

	@Test
	public void testGetSum() {
		Assert.assertEquals(1, solution.getSum(3, 2));
	}

	@Test
	public void testGetSubtract() {
		Assert.assertEquals(1, solution.getSubtract(3, 2));
	}

	@Test
	public void testGetSum2() {
		Assert.assertEquals(solution.getSum2(1, 2), 3);
	}

	@Test
	public void testGetSubtract2() {
		Assert.assertEquals(3, solution.getSubtract2(5, 2));
	}

	@Test
	public void testNegate() {
		Assert.assertEquals(solution.negate(5), -5);
	}

	@Test
	public void testTwoSum() {
		int[] numbers = new int[] { 8, 1, 2, 4 };
		int target = 3;
		int[] twoSum = solution.twoSum(numbers, target);
		System.out.println(Arrays.toString(twoSum));
		Assert.assertArrayEquals(new int[] { 2, 3 }, twoSum);
	}

}

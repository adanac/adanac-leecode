package com.adanac.demo.leecode.base.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayDemo {
	private static final int NUM_LENGTH = 10000000;

	public static boolean containsDuplicate(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	/**
	 * 推荐使用
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate2(int[] nums) {

		final Set<Integer> distinct = new HashSet<Integer>();
		for (int num : nums) {
			if (distinct.contains(num)) {
				return true;
			}
			distinct.add(num);
		}
		return false;
	}

	public static boolean containsDuplicate3(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		return Arrays.stream(nums).anyMatch(num -> !seen.add(num));
	}

	public static void main(String[] args) {
		int[] nums = new int[NUM_LENGTH + 1];
		initData(nums);
		// System.out.println("初始化 " + (NUM_LENGTH + 1) + " 条数据已完成...");
		// long t1 = getNow();
		// // System.out.println(containsDuplicate(nums));
		// System.out.println("第一组要花费:" + (getNow() - t1) + "ms");
		// long t2 = getNow();
		// System.out.println(containsDuplicate2(nums));
		// System.out.println("第二组要花费:" + (getNow() - t2) + "ms");
		// long t3 = getNow();
		// System.out.println(containsDuplicate3(nums));
		// System.out.println("第三组要花费:" + (getNow() - t3) + "ms");
		long t1 = getNow();
		initData1();
		System.out.println("list要花费的时间：" + (getNow() - t1) + "ms");
		long t2 = getNow();
		initData2();
		System.out.println("map要花费的时间：" + (getNow() - t2) + "ms");
	}

	private static long getNow() {
		return System.currentTimeMillis();
	}

	private static void initData(int[] nums) {
		for (int i = 0; i < NUM_LENGTH; i++) {
			nums[i] = i + 1;
		}
		nums[NUM_LENGTH] = 1001;
	}

	private static List<Integer> initData1() {
		List<Integer> res = new ArrayList();
		for (int i = 0; i < NUM_LENGTH; i++) {
			res.add(i + 1);
		}
		return res;
	}

	private static Map<String, Integer> initData2() {
		Map<String, Integer> res = new HashMap<String, Integer>();
		for (int i = 0; i < NUM_LENGTH; i++) {
			res.put(i + "", i + 1);
		}
		return res;
	}
}

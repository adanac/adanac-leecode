package com.adanac.demo.leecode.base.array;

public class ArrayDemo {
	public boolean containsDuplicate(int[] nums) {
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
}

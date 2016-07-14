package com.adanac.demo.leecode.base.string;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sum implements Comparable<Sum> {
	int val;
	int i;
	int j;

	public Sum(int val, int i, int j) {
		this.val = val;
		this.i = i;
		this.j = j;
	}

	public int compareTo(Sum o) {
		return this.val - o.val;
	}

	public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

		List<int[]> result = new ArrayList<>();

		if ((nums1 == null || nums1.length == 0) || (nums2 == null || nums2.length == 0) || k <= 0) {
			return result;
		}

		Queue<Sum> heap = new PriorityQueue<>();

		for (int i = 0; i < Math.min(nums1.length, k); i++) {

			int row = i;
			int col = 0;
			int val = nums1[row] + nums2[col];

			heap.offer(new Sum(val, row, col));
		}

		for (int i = 0; i < Math.min(nums1.length * nums2.length, k); i++) {
			Sum sum = heap.poll();

			int row = sum.i;
			int col = sum.j;

			int[] pair = { nums1[row], nums2[col] };

			if (col < nums2.length - 1) {
				int val = nums1[row] + nums2[col + 1];

				heap.offer(new Sum(val, row, col + 1));
			}
			result.add(pair);
		}

		return result;

	}

	public static void main(String[] args) {
		int[] nums1 = { 7, 4, 9, 3, 5 };
		int[] nums2 = { 6, 2, 0, 10, 8 };
		int k = 5;
		List<int[]> res = kSmallestPairs(nums1, nums2, k);
		for (int[] r : res) {
			if (r != null && r.length > 0) {
				for (int i = 0; i < r.length; i++) {
					System.out.print(i != r.length - 1 ? (r[i] + ",") : (r[i]));
				}
			}
			System.out.println();
		}
	}
}
package com.adanac.demo.leecode.base.string;

public class StringUtil {
	// Longest Substring Without Repeating Characters
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		int[] index = new int[128]; // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; ++j) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int t = lengthOfLongestSubstring("abcefb098-13");
		System.out.println(t);
	}
}

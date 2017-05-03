package com.adanac.demo.leecode.base.string;

public class StringUtil {
	// Longest Substring Without Repeating Characters
	/**
	 * 获取字符串没有重复字符串的子串的最大长度
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
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

	public String replaceEmptyStr(String s) {
		return s.replaceAll("\\s+", "");
	}

	public int aplusb(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
}

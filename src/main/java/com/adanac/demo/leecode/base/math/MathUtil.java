package com.adanac.demo.leecode.base.math;

public class MathUtil {
	public static int superPow(int a, int[] b) {
		if (a % 1337 == 0)
			return 0;
		int p = 0;
		for (int i : b)
			p = (p * 10 + i) % 1140;
		if (p == 0)
			p += 1440;
		return power(a, p, 1337);
	}

	public static int power(int a, int n, int mod) {
		a %= mod;
		int ret = 1;
		while (n != 0) {
			if ((n & 1) != 0)
				ret = ret * a % mod;
			a = a * a % mod;
			n >>= 1;
		}
		return ret;
	}

	public static void main(String[] args) {
		// int a = 2;
		// int[] b = { 1, 2 };
		// System.out.println(superPow(a, b));
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "," + (i & 1));
		}
	}
}

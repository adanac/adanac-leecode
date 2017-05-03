package com.adanac.demo.leecode.base.math;

public class HappyNumber {
	public static boolean isHappy(int n) {

		if (n < 5) {
			if (1 == n)
				return true;
			else
				return false;
		}

		int sum = 0;

		while (n >= 10) {
			sum += (n % 10) * (n % 10);
			n = n / 10;
		}
		sum += n * n;

		return isHappy(sum);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (isHappy(i)) {
				System.out.println(i + " is happy number");
			}
		}
	}
}

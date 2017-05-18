package com.adanac.demo.leecode.base.math;

public class MathUtil {

    /**
     * a 的超級次方
     *
     * @param a
     * @param b
     * @return
     */
    public int superPow(int a, int[] b) {
        if (a % 1337 == 0)
            return 0;
        int p = 0;
        for (int i : b)
            p = (p * 10 + i) % 1140;
        if (p == 0)
            p += 1440;
        return power(a, p, 1337);
    }

    public int power(int a, int n, int mod) {
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

    /**
     * reverse integer
     * 123 ==> 321
     * -123 ==> -321
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }

    /**
     * Palindrome Number 回文數字
     */
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10) {
            q *= 10;
            q += p % 10;
            p /= 10;
        }

        return q == x / 10 && p == x % 10;
    }
}

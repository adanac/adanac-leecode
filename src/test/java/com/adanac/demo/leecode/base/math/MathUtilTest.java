package com.adanac.demo.leecode.base.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by allen on 2017/5/5.
 */
public class MathUtilTest {


    @Test
    public void isPalindrome() throws Exception {
        int size = 10000;
        for (int i = 0; i < size; i++) {
            if (mathUtil.isPalindrome(i)) {
                System.out.println(i + " 是回文");
            }
        }
    }

    protected MathUtil mathUtil;

    @Before
    public void setUp() throws Exception {
        mathUtil = new MathUtil();
        System.out.println("初始化MathUtil...");
    }

    @After
    public void tearDown() throws Exception {
        mathUtil = null;
        System.out.println("释放MathUtil...");
    }

    @Test
    public void superPow() throws Exception {
        int a = 2;
        int[] b = new int[2];
        System.out.println(mathUtil.superPow(a, b));
    }

    @Test
    public void power() throws Exception {

    }

    @Test
    public void reverse() throws Exception {
        int a = 321;
        Assert.assertEquals(123, mathUtil.reverse(a));
        int b = -123;
        Assert.assertEquals(-321, mathUtil.reverse(b));
    }

}
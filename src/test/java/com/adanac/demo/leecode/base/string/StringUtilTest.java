package com.adanac.demo.leecode.base.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {
    @Test
    public void isMatch() throws Exception {
        String s = "a   ab";
        String p = "c*a*b";
        assertTrue(stringUtil.isMatch(s, p));
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        String s = "001aabb22";
        assertEquals(8, stringUtil.lengthOfLongestSubstring(s));
    }

    @Test
    public void replaceEmptyStr() throws Exception {
        String str = "ab    c    dd    e";
        assertEquals("abcdde", stringUtil.replaceEmptyStr(str));
    }

    @Test
    public void aplusb() throws Exception {
        assertEquals(2, stringUtil.aplusb(1, 1));
    }

    @Test
    public void convert1() throws Exception {
        String str = "allenhello";
        System.out.println(stringUtil.convert(str, 3));
    }

    @Test
    public void myAtoi() throws Exception {
        assertEquals(56, stringUtil.myAtoi("56"));
    }

    @Test
    public void convert() throws Exception {
        String str = "allen1521";
        System.out.println(stringUtil.convert(str, 4));
    }

    protected StringUtil stringUtil;

    @Before
    public void setUp() throws Exception {
        stringUtil = new StringUtil();
        System.out.println("初始化StringUtil...");
    }

    @After
    public void tearDown() throws Exception {
        stringUtil = null;
        System.out.println("释放StringUtil...");
    }

}

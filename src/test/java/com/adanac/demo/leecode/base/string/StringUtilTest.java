package com.adanac.demo.leecode.base.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

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

	@Test
	public void testReplaceEmptyStr() {
		System.out.println(stringUtil.replaceEmptyStr("ab    c    dd    e"));
	}

	@Test
	public void testLengthOfLongestSubstring() {
		String s = "001aabb22";
		Assert.assertEquals(8, stringUtil.lengthOfLongestSubstring(s));
	}

	@Test
	public void testAplusB() {
		Assert.assertEquals(2, stringUtil.aplusb(1, 1));
	}

}

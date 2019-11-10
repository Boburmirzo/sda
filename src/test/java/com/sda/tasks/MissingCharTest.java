package com.sda.tasks;

import com.sda.tasks.junit.MissingChar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingCharTest {

	private MissingChar missingChar;

	@Before
	public void setUp(){
		missingChar = new MissingChar();
	}

	@Test
	public void case1(){
		Assert.assertEquals("ktten", missingChar.missingChar("kitten", 1));
	}

	@Test
	public void case2(){
		Assert.assertNull(missingChar.missingChar("kitten", 6));
	}

	@Test
	public void case3(){
		Assert.assertNull(missingChar.missingChar("kitten", -1));
	}
}

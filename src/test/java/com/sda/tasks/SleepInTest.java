package com.sda.tasks;

import com.sda.tasks.junit.SleepIn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SleepInTest {

	private SleepIn sleepIn;

	@Before
	public void setUpSleepInClass(){
		sleepIn = new SleepIn();
	}

	@Test
	public void sleepInFalseAndFalse(){
		Assert.assertTrue(sleepIn.sleepIn(false, false));
	}

	@Test
	public void sleepInTrueAndFalse(){
		Assert.assertFalse(sleepIn.sleepIn(true, false));
	}

	@Test
	public void sleepInFalseAndTrue(){
		Assert.assertTrue(sleepIn.sleepIn(false, true));
	}

	@Test
	public void sleepInTrueAndTrue(){
		Assert.assertTrue(sleepIn.sleepIn(true, true));
	}

	@After
	public void removeSleepInObject(){
		sleepIn = null;
	}
}

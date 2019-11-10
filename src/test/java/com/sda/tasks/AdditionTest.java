package com.sda.tasks;

import com.sda.tasks.junit.Addition;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void addMethodTest(){
		Addition addition = new Addition(3, 2);
		int c = 5;

		//Check if add method adding two values correctly
		Assert.assertEquals(c, addition.add());
	}

	@Test
	public void addMethodNotPassTest(){
		Addition addition = new Addition(3, 2);
		int d = 4;

		Assert.assertNotEquals(d,addition.add());
	}
}

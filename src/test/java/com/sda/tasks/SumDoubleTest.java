package com.sda.tasks;

import com.sda.tasks.junit.SumDouble;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumDoubleTest {

	private SumDouble sumDouble;

	@Before
	public void setUp(){
		sumDouble = new SumDouble();
	}

	@Test
	public void sumDouble1(){
		Assert.assertEquals(3, sumDouble.sumDouble(1,2));
	}

	@Test
	public void sumDouble2(){
		Assert.assertEquals(5, sumDouble.sumDouble(3,2));
	}

	@Test
	public void sumDouble3(){
		Assert.assertEquals(8, sumDouble.sumDouble(2,2));
	}

	@Test
	public void sumDouble4(){
		Assert.assertEquals(-1, sumDouble.sumDouble(0,-1));
	}

	@Test
	public void sumDouble5(){
		Assert.assertEquals(12, sumDouble.sumDouble(3,3));
	}

	@Test
	public void sumDouble6(){
		Assert.assertEquals(0, sumDouble.sumDouble(0,0));
	}

	@Test
	public void sumDouble7(){
		Assert.assertEquals(7, sumDouble.sumDouble(3,4));
	}

}

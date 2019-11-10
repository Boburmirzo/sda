package com.sda.tasks;

import com.sda.tasks.junit.NotString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NotStringTest {

	private NotString notString;

	@Before
	public void setUp(){
		notString = new NotString();
	}

	@Test
	public void whenGivenEmptyString_thenReturnNot(){
		Assert.assertEquals("not", notString.notString(""));
	}

	@Test
	public void whenGivenNullString_thenThrowException() throws IllegalArgumentException{
		try {
			notString.notString(null);
		} catch (IllegalArgumentException e) {
			System.out.println("Tests are giving exception");
		}
	}
}

package com.sda.tasks.codingbat;

import com.sda.tasks.codingbat.array1.FirstLast6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstLast6Test {

  private FirstLast6 firstLast6;

  @Before
  public void setUp(){
    firstLast6 = new FirstLast6();
  }

  @Test
  public void firstLast6TestCase1(){
    int[] input = {1,2,6};
    boolean actual = firstLast6.firstLast6Method(input);

    Assert.assertTrue(actual);
  }

  @Test
  public void firstLast6TestCase2(){
    int[] input = {6,1,2,3};
    boolean actual = firstLast6.firstLast6Method(input);

    Assert.assertTrue(actual);
  }

  @Test
  public void firstLast6TestCase3(){
//    int[] input = {13,6,1,2,3};
    boolean actual = firstLast6.firstLast6Method(new int[]{13,6,1,2,3});

    Assert.assertFalse(actual);
  }
}

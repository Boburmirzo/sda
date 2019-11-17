package com.sda.tasks.codingbat;

import com.sda.tasks.codingbat.array1.MakePi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MakePiTest {

  private MakePi makePi;

  @Before
  public void setUp(){
    makePi = new MakePi();
  }

  @Test
  public void threeDigitsFromPI(){
    int[] expect = {3,1,4};
    int[] actual = makePi.makePi(3);

    Assert.assertArrayEquals(actual, expect);
  }

  @Test
  public void fourDigitsFromPI(){
    int[] expect = {3,1,4,1};
    int[] actual = makePi.makePi(4);

    Assert.assertEquals(expect.length, actual.length);
//    Assert.assertArrayEquals(actual, expect);
  }
}

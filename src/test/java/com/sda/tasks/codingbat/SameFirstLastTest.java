package com.sda.tasks.codingbat;

import com.sda.tasks.codingbat.array1.SameFirstLast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {

  private SameFirstLast sameFirstLast;

  @Before
  public void setUp(){
    sameFirstLast = new SameFirstLast();
  }

  @Test
  public void sameFirstLastTestCase1(){
    boolean actual = sameFirstLast.sameFirstLastMethod(new int[]{1,2,3});

    Assert.assertFalse(actual);
  }

  @Test
  public void sameFirstLastTestCase2(){
    boolean actual = sameFirstLast.sameFirstLastMethod(new int[]{1,2,3,1});

    Assert.assertTrue(actual);
  }

  @Test
  public void sameFirstLastTestCase3(){
    boolean actual = sameFirstLast.sameFirstLastMethod(new int[]{1,2,1});

    Assert.assertTrue(actual);
  }
}

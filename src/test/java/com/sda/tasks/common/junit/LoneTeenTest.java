package com.sda.tasks.common.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoneTeenTest {

  private LoneTeen loneTeen = new LoneTeen();

//  @Before
//  public void setUp(){
//    loneTeen = new LoneTeen();
//  }
//
//  @After
//  public void removeObject(){
//    loneTeen = null;
//  }

  @Test
  public void loneTeenTestCase1(){
    boolean actual = loneTeen.loneTeen(13,99);

    Assert.assertTrue(actual);
  }

  @Test
  public void loneTeenTestCase2(){
    boolean actual = loneTeen.loneTeen(21,19);

    Assert.assertTrue(actual);
  }
}

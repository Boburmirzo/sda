package com.sda.tasks.common.junit;

import org.junit.Assert;
import org.junit.Test;

public class Front22Test {


  @Test
  public void kittenShouldBeKikittenki(){
    Front22Class front22Class = new Front22Class();
    String expect = "kikittenki";

    String actual = front22Class.front22Method("kitten");

    Assert.assertEquals(expect, actual);
  }

  @Test
  public void haShouldBeHaHaHa(){
    Front22Class front22Class = new Front22Class();
    String expect = "HaHaHa";

    String actual = front22Class.front22Method("Ha");

    Assert.assertEquals(expect, actual);
  }

  @Test
  public void nullValueShouldBeHandled(){
    Front22Class front22Class = new Front22Class();
    String expect = "";

    String actual = front22Class.front22Method(null);

    Assert.assertEquals(expect, actual);
  }
}

package com.sda.tasks.collection;

import com.sda.tasks.common.collection.W3Exercises;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class W3ExercisesTest {

  private W3Exercises w3Exercises;

  @Before
  public void setUp() {
    w3Exercises = new W3Exercises();
  }

  //Ex1
  @Test
  public void testGetListOfColors() {
    List<String> colors = w3Exercises.getListOfColors();

    Assert.assertEquals(3, colors.size());
  }

  //Ex2
  @Test
  public void testIterateListOfColors() {
    List<String> colors = w3Exercises.getListOfColors();

    Assert.assertEquals("Red", colors.get(0));
    Assert.assertEquals("Black", colors.get(1));
    Assert.assertEquals("White", colors.get(2));
  }
}

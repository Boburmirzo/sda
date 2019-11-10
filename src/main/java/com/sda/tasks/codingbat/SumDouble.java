package com.sda.tasks.codingbat;

import java.util.concurrent.TimeUnit;

/**
 *  Given two int values, return their sum.
 *  Unless the two values are the same, then return double their sum.
 * @author bobur
 * @version 1.0
 */
public class SumDouble {

  public static void main(String[] args) {
    long startTime = System.nanoTime();

    sumDouble3(2,3);   //Measure execution time for this method

    long endTime = System.nanoTime();

    long durationInNano = (endTime - startTime);  //Total execution time in nano seconds

    //Same duration in millis

    long durationInSecond = TimeUnit.NANOSECONDS.toSeconds(durationInNano);  //Total execution time in nano seconds

    System.out.println("***************");
    System.out.println(durationInNano);
    System.out.println(durationInSecond);
  }


  /**
   * Sum two values if they are different or double them if they are the same
   * @param a value to add
   * @param b value to add
   * @return returns sum of a and b
   */
  public int sumDouble1(int a,
                        int b) {
    if (a == b) {
      return 2 * (a + b);
    }
    return a + b;
  }

  public static int sumDouble2(int a,
                        int b) {
    return a != b ? a + b : 2 * (a + b);
  }

  public static int sumDouble3(int a,
                        int b) {
    int c = a + b;
    return a != b ? c : 2 * c;
  }
}

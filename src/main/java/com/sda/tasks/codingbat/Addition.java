package com.sda.tasks.codingbat;

public class Addition {

  public int addIfConditionMatch(int a,
                                 int b) {
    if (a > 2 && b < 4) {
      return a + b;
    }
    return a - b;
  }

  /**
   * Formula for converting into ternary operator
   * <p>
   * 1:
   * <p>
   * if(Condition){
   * statement1;
   * } else{
   * statement2;
   * }
   * <p>
   * Convert:
   * Condition ? statement1 : statement2;
   * <p>
   * 2:
   * if(Condition){
   * return statement1;
   * }
   * return statement2;
   * <p>
   * <p>
   * Convert:
   * return Condition ? statement1 : statement2;
   */

  public int addIfConditionMatch2(int a,
                                  int b) {
    return (a > 2 && b < 4) ? a + b : a - b;
  }
}
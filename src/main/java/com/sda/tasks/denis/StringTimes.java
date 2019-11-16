package com.sda.tasks.denis;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * @author bobur
 * @version 1.0
 */
public class StringTimes {


  /**
   * Multiply string n times;
   * @param str string to enlarge
   * @param n the number of times to repeat string
   * @return multiplied strings
   */
  public String stringTimes1(String str,
                            int n) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      stringBuilder.append(str);
    }
    return stringBuilder.toString();
  }

  //Trying to make it simple
  public String stringTimes2(String str,
                            int n) {
    String result = "";
    for (int i = 2; i <= n; i++) {
         result+=str;
    }
    return str;
  }
}

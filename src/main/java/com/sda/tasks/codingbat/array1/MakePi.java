package com.sda.tasks.codingbat.array1;


public class MakePi {

  public int[] makePi(int numOfDigits) {
    int PI = 3141; // 1
    String stringPI = String.valueOf(PI);//1
    String subString = stringPI.substring(0,numOfDigits);//1
    char[] chars = subString.toCharArray();//1

    int[] result = new int[chars.length];//1

    for (int i=0; i<chars.length-1; i++){
      result[i] = chars[i];

    } //n^2
    return result;//1
  }



}

package com.sda.tasks.common.junit;

public class Front22Class {

  public String front22Method(String str) {
    // First figure the number of chars to take
    if(str == null){
      return "";
    }
    int take = 2;
    if (take > str.length()) {
      take = str.length();
    }

    String front = str.substring(0, take);
    return front + str + front;
  }
}

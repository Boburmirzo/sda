package com.sda.tasks.common.collection;

import java.util.ArrayList;
import java.util.List;

public class W3Exercises {

  public static void main(String[] args) {
    //ex1
    W3Exercises w3Exercises = new W3Exercises();
    List<String> list = new ArrayList<>();

    List<String> colors = w3Exercises.getListOfColors();

    System.out.println(colors);

    //ex2 Iterate through the loop
    w3Exercises.iterateListOfColors();
  }

  //Ex1
  public List<String> getListOfColors(){
    List<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Black");
    colors.add("White");
    return colors;
  }

  //Ex2
  public void iterateListOfColors(){
    List<String> colors = getListOfColors();
    for(String s: colors){
      System.out.println("color is: "+s);
    }
  }


}

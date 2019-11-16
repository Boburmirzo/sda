package com.sda.tasks.oop.oop3;

public class Parser {

  public Person createPersonFromLine(String line){
    String[] parsedLine = line.split(" ");
//    parsedLine[0] = "John";
//    parsedLine[1] = "Smith";
//    parsedLine[2] = "13/07/1990";
    return new Person(parsedLine[0], parsedLine[1], parsedLine[2]);
  }
}

package com.sda.tasks.oop.oop1;

public class Main {

  public static void main(String[] args) {
    Dog emmy = new Dog(3, "black");
    Dog brutto = new Dog(5, "White");



    /**
     *
     * overriding
     * overloading
     *   It happens inside one class, when you have two or more methods with the same name
     *   but different arguments and they can do different logic inside method.
     */




    System.out.println(emmy.getAge() + "   " + emmy.getColour());
  }
}

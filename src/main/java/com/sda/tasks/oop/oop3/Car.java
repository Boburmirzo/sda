package com.sda.tasks.oop.oop3;

import java.util.Date;

public class Car implements Vehicle {

  /**
   * Date: when person buys a car
   */
  private String date;
  /**
   * Brand: type of car's brand and it is chosen by a person
   */
  private String brand;

  @Override
  public void buy(Person person,
                  Vehicle vehicle,
                  String date,
                  String brand) {
    this.date = date;
    this.brand = brand;
    System.out.println(person.getFirstName() + "wants to buy a car " + " brand of " +brand + "on this date" + date);
  }
}

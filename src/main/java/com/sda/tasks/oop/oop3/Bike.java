package com.sda.tasks.oop.oop3;

public class Bike implements Vehicle {

  private String date;
  private String brand;

  @Override
  public void buy(Person person,
                  Vehicle vehicle,
                  String date,
                  String brand) {
    this.date = date;
    this.brand = brand;
    System.out.println(person.getFirstName() + " wants to buy a bike " + ", the brand of " + brand + " on this date " + date);
  }
}

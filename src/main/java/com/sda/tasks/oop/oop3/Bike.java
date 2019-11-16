package com.sda.tasks.oop.oop3;

public class Bike extends Vehicle {

  @Override
  public void buy(String date,
                  String brand) {
    setDate(date);
    setBrand(brand);
  }
}

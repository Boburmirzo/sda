package com.sda.tasks.oop.oop3;

import java.util.Date;

public class Car extends Vehicle {

  @Override
  public void buy(String date,
                  String brand) {
    setDate(date);
    setBrand(brand);
  }
}

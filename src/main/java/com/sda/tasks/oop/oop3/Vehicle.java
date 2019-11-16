package com.sda.tasks.oop.oop3;

public abstract class Vehicle {

  /**
   * Date: when person buys a car
   */
   String date;

  /**
   * Brand: type of car's brand and it is chosen by a person
   */
   String brand;

   String vehicleNumber;

   abstract void buy(String date,
                     String brand);

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}

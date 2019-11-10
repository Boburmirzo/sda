package com.sda.tasks.oop.oop1;

public class Dog extends Animal{

  public Dog(int age,
             String colour) {
    super(age, colour);
  }

  @Override
  public String getBehavior() {
    return "He is very crazy";
  }

  @Override
  public void setBehavior(String behavior) {
    behavior = "don't be crazy please";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  @Override
  public void setSound(String sound) {
    super.setSound(sound);
  }
}

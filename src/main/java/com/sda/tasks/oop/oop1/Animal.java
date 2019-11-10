package com.sda.tasks.oop.oop1;

public abstract class Animal {
  public int age;
  public String colour;
  public String sound = "some voice";
  public String behavior;

  public Object object;

  public Animal(int age,
                String colour) {
    this.age = age;
    this.colour = colour;
  }

  public abstract String getBehavior();

  public abstract void setBehavior(String behavior);


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }
}

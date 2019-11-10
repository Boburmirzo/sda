package com.sda.tasks.oop.oop2;

/**
 *  Person class means all people in different fields
 *
 * @author bobur
 * @version 1.0
 */
public class Person {
  /**
   * First Name of person.
   * It should be private because of Encapsulation rule in OOP.
   */
  private String firstName;
  /**
   * Last Name of person.
   * It should be private because of Encapsulation rule in OOP.
   */
  private String lastName;
  /**
   * Age of person.
   * It should be private because of Encapsulation rule in OOP.
   */
  private int age;

  /**
   * Person constructor.
   * @param firstName First name
   * @param lastName Last name
   * @param age Age
   */
  public Person(String firstName,
                String lastName,
                int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "First Name is ='" + firstName + '\'' +
        ", Last Name is ='" + lastName + '\'' +
        ", age=" + age +
        '}';
  }
}

package com.sda.tasks.oop.oop3;

/**
 * Person
 *
 * @author bobur
 * @version 1.0
 */
public class Person {
  private String firstName;
  private String lastName;
  private String dateOfBirth;

  /**
   * Person constructor
   * @param firstName first name
   * @param lastName last name
   * @param dateOfBirth age
   */
  public Person(String firstName,
                String lastName,
                String dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
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

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}

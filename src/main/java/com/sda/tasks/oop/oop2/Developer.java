package com.sda.tasks.oop.oop2;

import com.sda.tasks.market.PersonVehicle;

/**
 * Developer is a Software engineer which inherits from Person
 *
 * @author bobur
 * @version 1.0
 */
public class Developer extends Person {
  private String skills;

  /**
   * Person constructor.
   *
   * @param firstName First name
   * @param lastName  Last name
   * @param age       Age
   */
  public Developer(String firstName,
                   String lastName,
                   int age,
                   String skills) {
    super(firstName, lastName, age);
    this.skills = skills;
  }

  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  @Override
  public String toString() {
    return "Developer{" +
        "skills='" + skills + '\'' +
        '}';
  }
}

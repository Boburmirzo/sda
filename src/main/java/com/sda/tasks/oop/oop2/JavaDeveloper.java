package com.sda.tasks.oop.oop2;

/**
 * Java Developer is a Software engineer which inherits from Developer
 *
 * @author bobur
 * @version 1.0
 */
public class JavaDeveloper extends Developer {
  private String software;

  /**
   * Person constructor.
   *
   * @param firstName First name
   * @param lastName  Last name
   * @param age       Age
   * @param skills Java developer skills
   */

  public JavaDeveloper(String firstName,
                       String lastName,
                       int age,
                       String skills,
                       String software) {
    super(firstName, lastName, age, skills);
    this.software = software;
  }

  public JavaDeveloper(String firstName,
                       String lastName,
                       int age,
                       String skills) {
    super(firstName, lastName, age, skills);
  }

  public String getSoftware() {
    return software;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  @Override
  public String toString() {
    return "JavaDeveloper{" +
        "First name is ='" + getFirstName() + '\'' +
        '}';
  }
}

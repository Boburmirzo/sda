package com.sda.tasks.oop.oop2;

public class Main {

  public static void main(String[] args) {
    JavaDeveloper javaDeveloper1 = new JavaDeveloper("John",
        "Smith", 21, "Good coding skills, Knows OOP", "Eclipse");

    JavaDeveloper javaDeveloper2 = new JavaDeveloper("John",
        "Smith", 21, "Good coding skills, Knows OOP");

    javaDeveloper2.setSoftware("Intellij Idea");

//    System.out.println(javaDeveloper2.getFirstName());
//    System.out.println(javaDeveloper2.getLastName());
//    System.out.println(javaDeveloper2.getAge());
//    System.out.println(javaDeveloper2.getSkills());
//    System.out.println(javaDeveloper2.getSoftware());

    System.out.println(javaDeveloper2);
  }
}

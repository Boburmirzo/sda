package com.sda.tasks.oop.oop3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Who are you?");
    String line = scanner.nextLine();
    Parser parser = new Parser();
    Person newPerson = parser.createPersonFromLine(line);

    System.out.println("We have only bike and car");
    System.out.println("What do you want to buy?");

    String personChoose = scanner.nextLine();

    if(personChoose.contains("car")){
       Car newCar = new Car();
       System.out.println("Which brand of cars do you prefer?");
       System.out.println("We have these brands: " + Brand.BMW + ", " + Brand.MAZDA + ", " + Brand.NISSAN);
       String carBrand = scanner.nextLine();
       newCar.buy("16/11/2019", carBrand);

      System.out.println(newPerson.getFirstName() +
          "wants to buy a car " + " brand of " + newCar.getBrand() +
          "on this date" + newCar.getDate());

    } else {
      Bike newBike = new Bike();
      System.out.println("Which brand of bikes do you prefer?");
      System.out.println("We have these brands: " + Brand.BMW + ", " + Brand.MAZDA + ", " + Brand.NISSAN);
      String bikeBrand = scanner.nextLine();
      newBike.buy("16/11/2019", bikeBrand);

      System.out.println(newPerson.getFirstName() +
          "wants to buy a bike " + " brand of " + newBike.getBrand() +
          "on this date" + newBike.getDate());
    }
  }
}

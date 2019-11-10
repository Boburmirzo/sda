package com.sda.tasks.Onne;

public class Exercise2 {
    public static void main(String[] args) {

        int number = 70;
        String result = "";

        if (number % 3 != 0  && number % 5 != 0  && number % 7 != 0) {
            result = String.valueOf(number);

        } else {


            if (number % 3 == 0) {
                result += "Pling";
            }

            if (number % 5 == 0) {
                result += "Plang";
            }

            if (number % 7 == 0) {
                result += "Plong";
            }

        }

        System.out.println(result);;
    }
}


// some comments


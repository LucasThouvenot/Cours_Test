package com.test.trytest;

public class FizzBuzz {

    public static String getOutput(int number) {
        if (number >= 1000) {
            throw new IllegalArgumentException("Number should not be greater than 1000");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(number);
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        System.out.println(FizzBuzz.getOutput(15)); // Affiche "FizzBuzz"
        System.out.println(FizzBuzz.getOutput(3));  // Affiche "Fizz"
        System.out.println(FizzBuzz.getOutput(5));  // Affiche "Buzz"
        System.out.println(FizzBuzz.getOutput(7));  // Affiche "7"
    }
}

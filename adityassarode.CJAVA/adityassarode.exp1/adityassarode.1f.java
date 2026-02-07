//Aditya Sarode

//1f. Implement a program to print a simple pattern, such as a triangle or a square.


import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = r.nextInt(10) + 1; 
        int guess;

        System.out.println("Guess a number between 1 and 10:");

        do {
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high, try again:");
            } else if (guess < number) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != number);
    }
}

//Aditya Sarode

//1e. Implement a program to print a simple pattern, such as a triangle or a square.

import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        System.out.println("Tirangle: \n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSquare: \n");

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


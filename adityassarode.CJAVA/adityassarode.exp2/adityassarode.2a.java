//Aditya Sarode

//2a. Develop a basic calculator program that can perform addition, subtraction, multiplication, and division.


import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.println("Enter two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if(choice == 1) {
            System.out.println("Result = " + (a + b));
        } else if(choice == 2) {
            System.out.println("Result = " + (a - b));
        } else if(choice == 3) {
            System.out.println("Result = " + (a * b));
        } else if(choice == 4) {
            System.out.println("Result = " + (a / b));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}

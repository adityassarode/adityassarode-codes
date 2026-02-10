//Aditya Sarode

//1d. Create a program that converts temperature from Fahrenheit to Celsius and vice versa.


import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.println("Enter temperature value:");
        float temp = sc.nextFloat();
        float result;

        if(choice == 1) {
            result = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius = " + result);
        } else {
            result = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit = " + result);
        }
    }
}

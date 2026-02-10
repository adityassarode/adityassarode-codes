//Aditya Sarode

//1a. Develop a program that calculates the average of three numbers entered by the user.



import java.util.Scanner;

class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a + b + c) / 3.0f;

        System.out.println("Average = " + avg);
    }
}

//Aditya Sarode

//1b. Create a program that calculates the factorial of a given number.



import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");

        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}


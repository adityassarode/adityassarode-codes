//Aditya Sarode

//1c. Implement a program to generate and print the first n numbers in the Fibonacci series.



import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");

        int n = sc.nextInt();
        int a = 0, b = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

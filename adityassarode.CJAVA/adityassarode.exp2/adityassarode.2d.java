//Aditya Sarode

//2d. Develop a Java application that performs string manipulation, including concatenation, substring extraction, and searching.

import java.util.Scanner;

class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.next();

        System.out.println("Enter second string:");
        String s2 = sc.next();

        System.out.println("1. Concatenate\n  2. Substring\n  3. Search\n");
        System.out.println("Enter your choice: ");

        int ch = sc.nextInt();

        if (ch == 1)
            System.out.println("Result = " + (s1 + s2));

        else if (ch == 2) {
            System.out.println("Enter start index:");
            int a = sc.nextInt();
            System.out.println("Enter end index:");
            int b = sc.nextInt();
            System.out.println("Result = " + s1.substring(a, b));
        }

        else if (ch == 3) {
            System.out.println("Enter character to search:");
            System.out.println("Result = " + s1.indexOf(sc.next().charAt(0)));
        }
    }
}

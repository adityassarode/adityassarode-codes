//Aditya Sarode

//2b. Create a program that checks whether a given string is a palindrome or not.


import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.next();

        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if(s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

//Aditya Sarode

//2c. Write a program that counts the frequency of each character in a given string.


import java.util.Scanner;

class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.next();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            for(int j = 0; j < s.length(); j++) {
                if(ch == s.charAt(j)) {
                    count++;
                }
            }

            if(s.indexOf(ch) == i) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}

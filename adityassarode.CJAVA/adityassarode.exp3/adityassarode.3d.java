//Aditya Sarode

//3d. Create a Java application that generates a random password based on user-specified criteria, such as length and character types.


import java.util.*;

class PasswordGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter password length:");
        int len = sc.nextInt();

        String chars = "";

        System.out.println("Add lowercase? (y/n)");
        if(sc.next().equals("y")) chars += "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Add uppercase? (y/n)");
        if(sc.next().equals("y")) chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Add numbers? (y/n)");
        if(sc.next().equals("y")) chars += "0123456789";

        System.out.println("Add special characters? (y/n)");
        if(sc.next().equals("y")) chars += "!@#$%&*";

        String pass = "";

        for(int i=0;i<len;i++)
            pass += chars.charAt(r.nextInt(chars.length()));

        System.out.println("Generated Password: " + pass);
    }
}

//Aditya Sarode

//2f. Write a Java program to handle file I/O, reading data from a file and writing data to another file.


import java.io.*;
import java.util.Scanner;

class FileCopy {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String src = sc.next();

        System.out.println("Enter destination file name:");
        String dest = sc.next();

        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("File copied successfully");
    }
}

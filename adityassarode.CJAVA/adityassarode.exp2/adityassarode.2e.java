//Aditya Sarode

//2e. Build a Java program that reads a text file, counts the occurrences of each word, and displays the word frequency.


import java.io.*;
import java.util.*;

class WordCount {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String file = sc.next();

        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<String, Integer> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            for (String w : line.split(" ")) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        for (String w : map.keySet())
            System.out.println(w + " = " + map.get(w));
    }
}

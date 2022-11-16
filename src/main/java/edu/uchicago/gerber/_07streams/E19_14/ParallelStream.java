package edu.uchicago.gerber._07streams.E19_14;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class ParallelStream {
    // Read all words from a file into an ArrayList<String>, then turn it into a parallel
    //stream. Use the dictionary file words.txt provided with the book’s companion code.
    //Use filters and the findAny method to find any palindrome that has at least five
    //letters, then print the word. What happens when you run the program multiple
    //times?
    public static boolean checkPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String s_rev = sb.reverse().toString();
        return s.equals(s_rev);
    }
    public static void read_file(String filename){
        File f = new File(filename);
        ArrayList<String> a = new ArrayList<>();
        try(Scanner s = new Scanner(f)){
            while(s.hasNext()){
                String word = s.next();
                a.add(word);
            }
            Stream<String> streams = a.stream().parallel();
            String result =streams.filter(str->str.length()>4).filter(str->checkPalindrome(str)==true).findAny().orElse("No such word");
            System.out.println("The palindrome with at five letters is: "+result);


        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Error Occurs: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        read_file("words.txt");

    }
}

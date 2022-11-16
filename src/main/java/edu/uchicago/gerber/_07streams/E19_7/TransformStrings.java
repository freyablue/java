package edu.uchicago.gerber._07streams.E19_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransformStrings {
    //Write a lambda expression for a function that turns
    //a string into a string made of the first letter, three
    //periods, and the last letter, such as "W...d". (Assume
    //the string has at least two letters.) Then write a program that reads words into a
    //stream, applies the lambda expression to each element, and prints the result. Filter
    //out any words with fewer than two letters
    public static String lambda(String s){
        return s.charAt(0)+"..."+s.charAt(s.length()-1);
    }

    public static void filter(String filename){
        File f = new File(filename);
        ArrayList<String> a = new ArrayList<>();
        try(Scanner s = new Scanner(f)){
            while(s.hasNext()){
                String word = s.next();
                a.add(word);
            }
            Stream<String> streams = a.stream();
            List<String> result =streams.filter(str->str.length()>2).map(str->lambda(str)).collect(Collectors.toList());
            for(String curr:result){
                System.out.println(curr);

            }


        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Error Occurs: "+e.getMessage());
        }

    }

    public static void main(String[] args) {
        String filename = "C:\\Users\\yijia chen\\Desktop\\projava-freyablue-master\\src\\main\\java\\edu\\uchicago\\gerber\\_07streams\\E19_7\\test";
        filter(filename);
    }
}

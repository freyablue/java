package edu.uchicago.gerber._07streams.E19_7;

import java.util.List;

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

    public void filter(List<String> input){
        for(String s:input){

        }

    }
}

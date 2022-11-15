package edu.uchicago.gerber._07streams.E19_5;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommaSeparated {
    //Write a method
    //public static <T> String toString(Stream<T> stream, int n)
    //that turns a Stream<T> into a comma-separated list of its first n elements.
    public static <T> String toString(Stream<T> stream, int n){
        List<T> list = stream.limit(n).collect(Collectors.toList());
        String output = "";
        for(T ele:list){
            output+=ele;
        }
        return output;
    }
    public static void main(String[] args) {

    }
}

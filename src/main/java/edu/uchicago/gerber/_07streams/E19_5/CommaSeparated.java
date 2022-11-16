package edu.uchicago.gerber._07streams.E19_5;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommaSeparated {
    //Write a method
    //public static <T> String toString(Stream<T> stream, int n)
    //that turns a Stream<T> into a comma-separated list of its first n elements.
    public static <T> String toString(Stream<T> stream, int n){
        Stream<String> output= stream.limit(n).map(s->s.toString());
        String result = output.collect(Collectors.joining(","));
        return result;
    }
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1,2,3,4,5,6,7,8,10,15,20);
        System.out.println(toString(nums,5));

    }
}

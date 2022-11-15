package edu.uchicago.gerber._07streams.E13_4;
import java.util.*;
public class Binary_Recursive_Driver {
    public static void main(String[] args) {
        Binary_Recursive br = new Binary_Recursive();
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int n = s.nextInt();
        String result = br.BinaryTransform(n);
        System.out.println("The binary digits of the number: " +result);

    }
}

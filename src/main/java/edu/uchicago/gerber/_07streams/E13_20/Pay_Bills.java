package edu.uchicago.gerber._07streams.E13_20;
import java.util.*;
public class Pay_Bills {
    public static void pay(int n){

        //Given an integer price, list all possible ways of paying for it with $100, $20, $5, and $1
        //bills, using recursion. Don’t list duplicates.
//        int[][] result = new int[0][0];
        int div_20 = n/20;
        for(int i=0;i<div_20+1;i++){
            int curr = n-i*20;
            int div_5 = curr/5;
            for(int j =0;j<div_5+1;j++){
                int now = curr-j*5;
                if(n-20*i-j*5-curr>=100){
                    System.out.println("100: "+(n-20*i-j*5-curr)/100);
                }
                else{
                    System.out.println("100: 0");
                    System.out.println("20: "+i);
                    System.out.println("5: "+j);
                    System.out.println("1: "+ now);
                    System.out.println("End of this plan");
                }
            }

        }

    }

    public static void main(String[] args) {
        pay(50);
    }
}

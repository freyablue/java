package edu.uchicago.gerber._02arrays;

public class P5_8 {
    public static boolean isLeapYear(int year){
        if (year%100!=0 && year%4 ==0){
            return true;
        }
        else if (year%400==0){
            return true;
        }
        return false;
    }
}

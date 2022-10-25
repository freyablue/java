package edu.uchicago.gerber._04interfaces.E9_17;
import java.util.*;
public class Driver_SodaCan {
    public static void main(String[] args) {
        SodaCan[] cans = new SodaCan[4];
        cans[0] = new SodaCan(10.0,2);
        cans[1] = new SodaCan(20,4.5);
        cans[2] = new SodaCan(4,5);
        cans[3] = new SodaCan(6,10);
//        System.out.println(cans[3].getSurfaceArea());

        System.out.println("average surface area of an array of soda cans is: "+ sum_a(cans));
    }

    public static double sum_a(SodaCan[] m){
        double s = 0;
        for(SodaCan e:m){
            s+=e.measureSoda();
        }
        s = s/m.length;
        return s;

    }
}

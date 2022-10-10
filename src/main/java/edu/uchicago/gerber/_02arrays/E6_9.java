package edu.uchicago.gerber._02arrays;
import java.util.*;
public class E6_9 {
    public static boolean equals(int[] a, int[] b){
        if (a.length!=b.length) return false;
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]) return false;
            }
        }
        return true;
    }
}

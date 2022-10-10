package edu.uchicago.gerber._02arrays;
import java.util.*;
public class E6_12 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        for(int i=0;i<nums.length;i++){
            nums[i] = (int) (Math.random()*99);
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
        Arrays.sort(nums);
        System.out.println(" ");
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}

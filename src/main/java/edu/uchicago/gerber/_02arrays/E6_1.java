package edu.uchicago.gerber._02arrays;
import java.util.*;

public class E6_1 {
    public static void main(String[] args) {
        Random r= new Random();
        int[] nums = new int[10];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
            if(i%2==0){
                list1.add(nums[i]);
            }
            if (nums[i]%2==0){
                list2.add(nums[i]);
            }
            if(i==0||i== nums.length-1){
                list4.add(nums[i]);
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            list3.add(nums[i]);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}

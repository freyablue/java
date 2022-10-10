package edu.uchicago.gerber._02arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class P5_24 {

    public int toInteger(String s){
        Map<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        while(!s.isEmpty()){
            int flag;
            if(s.length()==1||map.get(s.charAt(0))-map.get(s.charAt(1))>=0){
                count=count+map.get(s.charAt(0));
                flag = 1;
            }
            else{
                count+=(map.get(s.charAt(1))-map.get(s.charAt(0)));
                flag = 2;
            }
            s = s.substring(flag);
        }
        return count;
    }
}

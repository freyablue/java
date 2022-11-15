package edu.uchicago.gerber._07streams.P13_3;

import java.util.ArrayList;

public class Tele_Convert {
    String[] c = {" ", " ","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

    public ArrayList<String> printWords(String s){
        ArrayList<String> poss_sol = new ArrayList<>();
        if(s.length()==0){
            poss_sol.add("");
            return poss_sol;
        }
        char curr = s.charAt(0);
        String rest = s.substring(1);
        poss_sol = printWords(rest);
        ArrayList<String> sol = new ArrayList<>();
        for(String pre:poss_sol){
            String decode = c[0];
            if(Character.isDigit(curr)){
                decode = c[curr-'0'];
            }

            for(int i=0;i<decode.length();i++){
                sol.add(decode.charAt(i)+pre);
            }
        }
        return sol;

    }

}

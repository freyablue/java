package edu.uchicago.gerber._07streams.YodaSpeakRecursive;

public class YodaSpeakRecursive {

    public String convert(String s){
        int st = s.indexOf(" ");
        if(st==-1){
            return s;
        }
        String rest = s.substring(st+1);
        String curr = s.substring(0,st);
        return convert(rest)+" "+curr;

    }
}

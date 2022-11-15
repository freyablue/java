package edu.uchicago.gerber._07streams.YodaSpeak;

public class YodaSpeak {
    public String convert(String s){
        //Create a console program that takes a sentence and reverses the order
        //of the words. For example, if the sentence is "The force is strong with you", The output
        //would be "you with strong is force The". Implement this program iteratively.
        if( s.length()==0){
            return s;
        }
        String[] rev = s.split(" ");
        String result = "";
        int st = 0;
        for(int i=rev.length-1;i>=0;i--){
            result = result+ rev[i];
            if(i!=0){
                result+=" ";
            }
        }
        return result;
    }
}

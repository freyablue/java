package edu.uchicago.gerber._07streams.YodaSpeak;

public class YodaSpeak_Driver {
    public static void main(String[] args) {
        YodaSpeak ys = new YodaSpeak();
        String input = "The force is strong with you";
        System.out.println(ys.convert(input));
    }
}

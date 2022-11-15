package edu.uchicago.gerber._07streams.E13_4;

public class Binary_Recursive {

    public Binary_Recursive(){
    }
    public String BinaryTransform(int n){
        if(n<2){
            return ""+n;
        }
        else{
            return BinaryTransform(n/2)+n%2;
        }
    }
}
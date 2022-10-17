package edu.uchicago.gerber._03objects.P8_1;

public class P8_1 {
    public int power_level = 1;
    public int time = 0;
    public void start(){
        System.out.println("Cooking for "+time +" seconds at level "+power_level);
    }
    public void reset(){
        time = 0;
    }
    public void switching(){
        if (power_level==1){
            power_level = 2;
        }
        else if (power_level==2){
            power_level = 1;
        }
    }
    public void increase(){
        time+=30;
    }
}

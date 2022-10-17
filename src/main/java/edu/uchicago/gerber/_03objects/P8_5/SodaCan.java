package edu.uchicago.gerber._03objects.P8_5;

public class SodaCan {
    public double height;
    public double radius;
    public SodaCan(double height,double radius){
        this.height = height;
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
}

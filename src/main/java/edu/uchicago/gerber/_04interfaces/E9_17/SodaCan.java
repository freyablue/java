package edu.uchicago.gerber._04interfaces.E9_17;

public class SodaCan implements Measurable{
    private double height;
    private double radius;
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

    @Override
    public double measureSoda() {
        return getSurfaceArea();
    }
}


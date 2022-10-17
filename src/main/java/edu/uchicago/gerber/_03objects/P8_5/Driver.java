package edu.uchicago.gerber._03objects.P8_5;

public class Driver {
    public static void main(String[] args) {
        SodaCan c = new SodaCan(20.0,2.5);
        System.out.println("The volume of the Soda Can is: "+c.getVolume());
        System.out.println("The Surface area of the Soda Can is: "+c.getSurfaceArea());
        SodaCan c2 = new SodaCan(2.0,1.0);
        System.out.println("The volume of the Soda Can is: "+c2.getVolume());
        System.out.println("The Surface area of the Soda Can is: "+c2.getSurfaceArea());
    }
}

package edu.uchicago.gerber._04interfaces.E9_13;
import java.util.*;

public class BetterRectangle_Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input coordinate x: ");
        int x = s.nextInt();
        System.out.print("Input coordinate y: ");
        int y = s.nextInt();
        System.out.print("Input width: ");
        int width = s.nextInt();
        System.out.print("Input height: ");
        int height = s.nextInt();
        BetterRectangle b = new BetterRectangle(x,y,width,height);
        System.out.println("the rectangle's size: width: "+ width+" height: "+height);
        System.out.println("the rectangle's coordinate location is: ("+x+", "+y+" )");
        System.out.println("the rectangle's area is: "+b.getArea());
        System.out.println("the rectangle's perimeter is: "+b.getPerimeter());


    }

}

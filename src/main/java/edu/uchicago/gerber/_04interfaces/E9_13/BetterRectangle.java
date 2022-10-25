package edu.uchicago.gerber._04interfaces.E9_13;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    double area;
    double perimeter;
    public BetterRectangle(int x, int y,int width,int height){
        super.setLocation(x,y);
        super.setSize(width,height);
    }
    public double getPerimeter(){
        perimeter =2*this.getHeight()+2*this.getWidth();
        return perimeter;

    }
    public double getArea(){
        area = this.getWidth()*this.getHeight();
        return area;
    }
}

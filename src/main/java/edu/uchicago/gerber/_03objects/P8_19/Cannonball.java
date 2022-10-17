package edu.uchicago.gerber._03objects.P8_19;
import java.util.*;
public class Cannonball {
    private double x_pos;
    private double y_pos;
    private double x_v;
    private double y_v;
    private final double gravity = -9.81;
    public Cannonball(double x_pos){
        this.x_pos = x_pos;
        this.y_pos = 0.0;
        this.x_v = 0.0;
        this.y_v = 0.0;
    }
    public void move(double sec){
        double x_dis = x_v*sec;
        double y_dis = y_v*sec+0.5*gravity*sec*sec;
        x_pos+=x_dis;
        y_pos+=y_dis;
        y_v += gravity*sec;


    }
    public void shoot(double angle, double v){
        x_v = v*Math.cos(Math.toRadians(angle));
        y_v = v*Math.sin(Math.toRadians(angle));
        while(y_pos>=0){
            move(0.1);
            double x = getX_pos();
            double y =getY_pos();
            System.out.println("Current x is: "+ x+" Current y is "+y);
        }

    }
    public double getX_pos() {
        return x_pos;
    }
    public double getY_pos() {
        return y_pos;
    }
}

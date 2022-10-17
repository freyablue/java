package edu.uchicago.gerber._03objects.P8_19;

import java.util.Scanner;

public class Cannonball_Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cannonball ball = new Cannonball(0);
        System.out.println("Input angle: ");
        double alpha = in.nextInt();
        System.out.println("Input starting velocity ");
        double v = in.nextInt();
        ball.shoot(alpha,v);
        in.close();
    }
}

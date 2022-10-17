package edu.uchicago.gerber._03objects.P8_19;

import java.util.Scanner;

public class Cannonball_Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cannonball thisBall = new Cannonball(20);
        System.out.println("Starting angle: ");
        double alpha = in.nextInt();
        System.out.println("Starting velocity ");
        double v = in.nextInt();
        thisBall.shoot(alpha,v);
        in.close();

    }
}

package edu.uchicago.gerber._06design.E12_4;
import java.util.*;
public class Arithmetic_Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Arithmetic a = new Arithmetic();
        System.out.println("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = s.nextInt();
        System.out.println("Enter your result: ");
        int n3 = s.nextInt();
        Arithmetic a  = new Arithmetic(n1,n2,n3);
        int points = a.level1();
        if(points!=5){
            System.out.println("Re-enter the first number: ");
            n1 = s.nextInt();
            System.out.println("Re-enter the second number: ");
            n2 = s.nextInt();
            System.out.println("Re-enter the result: ");
            n3 = s.nextInt();
            a  = new Arithmetic(n1,n2,n3);
            points = a.level1();
            if(points!=5){
                System.out.println("Game over.");
                System.exit(0);
            }

        }
        System.out.println("Enter the first number: ");
        n1 = s.nextInt();
        System.out.println("Enter the second number: ");
        n2 = s.nextInt();
        System.out.println("Enter your result: ");
        n3 = s.nextInt();
        Arithmetic b = new Arithmetic(n1,n2,n3);
        points = b.level2();
        if(points!=5){
            System.out.println("Re-enter the first number: ");
            n1 = s.nextInt();
            System.out.println("Re-enter the second number: ");
            n2 = s.nextInt();
            System.out.println("Re-enter the result: ");
            n3 = s.nextInt();
            b  = new Arithmetic(n1,n2,n3);
            points = b.level2();
            if(points!=5){
                System.out.println("Game over.");
                System.exit(0);
            }
        }
        System.out.println("Enter the first number: ");
        n1 = s.nextInt();
        System.out.println("Enter the second number: ");
        n2 = s.nextInt();
        System.out.println("Enter your result: ");
        n3 = s.nextInt();
        Arithmetic c = new Arithmetic(n1,n2,n3);
        points =c.level3();
        if(points!=5){
            System.out.println("Re-enter the first number: ");
            n1 = s.nextInt();
            System.out.println("Re-enter the second number: ");
            n2 = s.nextInt();
            System.out.println("Re-enter the result: ");
            n3 = s.nextInt();
            c  = new Arithmetic(n1,n2,n3);
            points = c.level3();
            if(points!=5){
                System.out.println("Game over.");
                System.exit(0);
            }
        }


    }
}

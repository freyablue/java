package edu.uchicago.gerber._06design.E12_4;
import java.util.*;
public class Arithmetic {
    //Write a program that teaches arithmetic to a young child. The program tests addition
    //and subtraction. In level 1, it tests only addition of numbers less than ten whose sum
    //is less than ten. In level 2, it tests addition of arbitrary one-digit numbers. In level 3, it
    //tests subtraction of one-digit numbers with a nonnegative difference.
    //Generate random problems and get the player’s input. The player gets up to two tries
    //per problem. Advance from one level to the next when the player has achieved a score
    //of five points
    private int points;
    private String player;
    private boolean b;

    int n1,n2,n3;
    public Arithmetic(int n1, int n2,int n3){
//        this.player = player;
        this.points = 0;
        this.n1= n1;
        this.n2 = n2;
        this.n3 = n3;
        this.b=true;
    }

    public int level1(){
        points = 0;
        if(n1+n2>=10){
            System.out.println(n1+" and  "+n2+" are not valid for level 1" );
            return points;
        }
        if(n1+n2==n3){
            points+=5;
        }
        if(n1+n2!=n3 ){
            System.out.println("Wrong!");
        }
        if(points==5){
            System.out.println("Congratulations! you can now advanced to level 2.");
        }
        return points;
    }

    public int level2(){
        if(n1>=10||n2>=10){
            System.out.println(n1+" and  "+n2+" are not valid for level 2" );
        }
        if(n1+n2==n3){
            points+=5;
        }
        else{
            System.out.println("Wrong!");
        }
        if(points==5){
            System.out.println("Congratulations! you can now advanced to level 3.");
        }
        return points;

    }

    public int level3(){
        if(n1-n2<0){
            System.out.println(n1+" and  "+n2+" are not valid for level 3" );
        }
        if(n1-n2 == n3){
            points+=5;
        }
        else{
            System.out.println("Wrong!");
        }
        if(points==5){
            System.out.println("Congratulations! you passed all levels.");
        }
        return points;
    }




}

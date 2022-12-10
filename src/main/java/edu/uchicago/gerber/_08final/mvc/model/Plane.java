package edu.uchicago.gerber._08final.mvc.model;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.awt.*;
import java.awt.image.BufferedImage;

import edu.uchicago.gerber._08final.mvc.controller.Game;
import edu.uchicago.gerber._08final.mvc.view.MyGamePanel;

public class Plane extends FlyObject{
    private int life;
    private int type;
    private int bullet_fire;
    
    public Plane(){
        img = MyGamePanel.myplane;
        w = img.getWidth();
        h = img.getHeight();
        life = 3;
        bullet_fire = 0;
        x=200;
        y=300;

    }

    @Override
    public boolean checkBounds() {
        return false;  
    }

    public void addFire(){
        bullet_fire = 20;
    }

    public void setFire(int fire){
        this.bullet_fire = fire;

    }

    protected int somePosNegValue(int seed) {
        int randomNumber = Game.R.nextInt(seed);
        if (randomNumber % 2 == 0)
            randomNumber = -randomNumber;
        return randomNumber;
    }


    public void reduceLife(){   
        life-=1;
    }

    public int getLife(){
        return life;
    }

    //
    public void move(int x,int y){   
        this.x = x - w/2;
        this.y = y - h/2;
    }


   
    public MyBullet[] shoot(){   
        MyBullet[] bullets = new MyBullet[1];
        bullets[0] = new MyBullet(x+w/2,y-15);  
        return bullets;
        
    }

    @Override
    public void step() {
    }

   
    public boolean Collision(FlyObject other){

        int x1 = other.x - this.w/2;                 
        int x2 = other.x + this.w/2 + other.w;   
        int y1 = other.y - this.h/2;                
        int y2 = other.y + this.h/2 + other.h; 

        return this.x + this.w/2>x1 && this.x + this.w/2<x2 && 
        this.y + this.h/2>y1 && this.y + this.h/2<y2;   
    }

}

   
   


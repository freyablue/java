package edu.uchicago.gerber._08final.mvc.model;

import edu.uchicago.gerber._08final.mvc.controller.Game;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.awt.Color;
import lombok.Data;
import lombok.experimental.Tolerate;
import java.awt.image.BufferedImage;

public abstract class FlyObject {
    int x,y,w,h;   
    int s; //speed
    BufferedImage img;  
     //orientation from 0-359
    private int orientation;
     //the color of this sprite
    private Color color;

    //keeps the sprite inside the bounds of the frame.
    public abstract boolean checkBounds();

    public abstract void step();
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }


    public int getHeight() {
        return h;
    }

    public BufferedImage getImage() {
        return img;
    }

    
    public void paint(Graphics g) {
    }

    public boolean shootHit(MyBullet bullet){
        int bx = bullet.x;  
        int by = bullet.y;  
        return this.x<bx && bx<this.x+w && this.y<by && by<this.y+h;
    }

}
    


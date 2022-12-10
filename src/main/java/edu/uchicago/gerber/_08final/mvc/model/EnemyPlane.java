package edu.uchicago.gerber._08final.mvc.model;

import org.w3c.dom.html.HTMLBaseElement;
import java.util.*;
import edu.uchicago.gerber._08final.mvc.view.MyGamePanel;

public class EnemyPlane extends FlyObject{
    private Random rand;
  
    public EnemyPlane(){
        s=3; //speed
        img = MyGamePanel.splane;
        w = img.getWidth();
        h = img.getHeight();
        y = -h;   //appears on the top of the screen       
        rand = new Random();
        x = rand.nextInt(MyGamePanel.WIDTH - w);
    }

    public int getScore() {  
        return 5;
    }

    @Override
    public boolean checkBounds() {   
        return y>MyGamePanel.HEIGHT||x>MyGamePanel.WIDTH;
    }

    //move
    @Override
    public void step() {   
        y += s;
    }
    
}

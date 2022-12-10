package edu.uchicago.gerber._08final.mvc.model;
import java.awt.image.BufferedImage;

import org.w3c.dom.html.HTMLBRElement;

import edu.uchicago.gerber._08final.mvc.view.GamePanel;
import edu.uchicago.gerber._08final.mvc.view.MyGamePanel;
public class MyBullet extends FlyObject {
    
    public MyBullet(int x,int y){
        img = MyGamePanel.bullet;
        this.s = 4; //speed
        this.x = x;
        this.y = y;

    }

    @Override
    public void step(){   
        y-=s;
    }

    @Override
    public boolean checkBounds() {
        return y<-h;
    }


   

   
    
}

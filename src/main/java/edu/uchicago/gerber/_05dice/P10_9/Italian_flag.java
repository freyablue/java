package edu.uchicago.gerber._05dice.P10_9;
import java.awt.*;
import javax.swing.*;

public class Italian_flag extends JComponent{
    public void paint(Graphics g){
        paintComponentHungarian(g,10,125,150);
        paintComponentGerman(g,400,125,150);

    }
    public void paintComponentHungarian(Graphics g, int xLeft, int yTop, int width){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.green);
        g2d.fillRect(xLeft,yTop,width,width*2/9);
        g2d.setColor(Color.white);
        g2d.fillRect(xLeft,yTop-width*2/9,width,width*2/9);
        g2d.setColor(Color.red);
        g2d.fillRect(xLeft,yTop-width*4/9,width,width*2/9);
        g.setColor(Color.BLACK);
        g2d.drawLine(xLeft, yTop, xLeft, yTop-width*2/9);
        g2d.drawLine(xLeft+width, yTop, xLeft+width, yTop-width*2/9);
    }

    public void paintComponentGerman(Graphics g, int xLeft, int yTop, int width){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.yellow);
        g2d.fillRect(xLeft,yTop,width,width*2/9);
        g2d.setColor(Color.red);
        g2d.fillRect(xLeft,yTop-width*2/9,width,width*2/9);
        g2d.setColor(Color.black);
        g2d.fillRect(xLeft,yTop-width*4/9,width,width*2/9);
//        g2d.fillRect(xLeft,yTop,width,width*2/9);
        //g2d.drawLine(xLeft + width / 3, yTop, xLeft + width * 2 / 3, yTop);
    }

}

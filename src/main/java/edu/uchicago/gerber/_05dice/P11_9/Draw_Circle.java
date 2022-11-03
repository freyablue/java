package edu.uchicago.gerber._05dice.P11_9;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Draw_Circle extends  MouseAdapter {

    private Point p1, p2;
    private Graphics g;

    public Draw_Circle() {

    }

    public void initial(Graphics g) {

        this.g = g;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if ((e.getClickCount() == 1) && e.getButton() == MouseEvent.BUTTON1) {
            p1 = e.getPoint();
            p2 = null;
        } else if ((e.getClickCount() == 2) && (e.getButton() == MouseEvent.BUTTON1)) {
            p2 = e.getPoint();
        }
//        System.out.println(p1);
//        g.setColor(Color.green);
//
//        g.drawRect(0,0,200,100);
        if (p1 != null && p2 != null) {

            int r = (int) Math.round(p1.distance(p2));
            g.setColor(Color.BLACK);
            g.fillOval(p1.x - r, p1.y - r, 2 * r, 2 * r);
        }
    }
}




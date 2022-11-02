package edu.uchicago.gerber._05dice.P10_10;
import java.awt.*;
import javax.swing.*;

public class Olympic_rings extends JComponent{
    public void paint(Graphics g){
        paintRings(g);

    }

    void paintRings(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.blue);
        g2.drawOval(0,0,200,200);
        g2.setColor(Color.yellow);

        g2.drawOval(120,100,200,200);
        g2.setColor(Color.black);

        g2.drawOval(240,0,200,200);
        g2.setColor(Color.green);
        g2.drawOval(360,100,200,200);
        g2.setColor(Color.red);
        g2.drawOval(480,0,200,200);

    }
}

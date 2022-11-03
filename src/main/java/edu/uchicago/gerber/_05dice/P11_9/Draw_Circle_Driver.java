package edu.uchicago.gerber._05dice.P11_9;


import javax.swing.*;
import java.awt.*;



public class Draw_Circle_Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        Draw_Circle listener = new Draw_Circle();
        frame.addMouseListener(listener);
        frame.setVisible(true);
        Graphics g =  frame.getGraphics();
        listener.initial(g);
        frame.setVisible(true);



    }


}

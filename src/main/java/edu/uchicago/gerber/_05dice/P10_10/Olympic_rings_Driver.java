package edu.uchicago.gerber._05dice.P10_10;



import javax.swing.*;

public class Olympic_rings_Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new Olympic_rings();
        frame.add(component);
        frame.setVisible(true);

    }
}

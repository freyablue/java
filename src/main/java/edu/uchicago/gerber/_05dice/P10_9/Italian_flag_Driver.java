package edu.uchicago.gerber._05dice.P10_9;
import java.awt.*;
import javax.swing.*;

public class Italian_flag_Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent component = new Italian_flag();
        frame.add(component);
        frame.setVisible(true);

    }
}

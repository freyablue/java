package edu.uchicago.gerber._03objects.P8_16;
import java.util.*;
public class Mailbox_Driver {
    public static void main(String[] args) {
        Message e = new Message("Harry Morgan","Rudolf Reindeer");
        e.append("Have a nice day.");
        e.append("Good luck!");
        Mailbox m = new Mailbox();
        m.addMessage(e);
        Message e2 = new Message("Yijia Chen","Isha Dai");
        e2.append("Encapsulation is one of the fundamentals of OOP.");
        m.addMessage(e2);
        Message e3 = new Message("Ben","Josh");
        e3.append("The most important principle of object orientation is encapsulation.");
        System.out.println(m.getMessage(1).toString());
        m.removeMessage(1);
        System.out.println(m.getMessage(0).toString());



    }
}

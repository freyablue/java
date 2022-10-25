package edu.uchicago.gerber._04interfaces.P9_1;

import java.time.*;
public class Clock_Driver {
    public static void main(String[] args) {
//        System.out.println(java.time.LocalTime.now().toString());
//        System.out.println(java.time.LocalTime.now().toString().substring(3,5));
        Clock c = new Clock();
        System.out.println("the current Chicago time is: "+c.getTime());
        WorldClock w = new WorldClock(16);
        System.out.println("the current Canberra time is "+w.getTime());

    }
}

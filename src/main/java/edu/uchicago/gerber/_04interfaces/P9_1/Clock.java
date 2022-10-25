package edu.uchicago.gerber._04interfaces.P9_1;
import java.time.*;
public class Clock {
    String s;
    public Clock(){
        this.s = LocalTime.now().toString();
    }
    public String getTime(){
        return getHours()+":"+getMinutes();

    }
    public String getHours(){
        return s.substring(0,2);

    }
    public String getMinutes(){
        return s.substring(3,5);
    }
}

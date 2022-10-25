package edu.uchicago.gerber._04interfaces.P9_1;
import java.time.*;
public class WorldClock extends Clock {
    private int offset;
    public WorldClock(int offset){
        this.offset = offset;
    }
    @Override
    public String getHours(){
        int h = Integer.parseInt(super.getHours())+this.offset;
        while(h>23){
            h-=23;
        }
        while(h<0){
            h+=23;
        }
        return ""+h;
    }

}

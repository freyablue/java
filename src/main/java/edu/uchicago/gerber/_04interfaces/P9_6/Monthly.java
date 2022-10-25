package edu.uchicago.gerber._04interfaces.P9_6;

public class Monthly extends Appointment{
    String d;
    private int year;
    private int month;
    private int day;
    public Monthly(String d,int year, int month,int day){
        super(d,year,month,day);
    }

    @Override
    public boolean occursOn(int year, int month, int day){
        if(year<getYear() ||(month<getMonth() && year==getYear())){
            return false;
        }
        if(getDay()==day){
            return true;
        }
        return false;

    }
}

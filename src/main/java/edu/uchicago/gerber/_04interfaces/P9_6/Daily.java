package edu.uchicago.gerber._04interfaces.P9_6;

public class Daily extends Appointment {
    private String d;
    private int year;
    private int month;
    private int day;
    public Daily(String d,int year, int month,int day){
        super(d,year,month,day);
    }
    @Override
    public boolean occursOn(int year, int month, int day){
        if(year>getYear()){
            return true;
        }
        if(year==getYear()){
            if(month>getMonth()){
                return true;
            }
            if(month==getMonth() && day>=getDay()){
                return true;
            }
        }
        return false;
    }
}

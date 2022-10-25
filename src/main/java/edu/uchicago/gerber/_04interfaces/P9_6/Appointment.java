package edu.uchicago.gerber._04interfaces.P9_6;

public abstract class Appointment {
    private String d;
    private int year;
    private int month;
    private int day;
    public Appointment(String d,int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.d = d;
    }
    public int getYear(){
        return this.year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth(){
        return month;
    }

    public  boolean occursOn(int year, int month, int day){
        Boolean b = (this.year==year) &&(this.month == month)&&(this.day ==day);
        return b;
    }
    public String toString(){
        return d;
    }
}

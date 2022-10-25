package edu.uchicago.gerber._04interfaces.E9_11;

public class Instructor extends Person {
    private double sal;
    public Instructor(String n, int year,double sal){
        super(n,year);
        this.sal = sal;
    }
    public String toString(){
        return "Instructor:"+super.toString()+", salary is "+this.sal;
    }
}

package edu.uchicago.gerber._04interfaces.E9_11;

public class Student extends Person {
    private String major;
    public Student(String name, int birth_year, String major){
        super(name,birth_year);
        this.major = major;
    }
    public String toString(){
        return "Student: "+super.toString() +" , major is "+this.major;
    }
}

package edu.uchicago.gerber._04interfaces.E9_11;

public class Person {
    private String name;
    private int birth_year;
    public Person(String name, int birth_year){
        this.name = name;
        this.birth_year = birth_year;
    }
    public String tosString(){
        return "Person: name is "+this.name+ " , birth year is "+this.birth_year;
    }
}

package edu.uchicago.gerber._04interfaces.E9_11;

public class Person_Driver {
    public static void main(String[] args) {
        Person p = new Person("Bob",1999);
        Student s = new Student("Isha",2000,"Finance");
        Instructor i = new Instructor("Josh",1977,98000);
        System.out.println(p.tosString());
        System.out.println(s);
        System.out.println(i);
    }
}

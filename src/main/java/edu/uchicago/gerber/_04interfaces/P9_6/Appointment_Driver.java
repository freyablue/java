package edu.uchicago.gerber._04interfaces.P9_6;
import java.util.*;
public class Appointment_Driver {
    public static void main(String[] args) {
        Appointment[] a = new Appointment[4];
        Scanner s = new Scanner(System.in);
        a[0]  = new Daily("birthday",1999,8,30);
        a[1] = new Monthly("see the dentist", 2019,12,31);
        a[2] = new Onetime("midterm",2021,12,25);
        a[3] = new Monthly("email check",2019,12,25);
        System.out.println("Enter a date in the format of year, month and day:");
        int year = s.nextInt();
        int month = s.nextInt();
        int day = s.nextInt();
        for(Appointment ap:a){
            if(ap.occursOn(year,month,day)){
                System.out.println(ap);
            }
        }




    }
}

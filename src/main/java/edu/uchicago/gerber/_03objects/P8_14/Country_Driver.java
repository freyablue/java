package edu.uchicago.gerber._03objects.P8_14;
import java.util.*;
public class Country_Driver {
    public static void main(String[] args) {
        ArrayList<Country> l = new ArrayList<>();
        Country c = new Country("Afghanistan",29835392,250000);
        l.add(c);
        l.add(new Country("Australia",21766711.0,2967893.1));
        l.add(new Country("Brazil",203429773,3286470));
        l.add(new Country("Canada",34030589,3855081));
        l.add(new Country("Chile",16888760,292258));
        double l_area = 0;
        double l_popu = 0;
        double l_den = 0;
        String area_name ="";
        String popu_name="";
        String den_name="";
        for(Country country:l){
            if(country.getArea()>l_area){
                l_area = country.getArea();
                area_name = country.getCountry_name();
            }
            if(country.getPopulation()>l_popu){
                l_popu = country.getPopulation();
                popu_name = country.getCountry_name();
            }
            if(country.getDensity()>l_den){
                l_den = country.getDensity();
                den_name = country.getCountry_name();
            }
        }
        System.out.println("The country with the largest area is: "+ area_name);
        System.out.println("The country with the largest population is: "+ popu_name);
        System.out.println("The country with the largest density is: "+ den_name);


    }
}

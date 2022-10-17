package edu.uchicago.gerber._03objects.P8_14;

public class Country {
    public String country_name;
    public double population;
    public double area;
    public double density;
    public Country(String country_name, double population,double area){
        this.country_name = country_name;
        this.population = population;
        this.area = area;
        this.density = this.population/this.area;
    }

    public String getCountry_name() {
        return country_name;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }
    public double getDensity(){
        return density;
    }
}

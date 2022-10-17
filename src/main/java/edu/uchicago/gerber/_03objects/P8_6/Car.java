package edu.uchicago.gerber._03objects.P8_6;

public class Car {
    public double efficiency;
    public double fuel_level;
    public double INITIAL = 0.0;
    public Car(double efficiency){
        this.efficiency = efficiency;
        fuel_level = INITIAL;
    }
    public void addGas(double gas_amount){
        fuel_level+=gas_amount;
    }
    public void drive(double d){
        fuel_level -= d/efficiency;

    }
    public double getGasLevel(){
        return fuel_level;
    }
}

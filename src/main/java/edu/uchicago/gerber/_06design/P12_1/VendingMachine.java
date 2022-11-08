package edu.uchicago.gerber._06design.P12_1;
import java.util.*;

public class VendingMachine {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Coin> coins = new ArrayList<>();
    //A user selects a
    //product from a list of available products, adds coins, and either gets the product or
    //gets the coins returned.
    public void add_product(Product p){

        this.products.add(p);
    }
    public void insertMoney(Coin c){
        this.coins.add(c);
    }
    public double calculateTotal(){
        double total = 0;
        for(Coin c:this.coins){

            if(c.t == "penny"){
                total+=0.01;
            }
            if(c.t=="nickel"){
                total+=0.05;
            }
            if(c.t=="dime"){
                total+=0.1;
            }
            if(c.t=="quarter"){
                total+=0.25;
            }
            if(c.t=="dollar"){
                total+=1;

            }

        }
        return total;
    }
    public boolean sufficientAmount(Product p){
        double amount =calculateTotal();
        if(amount>=p.price){
            return true;
        }
        return false;
    }

    public boolean deductGiven(String type){
        for(Coin c:this.coins){
            if(c.t.equals(type)){
                this.coins.remove(c);
                return true;
            }
        }
        return false;
    }

    public void get_rest(double amount){
        while(amount>=1 && deductGiven("dollar")){
            amount-=1;
        }
        while(amount>=0.25 && deductGiven("quarter")){
            amount-=0.25;
        }
        while(amount>=0.1 && deductGiven("dime")){
            amount-=0.1;
        }
        while(amount>=0.05 && deductGiven("nickel")){
            amount-=0.05;
        }
        while(amount>=0.01 && deductGiven("penny")){
            amount-=0.10;
        }
    }

    public void removeAll(){
        this.coins.clear();
    }



}

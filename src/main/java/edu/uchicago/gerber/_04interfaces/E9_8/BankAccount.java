package edu.uchicago.gerber._04interfaces.E9_8;

public class BankAccount {
    private double bal;
    public BankAccount(){
        this.bal = 0;
    }
    public BankAccount(double given){
        this.bal = given;
    }
    public void deposit(double amount){
        this.bal+=amount;
    }
    public void withdraw(double amount){
        this.bal-=amount;

    }
    public void monthEnd(){

    }
    public double getBalance(){
        return this.bal;
    }
}

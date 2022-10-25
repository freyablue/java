package edu.uchicago.gerber._04interfaces.E9_8;

public class BasicAccount extends BankAccount {
    private double bal;
    public BasicAccount(){
        this.bal = 0;
    }
    public BasicAccount(double given){
        super(given);
    }
    public void deposit(double amount){
        super.deposit(amount);
    }
    public void withdraw(double amount){
        if(amount<=this.bal){
            this.bal-=amount;
        }
    }
    public void monthEnd(){
        super.monthEnd();
    }
    public double getBalance(){
        return super.getBalance();
    }
}

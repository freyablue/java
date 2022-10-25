package edu.uchicago.gerber._04interfaces.E9_8;

public class BasicAccount_Driver {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(200.5);
        BasicAccount a = new BasicAccount(100.0);
        b.withdraw(230.0);
        System.out.println("BankAccount's balance after withdrawing: "+ b.getBalance());
        a.withdraw(120.0);
        System.out.println("BasicAccount's balance after withdrawing: "+ a.getBalance());


    }
}

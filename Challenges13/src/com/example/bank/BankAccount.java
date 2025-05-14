package com.example.bank;

public class BankAccount {
    //Define a BankAccount class with private attributes like
    //accountNumber, accountHolderName, and balance. Provide
    //public methods to deposit and withdraw money, ensuring that
    //these methods don't allow illegal operations like withdrawing
    //more money than the current balance.

    private final long accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getWithdraw(double withdraw){
        if(balance>=withdraw){
            balance -= withdraw;
            return withdraw;
        }
        return 0;
    }

    public double getBalance (){
        return balance;
    }
}
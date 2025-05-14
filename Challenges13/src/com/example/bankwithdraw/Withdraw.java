package com.example.bankwithdraw;

import com.example.bank.BankAccount;

import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number : ");
        long accountNumber = sc.nextLong();
        System.out.print("Enter the account holder name : ");
        String name = sc.next();
        BankAccount bankAccount = new BankAccount(accountNumber,name);
        System.out.print("Deposit the money: ");
        bankAccount.setBalance(sc.nextDouble());
        System.out.print("Withdraw the money: ");
        double money = bankAccount.getWithdraw(sc.nextDouble());
        if(money!=0){
            System.out.printf("Transition : %f and Bank Balance : %f",money,bankAccount.getBalance());
        }
        else{
            System.out.println("Transition Failed! Not sufficient balance");
        }
    }
}

package com.example.interfaceprograms;

public class BankAccount {
    private double balance; //obj.getNalance()
    private int accountNumber; //obj.getAccountNumber()
    private static int lastAssignedNumber=1000; //BanckAccout.LastAssigneNumber

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssignedNumber++;
        accountNumber=lastAssignedNumber;

    }

    public double getBalance() {
        return balance;
    }
}

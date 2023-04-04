package org.example;

public class BankAccount {
    // static változó, amely nyilvántartja a létrehozott számlák számát
    private static int numberOfAccounts = 0;
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        numberOfAccounts++; // minden új számla létrehozásakor növeljük a számlák számát
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    // static metódus, amely visszaadja a létrehozott számlák számát
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        numberOfAccounts--; // csökkentjük a számlák számát, mikor törlésre kerül egy példány.
    }
}

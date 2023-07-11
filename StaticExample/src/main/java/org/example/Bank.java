package org.example;

/*
DEMO:
Az account1 és az account2 már példányosítára került, így ha lefuttatjuk ezt a main-t
akkor a Számlák száma: 2 output-ot kapjuk. Hozz létre további BankAccount példányokat,
és futtasd le újra a main-t. A számlák száma növekedni fog.

 */

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        // a getNumberOfAccounts() metódus meghívása az osztályon keresztül (nem példány!)
        System.out.println("Számlák száma: " + BankAccount.getNumberOfAccounts());

        try {
            account1.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        System.out.println("Számlák száma: " + BankAccount.getNumberOfAccounts());
    }
}
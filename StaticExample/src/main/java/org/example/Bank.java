package org.example;

/*
Ebben a példában van egy BankAccount osztályunk,
amelynek van egy numberOfAccounts nevű static változója.
Ez a változó azt jelzi, hogy hány BankAccount objektumot
hoztunk létre. Van egy getNumberOfAccounts() nevű static
metódusunk is, amely visszaadja a létrehozott számlák számát.
Tehát képesek vagyunk elérni, hogy minden példányosításnál növeljük
a static változót (numberOfAccounts), mely
a BankAccount osztályhoz tartozik.

A Bank osztályban létrehozunk két BankAccount objektumot,
majd meghívjuk a getNumberOfAccounts() metódust az osztályon keresztül (nem az objektumon),
hogy megkapjuk a létrehozott számlák számát. A konzolban kiírjuk ezt az értéket.

DEMO:
Az account1 és az account2 már példányosítára került, így ha lefuttatjuk ezt a main-t
akkor a Számlák száma: 2 output-ot kapjuk.

Hozz létre további számlákat és futtasd újra a main-t, a számlák számával lesz egyenlő
a BankAccount.getNumberOfAccounts() visszatérési értéke.

MIÉRT JÓ, HOGY STATIC METÓDUST ÉS STATIC VÁLTOZÓT HASZNÁLUNK?

A BankAccount osztályban a numberOfAccounts nevű
static változó és a getNumberOfAccounts() nevű static
metódus hasznosak azért, mert lehetővé teszik számunkra,
hogy nyomon kövessük a létrehozott számlák számát.
A numberOfAccounts változó static, ami azt jelenti,
hogy csak egy példány létezik belőle az osztály szintjén.
Ez azt jelenti, hogy minden BankAccount objektum ugyanazt
az értéket látja és módosíthatja. Így amikor létrehozunk egy
új BankAccount objektumot, növelhetjük a numberOfAccounts változó értékét.
A getNumberOfAccounts() metódus is static, ami azt jelenti, hogy meghívható
az osztályon keresztül (nem az objektumon, példányon). Ez lehetővé teszi számunkra,
hogy lekérdezzük a létrehozott számlák számát
anélkül, hogy létrehoznánk egy BankAccount objektumot.
Összefoglalva tehát a static változó és metódus
hasznosak ebben az esetben azért, mert lehetővé
teszik számunkra, hogy nyomon kövessük és lekérdezzük a
létrehozott számlák számát.


 */

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        // a getNumberOfAccounts() metódus meghívása az osztályon keresztül (nem példány!)
        System.out.println("Számlák száma: " + BankAccount.getNumberOfAccounts());
    }
}
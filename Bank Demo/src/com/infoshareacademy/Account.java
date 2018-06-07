package com.infoshareacademy;

public class Account {

    private String number;
    private String owner;
    private int balance;

    public Account() {
        this.balance = 1000000;
        System.out.println("Balance = " + this.balance);
    }                                                                        // konstruktor ustawiający początkowe saldo konta.

    public void show() {
        System.out.println("Current account balance = " + this.balance);
    }                                                                       // metoda show wyipisująca saldo.

    // Wygenerowane gettery i settery:

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();              // Tworzenie obiektu na podstawie klasy.
        System.out.println(myAccount);                  // Wypisze adres obiektu na stercie
        myAccount.show();                               // Wywoływanie metody show w funkcji main() z klasy Account.
        myAccount.setBalance(50);                       // zmianianie salda konta za pomocą settera
        myAccount.show();                               // ponowne wypisanie salda konta
    }
}

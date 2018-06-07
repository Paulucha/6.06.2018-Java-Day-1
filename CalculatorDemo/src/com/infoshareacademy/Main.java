package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int s = myCalculator.sum(2, 5);

        System.out.println("Suma dwóch cyfr = " + s);
        myCalculator.subtract(5, 4);


    }
}

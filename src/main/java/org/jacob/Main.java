package org.jacob;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int principal = (int) InputHandler.prompt("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) InputHandler.prompt("Annual Interest Rate: ", 1, 30);
        byte years = (byte) InputHandler.prompt("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
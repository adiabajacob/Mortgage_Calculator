package org.jacob;

public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterestRate = calculateMonthlyInterestRate();
        float totalPayments = calculateTotalPayments();
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);
    }

    private float calculateMonthlyInterestRate() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private float calculateTotalPayments() {
        return years * MONTHS_IN_YEAR;
    }
}

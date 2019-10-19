package com.company;

public class SavingsAccount {
    //private class variable
    private static double annualInterestRate;

    //private instance variable
    private double savingsBalance;

    public void setSavingsBalance(double beginningBalance){
        savingsBalance = beginningBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    //public instance method
    public double calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        return monthlyInterest;
    }

    //public static method
    public static void modifyInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }
}

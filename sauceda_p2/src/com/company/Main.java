package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);

        System.out.print("Month\t\t Saver 1\t\t\t\t Saver 2\n");
        for (int i = 0; i < 12; ++i) {
            saver1.setSavingsBalance(saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
            System.out.print((i+1) +"\t\t\t" + saver1.getSavingsBalance() + "\t\t");
            saver2.setSavingsBalance(saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());
            System.out.println(saver2.getSavingsBalance());
        }
        System.out.println("Interest rate is set to 5%.");
        saver1.modifyInterestRate(.05);
        saver2.modifyInterestRate(.05);
        saver1.setSavingsBalance(saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
        System.out.print("13\t\t\t" + saver1.getSavingsBalance() + "\t\t");
        saver2.setSavingsBalance(saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());
        System.out.println(saver2.getSavingsBalance());
    }
}

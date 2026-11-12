package com.java.basics;

class BankAccount1 {

    int accountNumber = 101;
    String accountHolder = "Hema";
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
class SavingsAccount extends BankAccount1 {
    double balance = 25000;
    void displaySavings() {
        System.out.println("Savings Balance: " + balance);
    }
}
class PremiumSavingsAccount extends SavingsAccount {
    double interestRate = 7.5;
    void displayPremium() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class Bank {
    public static void main(String[] args) {
        PremiumSavingsAccount p = new PremiumSavingsAccount();
        p.displayAccount();
        p.displaySavings();
        p.displayPremium();
    }
}
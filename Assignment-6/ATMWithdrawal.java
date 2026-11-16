package com.java.basics;
public class ATMWithdrawal {
    public static void main(String[] args) {
        int pin = 1234;
        int enteredPin = 1234;
        double balance = 5000;
        double withdraw = 2000;
        if (enteredPin == pin) {
            if (withdraw <= balance) {
                System.out.println("Withdrawal Successful");
                balance = balance - withdraw;
                System.out.println("Remaining Balance: " + balance);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Incorrect PIN");
        }
    }
}
package com.java.basics;
public class BankAccount {
int accountNumber;
String holderName;
double balance;

BankAccount() {
    accountNumber = 1001;
    holderName = "Priya";
    balance = 5000.0;
}
void displayAccount() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Holder Name: " + holderName);
    System.out.println("Balance: " + balance);
    System.out.println();
}
public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    BankAccount b2 = new BankAccount();

    b1.displayAccount();
    b2.displayAccount();
}
}

package com.java.basics;
class BankAccount3 {
    private String name;
    private double balance;
    BankAccount3(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }
}
public class BankingEncapsulation {
    public static void main(String[] args) {
        BankAccount3 b = new BankAccount3("Hema", 5000);
        System.out.println("Account Holder: " + b.getName());
        System.out.println("Initial Balance: " + b.getBalance());

        b.withdraw(2000);

        System.out.println("Final Balance: " + b.getBalance());
    }
}

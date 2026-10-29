package com.java.basics;

abstract class PaymentBase1 {
    abstract void processPayment();
}

class UPIOption1 extends PaymentBase1 {
    @Override
    void processPayment() {
        System.out.println("Payment processed using UPI");
    }
}

class CreditCardOption1 extends PaymentBase1 {
    @Override
    void processPayment() {
        System.out.println("Payment processed using Credit Card");
    }
}

public class Payment1 {
    public static void main(String[] args) {

        PaymentBase1 p;

        p = new UPIOption1();
        p.processPayment();

        p = new CreditCardOption1();
        p.processPayment();
    }
}


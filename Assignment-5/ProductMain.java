package com.java.basics;

class Product1 {
    int productId = 101;
    double price = 1500;
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product1 {
    void displayCategory() {
        System.out.println("Category: Electronics");
    }
}

class Clothing extends Product1 {
    void displayCategory() {
        System.out.println("Category: Clothing");
    }
}

class Books extends Product1 {
    void displayCategory() {
        System.out.println("Category: Books");
    }
}
public class ProductMain {
    public static void main(String[] args) {
        Electronics e = new Electronics();

        System.out.println("Electronics Details:");
        e.displayProduct();
        e.displayCategory();

        System.out.println();
        Clothing c = new Clothing();

        System.out.println("Clothing Details:");
        c.displayProduct();
        c.displayCategory();

        System.out.println();
        Books b = new Books();

        System.out.println("Books Details:");
        b.displayProduct();
        b.displayCategory();
    }
}
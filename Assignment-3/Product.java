package com.java.basics;
public class Product {
int productId;
String productName;
double price;

// No-argument constructor
	Product() {
    productId = 101;
    productName = "Laptop";
    price = 0.0;
}
// Constructor with two parameters
	Product(int id, String name) {
    productId = id;
    productName = name;
    price = 0.0;
}
// Constructor with three parameters
	Product(int id, String name, double p) {
    productId = id;
    productName = name;
    price = p;
}

void displayDetails() {
    System.out.println("Product ID: " + productId);
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
    System.out.println();
}

public static void main(String[] args) {
    Product p1 = new Product();
    Product p2 = new Product(102, "Mobile");
    Product p3 = new Product(103, "Headphones", 1500.0);
    p1.displayDetails();
    p2.displayDetails();
    p3.displayDetails();
}
}

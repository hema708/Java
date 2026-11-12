package com.java.basics;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}
class Car extends Vehicle {

    void displayType() {
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    void displayType() {
        System.out.println("This is a Bike");
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Car c = new Car();

        c.displayType();
        c.start();
        c.stop();
        System.out.println();
        Bike b = new Bike();
        b.displayType();
        b.start();
        b.stop();
    }
}
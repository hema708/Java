package com.java.basics;
class Employee3 {
    String name;
    int id;
    Employee3(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void responsibility() {
        System.out.println("Employee performs assigned tasks");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer3 extends Employee3 {

    Developer3(String name, int id) {
        super(name, id);
    }

    @Override
    void responsibility() {
        System.out.println("Developer writes and tests code");
    }
}

class Manager3 extends Employee3 {

    Manager3(String name, int id) {
        super(name, id);
    }

    @Override
    void responsibility() {
        System.out.println("Manager manages the team");
    }
}
public class Employee2 {
    public static void main(String[] args) {

        Developer3 d = new Developer3("Hema", 101);
        Manager3 m = new Manager3("Rose", 102);

        d.display();
        d.responsibility();

        System.out.println();

        m.display();
        m.responsibility();
    }
}

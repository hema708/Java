package com.java.basics;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int rollNumber;
    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Hema", 20, 101);
        s.display();
    }
}
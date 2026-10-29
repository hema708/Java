package com.java.basics;

class StudentDetails {
    String name;
    int age;
    StudentDetails(String name) {
        this.name = name;
    }
    StudentDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Student1{
    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails("Hema");
        StudentDetails s2 = new StudentDetails("Rose", 21);

        s1.display();
        s2.display();
    }
}

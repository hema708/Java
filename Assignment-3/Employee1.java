package com.java.basics;

public class Employee1 {


int employeeId;
String employeeName;
double salary;

Employee1(int id, String name, double sal) {
    employeeId = id;
    employeeName = name;
    salary = sal;
}

double calculateAnnualSalary() {
    return salary * 12;
}

public static void main(String[] args) {

    Employee1 e1 = new Employee1(101, "Arun", 25000);
    Employee1 e2 = new Employee1(102, "Divya", 35000);
    Employee1 e3 = new Employee1(183, "Kumar", 40000);

    System.out.println("Employee 1: " + e1.employeeId + ", \"" + e1.employeeName + "\", " + (int)e1.salary);
    System.out.println("Employee 2: " + e2.employeeId + ", \"" + e2.employeeName + "\", " + (int)e2.salary);
    System.out.println("Employee 3: " + e3.employeeId + ", \"" + e3.employeeName + "\", " + (int)e3.salary);
}

}


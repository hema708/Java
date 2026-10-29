package com.java.basics;
class Calculator2 {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
class EmployeeBonus {
    void calculateBonus() {
        System.out.println("Employee bonus");
    }
}
class DeveloperBonus extends EmployeeBonus {
    @Override
    void calculateBonus() {
        System.out.println("Developer bonus: 5000");
    }
}
class ManagerBonus extends EmployeeBonus {
    @Override
    void calculateBonus() {
        System.out.println("Manager bonus: 10000");
    }
}
public class Calculator {
    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        System.out.println("Integer Addition: " + c.add(10, 20));
        System.out.println("Decimal Addition: " + c.add(5.5, 20.5));

        EmployeeBonus e;

        e = new DeveloperBonus();
        e.calculateBonus();

        e = new ManagerBonus();
        e.calculateBonus();
    }
}


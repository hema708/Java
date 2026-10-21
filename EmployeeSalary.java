package com.java.basics1;
public class EmployeeSalary {
	void calculateSalary(double basic,double allowance) {
		double grossSalary=basic+allowance;
		System.out.println("Gross Salary:"+grossSalary);
		
		calculateNetSalary(grossSalary, 2000);
	}
	void calculateNetSalary(double grossSalary,double dedections) {
		double netSalary=grossSalary-dedections;
		System.out.println("netSalary:"+netSalary);
	}
	void displayDetails() {
		System.out.println("Employee Name:hema");
	}
	public static void main(String[] args) {
		EmployeeSalary emp=new EmployeeSalary();
		emp.calculateSalary(25000,5000);
//		emp.calculateNetSalary(emp.grossSalary,2000);
		emp.displayDetails();

	}
}

package com.java.basics;

public class EmployeeCounter {
	
	static int count=0;
	static void registerEmployee() {
	count++;
	}
	public static void main(String[] args) {
	EmployeeCounter.registerEmployee();
	EmployeeCounter.registerEmployee();
	EmployeeCounter.registerEmployee();

	System.out.println("Total Employees:"+count);
	}
	}



package com.java.basics;

public class StudentRegistration {
	String name;
	int rollnumber;

	void studentDetails(String name,int number) {
		name=name;
		rollnumber=number;
	
		System.out.println("studentName:"+name);
		System.out.println("rollnumber:"+rollnumber);
		System.out.println();	
	}
	public static void main(String[] args) {
		StudentRegistration s1=new StudentRegistration();
		StudentRegistration s2=new StudentRegistration();
		StudentRegistration s3=new StudentRegistration();
		s1.studentDetails("Hema",101);
		s1.studentDetails("Rose",101);
		s1.studentDetails("Angel",101);
		
	}
}

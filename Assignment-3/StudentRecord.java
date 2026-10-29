package com.java.basics;
public class StudentRecord {
	int rollNumber;
	String studentName;
	double marks;

// Parameterized constructor
StudentRecord(int rollNumber, String studentName, double marks) {
    this.rollNumber = rollNumber;
    this.studentName = studentName;
    this.marks = marks;
}
// Copy constructor
StudentRecord(StudentRecord s) {
    rollNumber = s.rollNumber;
    studentName = s.studentName;
    marks = s.marks;
}
void displayDetails() {
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Student Name: " + studentName);
    System.out.println("Marks: " + marks);
    System.out.println();
}
public static void main(String[] args) {
    StudentRecord s1 = new StudentRecord(101, "Hema", 85);
    StudentRecord s2 = new StudentRecord(s1);
    // Change copied student's marks
    s2.marks = 95;
    System.out.println("Original Student Details:");
    s1.displayDetails();
    System.out.println("Copied Student Details:");
    s2.displayDetails();
}
}

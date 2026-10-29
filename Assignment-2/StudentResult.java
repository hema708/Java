package com.java.basics1;

public class StudentResult {
	int calculateTotal(int m1,int m2,int m3,int m4,int m5) {
		return m1+m2+m3+m4+m5;
	}
	double calculateAverage(int total) {
		return total/5;	
	}
	public static String calculateGrade(double average) {
		return average>=90?"A":
			average>=80?"B":
			average>=50?"C":
			"Fail";
	}
	public static void main(String[] args) {
		StudentResult student=new StudentResult();
        int total=student.calculateTotal(85, 78, 92, 88, 77);
        double average=student.calculateAverage(total);
        String grade=student.calculateGrade(average);
        
        System.out.println("Total:"+total);
        System.out.println("Average:" + average);
        System.out.println("Grade: " + grade);
	}

}

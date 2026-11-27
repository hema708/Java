package com.jdbc.StatementAssignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class InsertRecord {
	public static void main(String args[]) {
	String url="jdbc:mysql://localhost:3306/library";
	 String username="root";
	 String password="Hema@2006";
	 
	 try {
		 Connection con=DriverManager.getConnection(url,username,password);
		 Statement st=con.createStatement();
		 
		 st.executeUpdate("INSERT INTO book2 VALUES (1,'Atomic Habits',350,'Atomic Habits')");
		 System.out.println("all records inserted successfully");
		 
		 con.close();
	 }
	 catch(SQLException e) {
		 e.printStackTrace();
	 }
}
}
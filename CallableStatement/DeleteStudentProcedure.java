
package com.jdbc.CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudentProcedure {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            CallableStatement cs = con.prepareCall(
                "{CALL deleteStudent(?)}"
            );

            cs.setInt(1, id);

            int result = cs.executeUpdate();

            if (result > 0) {
                System.out.println("Student Record Deleted Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

            cs.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
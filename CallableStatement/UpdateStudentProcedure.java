package com.jdbc.CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudentProcedure {

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

            System.out.print("Enter New Mark: ");
            int mark = sc.nextInt();

            CallableStatement cs = con.prepareCall(
                "{CALL updateStudentMark(?, ?)}"
            );

            cs.setInt(1, id);
            cs.setInt(2, mark);

            cs.execute();

            System.out.println("Student Mark Updated Successfully!");

            cs.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
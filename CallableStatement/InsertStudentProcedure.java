
package com.jdbc.CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class InsertStudentProcedure {

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
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Mark: ");
            int mark = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student City: ");
            String city = sc.nextLine();

            CallableStatement cs = con.prepareCall(
                "{CALL insertStudent(?, ?, ?, ?)}"
            );

            cs.setInt(1, id);
            cs.setString(2, name);
            cs.setInt(3, mark);
            cs.setString(4, city);

            cs.execute();

            System.out.println("Student Record Inserted Successfully!");

            cs.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.jdbc.PreparedStatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayStudent {

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

            String query = "SELECT * FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("id"));
                System.out.println("Student Name: " + rs.getString("name"));
                System.out.println("Student Mark: " + rs.getInt("mark"));
                System.out.println("Student City: " + rs.getString("city"));
            } else {
                System.out.println("Student ID Not Found!");
            }

            rs.close();
            ps.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
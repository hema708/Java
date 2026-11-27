
package com.jdbc.PreparedStatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayStudentsByCity {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            System.out.print("Enter Student City: ");
            String city = sc.nextLine();

            String query = "SELECT * FROM student WHERE city = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, city);

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println("Student ID: " + rs.getInt("id"));
                System.out.println("Student Name: " + rs.getString("name"));
                System.out.println("Student Mark: " + rs.getInt("mark"));
                System.out.println("Student City: " + rs.getString("city"));
                System.out.println("----------------------");
            }

            if (!found) {
                System.out.println("No Students Found in This City!");
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
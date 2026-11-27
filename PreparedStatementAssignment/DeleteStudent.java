
package com.jdbc.PreparedStatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {

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

            String query = "DELETE FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student Record Deleted Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
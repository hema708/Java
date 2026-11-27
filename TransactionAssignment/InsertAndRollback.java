
package com.jdbc.TransactionAssignment;

import java.sql.*;
import java.util.Scanner;

public class InsertAndRollback {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        Scanner sc = new Scanner(System.in);

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            con.setAutoCommit(false);

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

            String query = "INSERT INTO student VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, mark);
            ps.setString(4, city);

            ps.executeUpdate();

            System.out.println("Student Record Inserted Temporarily!");

            con.rollback();

            System.out.println("Transaction Rollback Successfully!");
            System.out.println("Inserted Record Cancelled!");

            ps.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();

            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

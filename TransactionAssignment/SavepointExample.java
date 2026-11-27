
package com.jdbc.TransactionAssignment;

import java.sql.*;
import java.util.Scanner;

public class SavepointExample {

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

            String query = "INSERT INTO student VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 1; i <= 3; i++) {

                System.out.println("Enter Student " + i + " Details");

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Mark: ");
                int mark = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter City: ");
                String city = sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, mark);
                ps.setString(4, city);

                ps.executeUpdate();

                if (i == 1) {
                    Savepoint sp = con.setSavepoint("FirstRecord");
                    System.out.println("Savepoint Created Successfully!");
                }
            }

            con.rollback(con.setSavepoint("FirstRecord"));

            con.commit();

            System.out.println("Rollback to Savepoint Successfully!");
            System.out.println("Only First Student Record Saved!");

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
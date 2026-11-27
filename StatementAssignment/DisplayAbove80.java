package com.jdbc.StatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayAbove80 {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM student WHERE mark > 80"
            );

            System.out.println("Students who scored above 80:");

            while(rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Mark: " + rs.getInt("mark"));
                System.out.println("City: " + rs.getString("city"));

                System.out.println("--------------------");
            }

            rs.close();
            st.close();
            con.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
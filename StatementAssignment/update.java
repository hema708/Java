package com.jdbc.StatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            int result = st.executeUpdate(
                "UPDATE student SET mark=95 WHERE name='Arun'"
            );

            if (result > 0) {
                System.out.println("Student record updated successfully");
            } else {
                System.out.println("Student record not found");
            }

            st.close();
            con.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
package com.jdbc.StatementAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Hema@2006";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            int result = st.executeUpdate("DELETE FROM student WHERE id=3");

            if (result > 0) {
                System.out.println("Student record deleted successfully");
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

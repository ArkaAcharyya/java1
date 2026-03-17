package com.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college_db";
        String username = "root";      // or arka if you created new user
        String password = "9434";

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");

            // 3. Create statement
            java.sql.Statement stmt = conn.createStatement();

            // 4. Execute query
            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Process result
            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");

                System.out.println(id + " | " + name + " | " + age + " | " + course);
            }

            // 6. Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error");
            e.printStackTrace();
        }
    }

}

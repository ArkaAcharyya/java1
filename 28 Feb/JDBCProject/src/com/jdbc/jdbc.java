package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            // STEP 1: Load Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // STEP 2: Create Connection
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/clg_db",
	                    "root",
	                    "9434");

	            int choice;
	            do {
	                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
	                System.out.println("1. Add Student");
	                System.out.println("2. Update Student Marks");
	                System.out.println("3. Delete Student");
	                System.out.println("4. View All Students");
	                System.out.println("5. Exit");
	                System.out.print("Enter choice: ");

	                choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter ID: ");
	                        int id = sc.nextInt();
	                        sc.nextLine();

	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();

	                        System.out.print("Enter Marks: ");
	                        double marks = sc.nextDouble();

	                        PreparedStatement ps1 = con.prepareStatement(
	                                "INSERT INTO Student VALUES (?, ?, ?)"
	                        );
	                        ps1.setInt(1, id);
	                        ps1.setString(2, name);
	                        ps1.setDouble(3, marks);

	                        ps1.executeUpdate();
	                        System.out.println("✅ Student Added");
	                        ps1.close();
	                        break;

	                    case 2:
	                        System.out.print("Enter ID: ");
	                        int uid = sc.nextInt();

	                        System.out.print("Enter New Marks: ");
	                        double newMarks = sc.nextDouble();

	                        PreparedStatement ps2 = con.prepareStatement(
	                                "UPDATE Student SET marks=? WHERE id=?"
	                        );
	                        ps2.setDouble(1, newMarks);
	                        ps2.setInt(2, uid);

	                        int updated = ps2.executeUpdate();
	                        System.out.println(updated > 0 ? "✅ Updated" : "❌ Student Not Found");
	                        ps2.close();
	                        break;

	                    case 3:
	                        System.out.print("Enter ID: ");
	                        int did = sc.nextInt();

	                        PreparedStatement ps3 = con.prepareStatement(
	                                "DELETE FROM Student WHERE id=?"
	                        );
	                        ps3.setInt(1, did);

	                        int deleted = ps3.executeUpdate();
	                        System.out.println(deleted > 0 ? "✅ Deleted" : "❌ Student Not Found");
	                        ps3.close();
	                        break;

	                    case 4:
	                        PreparedStatement ps4 = con.prepareStatement(
	                                "SELECT * FROM Student"
	                        );

	                        ResultSet rs = ps4.executeQuery();

	                        System.out.println("\nID\tName\t\tMarks");
	                        System.out.println("--------------------------------");
	                        while (rs.next()) {
	                            System.out.println(
	                                    rs.getInt(1) + "\t" +
	                                    rs.getString(2) + "\t\t" +
	                                    rs.getDouble(3)
	                            );
	                        }
	                        rs.close();
	                        ps4.close();
	                        break;
	                    case 5:
	                        System.out.println("Exiting...");
	                        break;

	                    default:
	                        System.out.println("Invalid Choice");
	                }

	            } while (choice != 5);
	            con.close();
	            sc.close();

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


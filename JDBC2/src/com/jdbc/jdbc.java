package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/college_db";
        String username = "root";
        String password = "9434";
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id");
			int id=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM STUDENT WHERE ID=?");
			ps.setInt(1, id);
			//ps.execute();
			Resultset rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"
						+rs.getString(2)+"\t"
						+rs.getInt(3)+"\t"
						+rs.getInt(4)+"\t"
						+rs.getString(5));
						
			}
			conn.close();
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class AddColumn {
    public static void main(String[] args) throws SQLException {
	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
			Statement stmt=con.createStatement();
			String sql="alter table student add column dob date";
			boolean b=stmt.execute(sql);
			System.out.println("column added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
	
package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
	public static void main(String[] args) throws SQLException {
		//step1:
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
			//step3:
			Statement stmt=con.createStatement();
			//create table
			String sql="alter table employee1 add column salary int";
			boolean b=stmt.execute(sql);
			System.out.println("column added");
			
			boolean a=stmt.execute("alter table employee1 drop dob");
			System.out.println("column deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

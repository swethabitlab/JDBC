package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateRecord {
	public static void main(String[] args) throws SQLException {
		//step1:
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
			//step3:
			Statement stmt=con.createStatement();
			//create table
			String sql="create table employee1(id int,name varchar(10),dob date)";
			boolean b=stmt.execute(sql);
			System.out.println("table created successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

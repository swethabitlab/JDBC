package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
   public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","swetha@123");
		System.out.println("successfully connected");
		//step3:
		Statement stmt=con.createStatement();
		//step4:
		boolean b=stmt.execute("create database backend");
		System.out.println("database created successfully ");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

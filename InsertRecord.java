package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
			Statement stmt=con.createStatement();
			String sql="insert into employee1 values(1,'neha',30000)";
			int i=stmt.executeUpdate(sql);
			String sql1="insert into employee1 values(2,'nayan',50000)";
			int j=stmt.executeUpdate(sql1);
			String sql3="insert into employee1 values(3,'vamika',60000)";
			int k=stmt.executeUpdate(sql3);
			System.out.println(i+j+k+" rows get effected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

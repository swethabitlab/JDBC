package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
			Statement stmt=con.createStatement();
			String sql="insert into student1 values(1,'swetha')";
			int i=stmt.executeUpdate(sql);
			System.out.println(i+" row effected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

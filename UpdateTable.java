package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
			Statement stmt=con.createStatement();
			String sql="update student1 set id=101 where name='swetha' ";
			int a=stmt.executeUpdate(sql);
			System.out.println(a+" row updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

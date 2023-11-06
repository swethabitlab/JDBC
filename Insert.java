package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/s", "root", "swetha@123");
			Statement st=con.createStatement();
			int a=st.executeUpdate("insert into Student values(2,'anu','ECE')");
			int b=st.executeUpdate("insert into Student values(3,'madhu','EEE')");
			int c=st.executeUpdate("insert into Student values(4,'deepika','CSE')");
			System.out.println(a+b+c+" rows added");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

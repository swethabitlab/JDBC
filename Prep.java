package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prep {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
           try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "swetha@123");
			Statement st=con.createStatement();
			String sql="create database s";
			boolean b=st.execute(sql);
			System.out.println("database created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

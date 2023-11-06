package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","swetha@123");
			
			//step3:
			Statement stmt=con.createStatement();
			//step4:
			String sql="insert into student1 values(101,'swetha')";
			int a=stmt.executeUpdate(sql);
			String sql1="select *from student1";
			
			ResultSet res=stmt.executeQuery(sql1);
         while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			System.out.println("Executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

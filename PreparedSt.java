package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedSt {
  public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/s", "root", "swetha@123");
		System.out.println("successfully connected");
		String sql="insert into student values(?,?,?)";
		PreparedStatement pst=con.prepareStatement("sql");
		pst.setInt(1,101);
		pst.setString(2,"Neha");
		pst.setString(3,"ECE");
		int a=pst.executeUpdate();
		
		
		System.out.println("Executed");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}

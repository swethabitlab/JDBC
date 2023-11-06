package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practice {
 public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		System.out.println("Successfully connected");
		String sql="delete from student1 where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, 1);
		
		int a=pst.executeUpdate();
		System.out.println("deleted");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

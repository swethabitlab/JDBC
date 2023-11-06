package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUsingPrepstmt {
	public static void main(String[] args) throws SQLException {
		//step1:
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
			String sql="delete from student1 where id=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, 3);
			int a=pst.executeUpdate();
			System.out.println("deleted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

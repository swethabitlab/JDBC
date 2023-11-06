package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUsingPrepstmt {
	public static void main(String[] args) throws SQLException {
		//step1:
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
			String sql="update student1 set name=? where id=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,"vijayawada");
			pst.setInt(2, 4);
			int a=pst.executeUpdate();
			System.out.println("updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

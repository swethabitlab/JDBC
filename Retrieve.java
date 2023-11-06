package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrieve {

	public static void main(String[] args) throws SQLException {
		//step1:
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
			String sql="select*from student1 where id=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, 1);
			ResultSet res=pst.executeQuery();
			while(res.next()) {
				System.out.println("id:"+res.getInt(1)+",name:"+res.getString(2));
			}
			System.out.println("executed");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


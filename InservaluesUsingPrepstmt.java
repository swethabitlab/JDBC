package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InservaluesUsingPrepstmt {
	 public static void main(String[] args) throws SQLException {
			//step1:
			   try {
				Class.forName("com.mysql.jdbc.Driver");
				//step2:
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
				String sql="insert into student1 values(?,?)";
				
				PreparedStatement pst=con.prepareStatement(sql);
				//set values into table
				pst.setInt(1,1);
				pst.setString(2,"Hyderabad");
				int a=pst.executeUpdate();
				
				pst.setInt(1,2);
				pst.setString(2,"banglore");
				int b=pst.executeUpdate();
				
				pst.setInt(1,3);
				pst.setString(2,"vizag");
				int c=pst.executeUpdate();
				
				System.out.println("inserted the values ");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}

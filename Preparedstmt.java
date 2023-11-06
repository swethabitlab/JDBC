package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Preparedstmt {
	 public static void main(String[] args) throws SQLException {
		 Scanner sc=new Scanner(System.in);
			//step1:
			   try {
				Class.forName("com.mysql.jdbc.Driver");
				//step2:
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root", "swetha@123");
                 String sql="insert into student1 values(?,?)";
				
				PreparedStatement pst=con.prepareStatement(sql);
				//set values
				System.out.println("Enter id");
				pst.setInt(1, sc.nextInt());
				System.out.println("Enter name");
				
				pst.setString(2, sc.next());
				int a=pst.executeUpdate();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
}
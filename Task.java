package com.swetha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		Employee em=new Employee();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("1.Create Employee Record");
		System.out.println("2.Read Employee Record");
		System.out.println("3.Update Employee Record");
		System.out.println("4.Delete Employee Record");
		System.out.println("5.Exit");
		 System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			em.createEmployee();
			System.out.println("Employee record created successfully");
			 break;
		case 2:
			em.readEmployee();
			System.out.println("Read Employee details successfully");
			 break;
		case 3:
			em.updateEmployee();
			System.out.println("Updated Employee details successfully");
			 break;
		case 4:
			em.deleteEmployee();
			System.out.println("Deleted Employee details successfully");
			 break;
		case 5:
			System.out.println("Exit");
			break;
			default:
			System.out.println("Invalid choice");
			break;
		}
	  
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
}
class Employee{
	private  Scanner sc=new Scanner(System.in);
	
	
	public void createEmployee() throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		
		
		String sql="create table Employee(eid int primary key,firstName varchar(10),lastName varchar(10),email varchar(20),salary int)";
		PreparedStatement pst=con.prepareStatement(sql);
		boolean b=pst.execute();
		
		
	}
	public void readEmployee() throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		System.out.println("Enter Emploee id");
		int eid=sc.nextInt();
		System.out.println("Enter Emploee first name");
		String firstName=sc.next();
		System.out.println("Enter Emploee last name");
		String lastName=sc.next();
		System.out.println("Enter Emploee email");
		String email=sc.next();
		System.out.println("Enter Emploee salary");
		int salary=sc.nextInt();
		String sql="insert into Employee values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,eid);
		pst.setString(2,firstName);
		pst.setString(3,lastName);
		pst.setString(4,email);
		pst.setInt(5,salary);
		int a=pst.executeUpdate();
		String sql1="select*from Employee where eid=?";
		
		pst.setInt(1,eid);
		
		ResultSet res=pst.executeQuery(sql1);
        while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5));
			}
	}
	public void updateEmployee() throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		String sql="update Employee set firstName=? where eid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,"Akkela");
		pst.setInt(2, 1);
		int a=pst.executeUpdate();
	}
	public void deleteEmployee() throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "swetha@123");
		String sql="delete from student1 where id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, 2);
		int a=pst.executeUpdate();
	}
	
}



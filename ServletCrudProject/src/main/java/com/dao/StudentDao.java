package com.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import com.controller.Student;
import com.mysql.cj.protocol.Resultset;

public class StudentDao {
	
	
	private String jdbcUrl="jdbc:mysql://localhost:3306/Student"; 
	private String jdbcName="root"; 
	private String jdbcpass="1234"; 
	private String jdbcDriver="com.mysql.cj.jdbc.Driver"; 
	//Class.forName("com.mysql.cj.jdbc.Driver");


	private static final String INSERT_STUDENT ="insert into student_info"+" (sid,sname,qualification,placed) values "+"(?,?,?,?);";
	private static final String DELETE_STUDENT = "delete from student_info where sid=?";
	private static final String UPDATE_STUDENT = "update student_info set sname=? , qualification=?, placed=? where sid=?;";
	private static final String SELECT_ALL = "select * from student_info";
	
	
	public StudentDao() 
	{
		
	}
	
	protected  Connection getConnection() throws ClassNotFoundException 
	{
		Connection connection=null;
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcUrl,jdbcName,jdbcpass);
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return connection;
		
	}
	
	//insert student
	public void insertstudent(Student student) throws ClassNotFoundException 
	{
		System.out.println(INSERT_STUDENT);
		try(Connection connection= getConnection();
				PreparedStatement preparedstatement= connection.prepareStatement(INSERT_STUDENT);) 
		{
			preparedstatement.setInt(1, student.getSid());
			preparedstatement.setString(2, student.getSname());
			preparedstatement.setString(3, student.getQualification());
			preparedstatement.setString(4, student.getPlaced());
			preparedstatement.executeUpdate();
			System.out.println("success");
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	//select all student
	public  List<Student> studentsAll() throws ClassNotFoundException{
		
		List<Student> student= new ArrayList<>();
	
		try (Connection connection= getConnection();
				PreparedStatement preparedstatement= connection.prepareStatement(SELECT_ALL);)
		{
			

			Resultset rs= (Resultset) preparedstatement.executeQuery();
			
			while(((ResultSet) rs).next()) 
			{
				int id=((ResultSet) rs).getInt("sid");
				String name= ((ResultSet) rs).getString("sname");
				String qualification=((ResultSet) rs).getString("qualification");
				String placed= ((ResultSet) rs).getString("placed");
				student.add(new Student(id,name,qualification,placed));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return student;
		
	}
		
	
	//update student
	public boolean updatestudent(Student student) throws ClassNotFoundException 
	{
		try (Connection connection= getConnection();
				PreparedStatement preparedstatement= connection.prepareStatement(UPDATE_STUDENT);)
		{
			preparedstatement.setString(1, getSname());
			preparedstatement.setString(2, getQualification());
			preparedstatement.setString(3, getPlaced());
			
			int i = preparedstatement.executeUpdate();
			if(i>0)
			{
				System.out.println("Update successfully.......");
				
				return true;
			}
			

			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return false;
		
	}

	private String getPlaced() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getSname() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getQualification() {
		// TODO Auto-generated method stub
		return null;
	}


	
	//delete student
	
	
	public boolean deleteStudent(int id) throws ClassNotFoundException, SQLException {
		
		try (Connection connection= getConnection();
				PreparedStatement preparedstatement= connection.prepareStatement(DELETE_STUDENT);)
		{
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
		}
		return false;
	}

	public static List<Student> studensAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Student selectUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

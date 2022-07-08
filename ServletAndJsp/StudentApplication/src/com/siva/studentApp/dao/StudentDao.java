package com.siva.studentApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.siva.studentApp.beans.Student;

public class StudentDao{
	private static StudentDao singletonInstance;
	
	private StudentDao() {
	}
	
	public List<Student> getStudents(){
		List<Student> students = null;
		try 
			(
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			){
			students= new ArrayList();
			Student student;
			while(rs.next()) {
				student = new Student(rs.getInt("roll_number"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
		
	}
	
	public int insertStudent(Student student ) {
		int rowsAffected = 0;
		try(
			Connection con = DBUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO students VALUES(null, ?, ? ,?)");
			)
		{
				pstmt.setString(1, student.getFirstName());
				pstmt.setString(2, student.getLastName());
				pstmt.setString(3, student.getEmail());
				rowsAffected = pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsAffected;
		
	}
	
	public Student getStudentFromID(int studentID) {
		ResultSet rs = null;
		Student student = null;
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM students WHERE ROLL_NUMBER = ?");
				)
		{
			pstmt.setInt(1, studentID);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				student = new Student(rs.getInt("roll_number"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"));	
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	public int deleteStudent(Student student) {
		int studetnID = student.getRollNumber();
		int result = 0;
		try(
				Connection con = DBUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement("DELETE FROM STUDENTS WHERE ROLL_NUMBER = ?")
				){
			pstmt.setInt(1, studetnID);
			result = pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updateStudent(Student student) {
		int studetnID = student.getRollNumber();
		String firstName = student.getFirstName();
		String lastName = student.getLastName();
		String email = student.getEmail();
		
		int result = 0;
		try(
				Connection con = DBUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement("UPDATE STUDENTS SET first_name = ? , last_name = ? , email = ? WHERE ROLL_NUMBER = ?")
				){
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, email);
			pstmt.setInt(4, studetnID);
			result = pstmt.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public static StudentDao getStudentDao() {
		if(singletonInstance == null)
			singletonInstance = new StudentDao();
		return singletonInstance;
	}
	
	
	
}

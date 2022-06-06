package com.siva.studentApp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.siva.studentApp.beans.Student;

public class StudentDao {
	
	public List<Student> getStudents(){
		List<Student> students = null;
		try(
				Connection con = DBUtil.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
				){
			 students= new ArrayList();
			Student student;
			while(rs.next()) {
				student = new Student(rs.getInt("roll_number"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
		
	}
	
}

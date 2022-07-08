package com.siva.studentApp.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siva.studentApp.beans.Student;
import com.siva.studentApp.dao.StudentDao;


@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = "LIST";
		operation = request.getParameter("operation");
		
		switch(operation) {
		
		case "ADD" : addStudent(request,response);
					 break;
		case "LIST" : listStudents(request,response);
					 break;
		case "LOAD" : loadStudent(request,response);
					 break;
		case "UPDATE" : updateStudent(request,response);
					 break;
		case "DELETE" : deleteStudent(request,response);
					 break;
		default : listStudents(request,response);
				  break;
		}
		
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentID = Integer.parseInt(request.getParameter("studentID"));
		Student student = StudentDao.getStudentDao().getStudentFromID(studentID);
		int deleted = StudentDao.getStudentDao().deleteStudent(student);
		
		if(deleted == 1) {
			listStudents(request, response);
		}
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentID = Integer.parseInt(request.getParameter("studentID"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		StudentDao studentDao = StudentDao.getStudentDao();
		Student student = new Student(studentID,firstName,lastName,email);
		int updated = studentDao.updateStudent(student);
		if(updated == 1) {
			listStudents(request, response);
		}
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Getting RollNumber or Student ID from Form
		int studentID = Integer.parseInt(request.getParameter("studentID"));
		//Getting the particular student from the database and storing it into Student obj
		Student student = StudentDao.getStudentDao().getStudentFromID(studentID);
		//Setting the student object to the request attribute
		request.setAttribute("THE_STUDENT", student);
		RequestDispatcher rd = request.getRequestDispatcher("/update_student.jsp");
		rd.forward(request, response);
		
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		request.setAttribute("studentList", StudentDao.getStudentDao().getStudents());
		rd.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		RequestDispatcher rd = request.getRequestDispatcher("/HomeServlet");
		if(firstName.compareTo("") == 0 || lastName.compareTo("") == 0 || email.compareTo("") == 0) {
			rd.forward(request, response);
		}
		else {
			Student student = new Student(firstName, lastName, email);
			int result = StudentDao.getStudentDao().insertStudent(student);
			
			if(result == 1) {
				rd.forward(request, response);
			}
		}
	}


}

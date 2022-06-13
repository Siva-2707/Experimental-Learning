package com.siva.studentApp.servlets;

import java.io.IOException;

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

		default : listStudents(request,response);
				  break;
		}
		
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		request.setAttribute("studentList", new StudentDao().getStudents());
		rd.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		Student student = new Student(firstName, lastName, email);
		int result = new StudentDao().insertStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("/HomeServlet");
		if(result == 1) {
			rd.forward(request, response);
		}
	}


}

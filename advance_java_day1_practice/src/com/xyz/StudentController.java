package com.xyz;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.xyz.beans.Student;

public class StudentController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("viewAll")) {
			StudentRepository studentRepository = new StudentRepository();
			List<Student> listOfAllStudents = studentRepository.getAllStudents();
			System.out.println("List of All Students: " + listOfAllStudents);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllStudents.jsp");
			request.setAttribute("listOfAllStudents", listOfAllStudents);
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				System.out.println("Exception occurred: " + e);
			} catch (IOException e) {
				System.out.println("Exception occurred: " + e);
			}
		} else if (requestAction.equalsIgnoreCase("delete")) {
			System.out.println("Deleting an Student");
			StudentRepository studentRepository = new StudentRepository();
			int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
			studentRepository.deleteStudent(rollNumber);
			
			try {
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e);
			}
			
		} else if (requestAction.equalsIgnoreCase("openUpdateForm")) {
			int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
			StudentRepository studentRepository = new StudentRepository();
			Student student = studentRepository.getStudent(rollNumber);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("updateStudentForm.jsp");
			request.setAttribute("student", student);
			
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e);
			}
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		System.out.println("Roll No: " + rollNumber);
		
		String name = request.getParameter("studentName");
		System.out.println("Student Name: " + name);
		
		String course = request.getParameter("course");
		System.out.println("Course: " + course);
		
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("Age: " + age);
		
		int courseDuration = Integer.parseInt(request.getParameter("courseDuration"));
		System.out.println("Course Duration: " + courseDuration);
		
		StudentRepository studentRepository = new StudentRepository();
		Student student = new Student(rollNumber, name, course, courseDuration, age);
		studentRepository.addStudent(student);
		
//		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//		request.setAttribute("rollNumber", rollNumber);
//		request.setAttribute("studentName", name);
//		request.setAttribute("course", course);
//		request.setAttribute("age", age);
//		request.setAttribute("courseDuration", courseDuration);
		
		try {
//			rd.forward(request, response);
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}

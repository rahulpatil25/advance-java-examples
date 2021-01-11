package com.zensar;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bean.Employee;

public class EmployeeController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		List<Employee> listOfAllEmployees = employeeRepository.getAllEmployees();
		System.out.println("List of All Employees: " + listOfAllEmployees);
		
		RequestDispatcher rd = request.getRequestDispatcher("viewAllEmployees.jsp");
		request.setAttribute("listOfAllEmployees", listOfAllEmployees);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			System.out.println("Exception occurred: " + e);
		} catch (IOException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String employeeName = request.getParameter("employeeName");
		String designation = request.getParameter("designation");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String gender = request.getParameter("gender");
		
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Gender: " + gender);
		
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee = new Employee(employeeId, employeeName, designation, salary, gender);
		employeeRepository.addEmployee(employee);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			System.out.println("Exception occurred: " + e);
		} catch (IOException e) {
			System.out.println("Exception occurred: " + e);
		}
		
	}
}

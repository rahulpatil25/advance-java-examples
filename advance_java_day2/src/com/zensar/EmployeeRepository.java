package com.zensar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.zensar.bean.Employee;

public class EmployeeRepository {
	public void addEmployee(Employee employee) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into employee values (?,?,?,?,?);";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, employee.getEmployeeId());
			pst.setString(2, employee.getEmployeename());
			pst.setString(3, employee.getDesignation());
			pst.setInt(4, employee.getSalary());
			pst.setString(5, employee.getGender());
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Database Operation Failed");
			} else {
				System.out.println("Database Operation Succeeded");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> listOfAllEmployees = new ArrayList<Employee>();
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from employee;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int employeeId = rs.getInt("employee_id");
				String employeeName = rs.getString("employee_name");
				String designation = rs.getString("designation");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				Employee employee = new Employee(employeeId, employeeName, designation, salary, gender);
				listOfAllEmployees.add(employee);
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return listOfAllEmployees;
	}
	
}

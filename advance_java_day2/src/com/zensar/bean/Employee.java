package com.zensar.bean;

public class Employee {
	private int employeeId;
	private String employeename;
	private String designation;
	private int salary;
	private String gender;
	public Employee(int employeeId, String employeename, String designation, int salary, String gender) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.designation = designation;
		this.salary = salary;
		this.gender = gender;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "\nEmployee [ ID: " + employeeId + ", Name: " + employeename + ", Designation: " + designation
				+ ", Salary: " + salary + ", Gender:" + gender + " ]";
	}
	
	
}

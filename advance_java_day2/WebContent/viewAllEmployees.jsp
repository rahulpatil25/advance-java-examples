<%@page import="com.zensar.bean.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h2>List of All Employees</h2>
<% List<Employee> listOfAllEmployees = (List<Employee>) request.getAttribute("listOfAllEmployees"); %>
<table border="1">
	<th> Employee ID </th>
	<th> Name </th>
	<th> Designation </th>
	<th> Salary </th>
	<th> Gender </th>
	<% for(Employee employee : listOfAllEmployees) { %>
		<tr>
			<td> <%=employee.getEmployeeId() %> </td>
			<td> <%=employee.getEmployeename() %> </td>
			<td> <%=employee.getDesignation() %> </td>
			<td> <%=employee.getSalary() %> </td>
			<td> <%=employee.getGender() %> </td>
		</tr>
	<% } %>
</table>
</body>
</html>
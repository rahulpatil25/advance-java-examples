<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="addEmployee" method="post">
<table>
	<tr>
		<td> Employee ID: </td>
		<td> <input type="text" name="employeeId" /> </td>
	</tr>
	<tr>
		<td> Employee Name: </td>
		<td> <input type="text" name="employeeName" /> </td>
	</tr>
	<tr>
		<td> Designation: </td>
		<td> <input type="text" name="designation" /> </td>
	</tr>
	<tr>
		<td> Salary: </td>
		<td> <input type="text" name="salary" /> </td>
	</tr>
	<tr>
		<td> Gender: </td>
		<td>
			<input type="radio" id="male" name="gender" value="Male">
			<label for="male">Male</label>
			<input type="radio" id="female" name="gender" value="Female">
			<label for="female">Female</label>
		</td>
	</tr>
	<tr>
		<td> &nbsp; </td>
		<td> <input type="submit" value="Add Employee" /> </td>
	</tr>
</table>
</form>
</body>
</html>
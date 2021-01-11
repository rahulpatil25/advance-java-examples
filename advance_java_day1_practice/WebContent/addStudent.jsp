<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>Welcome to Student Information</h2>
<form action="student" method="post">
	<table>
		<tr>
			<td>Roll No: </td>
			<td><input type="text" name="rollNumber" /></td>
		<tr>
		<tr>
			<td>Student Name: </td>
			<td><input type="text" name="studentName" /></td>
		<tr>
		<tr>
			<td>Course: </td>
			<td><input type="text" name="course" /></td>
		<tr>
		<tr>
			<td>Age: </td>
			<td><input type="text" name="age" /></td>
		<tr>
		<tr>
			<td>Course Duration: </td>
			<td><input type="text" name="courseDuration" /></td>
		<tr>	
		<tr>
			<td> &nbsp; </td>
			<td><input type="submit" value="Add Student" /></td>
	</table>
</form>
</body>
</html>
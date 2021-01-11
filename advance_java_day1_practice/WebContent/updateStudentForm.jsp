<%@page import="com.xyz.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Updation</title>
</head>
<% Student student = (Student) request.getAttribute("student"); %>
<body>
<h2>Update Student</h2>
<table>
	<tr>
		<td> Roll No: </td>
		<td> <input type="text" name="rollNumber" value="<%=student.getRollNumber() %>" /> </td>
	</tr>
	<tr>
		<td> Student Name: </td>
		<td> <input type="text" name="studentName" value="<%=student.getStudentName() %>" /> </td>
	</tr>
	<tr>
		<td> Course: </td>
		<td> <input type="text" name="course" value="<%=student.getCourse() %>" /> </td>
	</tr>
	<tr>
		<td> Duration: </td>
		<td> <input type="text" name="duration" value="<%=student.getDuration() %>" /> </td>
	</tr>
	<tr>
		<td> Age: </td>
		<td> <input type="text" name="age" value="<%=student.getAge() %>" /> </td>
	</tr>
	<tr>
		<td> &nbsp; </td>
		<td> <input type="submit" value="Update Student" /> </td>
	</tr>
</table>
</body>
</html>
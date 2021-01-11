<%@page import="java.util.*"%>
<%@page import="com.xyz.beans.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>List of All Students</h2>
<% List<Student> listOfAllStudents = (List<Student>) request.getAttribute("listOfAllStudents"); %>
<table border="1">
	<th> Roll Number </th>
	<th> Name </th>
	<th> Course </th>
	<th> Duration </th>
	<th> Age </th>
	<% for(Student student : listOfAllStudents) { %>
		<tr>
			<td> <%=student.getRollNumber() %> </td>
			<td> <%=student.getStudentName() %> </td>
			<td> <%=student.getCourse() %> </td>
			<td> <%=student.getDuration() %> </td>
			<td> <%=student.getAge() %> </td>
			<td> <a href="deleteStudent?requestAction=delete&rollNumber=<%=student.getRollNumber() %>"></a>Delete</td>
			<td> <a href="updateStudentForm?requestAction=openUpdateForm&rollNumber=<%=student.getRollNumber() %>">Update</a> </td>
		</tr>
	<% } %>
</table>
</body>
</html>
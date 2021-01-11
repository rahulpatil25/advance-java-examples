<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>Welcome to Student Information, <%=request.getAttribute("studentName") %></h2>
<p>The Details are:</p>
Roll No: <b><%=request.getAttribute("rollNumber") %></b><br>
Student Name: <b><%=request.getAttribute("studentName") %></b><br>
Course: <b><%=request.getAttribute("course") %></b><br>
Age: <b><%=request.getAttribute("age") %></b><br>
Course Duration: <b><%=request.getAttribute("courseDuration") %></b><br>
</body>
</html>
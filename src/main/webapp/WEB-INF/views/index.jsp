<%@page import="com.springmvcweb.studentmgmt.models.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index file</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h2>From index file</h2>
<hr>
<h3>Get data from controller to view &nbsp; &nbsp;&nbsp;&nbsp; <a href="showjstlpage">JSTL demo</a></h3>

<p>Using  : ${types}</p> 

<p> Using jsp tags</p>

<%
String types = request.getAttribute("types").toString();
Integer studentId = (Integer) request.getAttribute("studentId");

List<Student> slist =(List<Student>) request.getAttribute("slist");
%>

<%=types%>
<%=studentId%>
<table>
<thead>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
<th>Mobile no</th>
<th>Email</th>
</tr>
</thead>
<tbody>
<% for(Student student :slist){ %>
<tr>
	<td><%=student.getStudentId() %></td>
	<td><%=student.getFirstName() %></td>
	<td><%=student.getLastName() %></td>
	<td><%=student.getGender() %></td>
	<td><%=student.getMobileNo() %></td>
	<td><%=student.getEmail() %></td>
<%} %>

	
</tr>
</tbody>
</table>

</body>
</html>
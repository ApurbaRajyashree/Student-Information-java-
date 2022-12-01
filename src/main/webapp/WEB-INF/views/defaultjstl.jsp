<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jstl demo</title>
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
<h3>Using jstl tags</h3>
<hr>
<h3><a href="showaddstudent">Add Student</a></h3>
Types: <c:out value="${using}"></c:out>

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
	<c:forEach var="student" items="${slist}">
	<tr>
		<td><c:out value="${student.studentId}"></c:out></td>
		<td><c:out value="${student.firstName}"></c:out></td>
		<td><c:out value="${student.lastName}"></c:out></td>
		<td><c:out value="${student.gender}"></c:out></td>
		<td><c:out value="${student.mobileNo}"></c:out></td>
		<td><c:out value="${student.email}"></c:out></td>
	 
</tr>
</c:forEach>

</tbody>
</table>




</body>
</html>
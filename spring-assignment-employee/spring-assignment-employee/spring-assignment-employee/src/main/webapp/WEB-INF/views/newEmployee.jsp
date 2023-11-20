<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.valtech.assignment.springassignmentemployee.model.EmployeeModel"%>
<%@page import="com.valtech.assignment.springassignmentemployee.service.EmployeeService"%>
<%@page import="com.valtech.assignment.springassignmentemployee.entites.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="save" method="post">
		<table border="2">
			<tr>
				<td>Id</td>
				<td><input type="text" disabled="disabled" name="eid" value=""></td>
			</tr>
			<tr>
				<td>NAME</td>
				<td><input type="text" name="name" value=""></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" value=""></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td><input type="text" name="experience" value=""></td>
			</tr>
			<tr>
				<td>Seniority</td>
				<td><input type="text" name="seniority" value=""></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary" value=""></td>
			</tr>
			<tr>
				<td>Department Id</td>
				<td><input type="text" name="department" value=""></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" name="submit" value="create"></td>
			</tr>
		</table>



	</form>

</body>
</html>
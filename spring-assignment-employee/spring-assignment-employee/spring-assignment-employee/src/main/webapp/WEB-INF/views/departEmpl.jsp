<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="com.valtech.assignment.springassignmentemployee.model.EmployeeModel"%>
<%@page
	import="com.valtech.assignment.springassignmentemployee.entites.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employees Details</h1>
	<%
	List<EmployeeModel> empl = (List<EmployeeModel>) request.getAttribute("employees");
	%>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Experience</th>
			<th>Seniority</th>
			<th>Salary</th>
			<th>Department id</th>
			<th>Alter</th>
			
		</tr>
		
		<%
		for (EmployeeModel em : empl) {
			request.setAttribute("em", em);
		%>
		<tr>
			<td>${em.eid}</td>
			<td>${em.name}</td>
			<td>${em.age}</td>
			<td>${em.seniority}</td>
			<td>${em.experience}</td>
			<td>${em.salary}</td>
			<td>${em.department.deptId}</td>
			<td><a href="#">Edit</a>      <a href="#">Delete</a></td>
			


		</tr>



		<%
		}
		
		%>
		
		<tr>
			<td>
			<form action="newEmployee" method="get">
				<input type="submit" name="submit" value="new Employee">

			</form>
			</td>
			</tr>
		


	</table>


</body>
</html>
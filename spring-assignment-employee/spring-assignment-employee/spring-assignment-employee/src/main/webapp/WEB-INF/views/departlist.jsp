<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="com.valtech.assignment.springassignmentemployee.model.DepartmentModel"%>
<%@page
	import="com.valtech.assignment.springassignmentemployee.entites.Department"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%List<DepartmentModel> dep = (List<DepartmentModel>)request.getAttribute("departments"); %>

	
	<table border="1">
	<tr>
	<th>Departmnet ID</th>
	<th>Departmnet Name</th>
	<th>Departmnet Location</th>
	
	</tr>
	<%for(DepartmentModel d:dep){
		request.setAttribute("d", d);
		
	%>
	<tr>
	
		
		<td>${d.deptId}</td>
		<td>${d.deptname}</td>
		<td>${d.location}</td>
		<td><a href="departEmpl?deptId=${d.deptId}">DEPTEMPLOYEE</a><td>


		</tr>
	<% } %>
	<!-- <tr><td><input type="submit" name="submit" value="DepartEmployee"><td></tr> -->
	

	</table>

</body>
</html>
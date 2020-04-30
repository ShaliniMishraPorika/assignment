<%@page import="com.capgemini.springmvcassign.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) request.getAttribute("employeeInfo");
String errMsg = (String) request.getAttribute("errMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>search Employee</legend>
		<form action="./getEmployee" method="get">
		<label>Employee ID : </label>
		<input type="number" name="empId" required> <br>
		<br>
		<input type="submit" value="search">
		
		</form>
	
	</fieldset>
	<% if(errMsg != null && !errMsg.isEmpty()) { %>
	<h3 style="color : red;">
	<%=errMsg %>
	</h3>
	<% } %>
	<% if(employeeInfoBean != null) { %>
		<div align="center">
<table>
	<tr>
		<th>Column 1 Heading </th>
		<th>Column 2 Heading </th>
	</tr>
	<tr>
		<td>Row 1 :Col 1 </td>
		<td>Row 1 :Col 2</td>
	</tr>
	</table>
<%  } %>
</body>
</html>
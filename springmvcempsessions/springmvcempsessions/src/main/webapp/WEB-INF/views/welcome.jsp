<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String scuessMsg = (String) request.getAttribute("done"); %>
	<%String errMsg = (String)request.getAttribute("notDone");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<div style="width: 100%;" align="center">
<h1 style="color: navy;">Welcome !!</h1>
</div>

<%if (errMsg != null && !errMsg.isEmpty()) { %>
	<h4 style="color: red;">Not Registered</h4>
	<%} else if(scuessMsg != null && !scuessMsg.isEmpty()){ %>
<h3 style="color: green">Registered Successfully  Go to Login</h3>
<%} else{ %>
	<h4 style="color: black;"></h4>
<%} %>

<a href="registerForm">Register here</a>
<br>
<a href="loginForm">Go to login Page</a>


</body>
</html>
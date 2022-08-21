<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to ArisGlobal Library Management System</title>
<body>
	<form:form action="submitForm" modelAttribute="registration">  
        Id: <form:input path="id" type = "integer" />
		<br>
		<br>  
        User name: <form:input path="user_name" />
		<br>
		<br>
		Address: <form:input path="address" />
		<br>
		<br>
		Role Id: <form:input path="role_id" type = "integer"/>
		<br>
		<br>
		Email : <form:input path="email" />
		<br>
		<br>
		Phone No.: <form:input path="mobile_number" type = "integer" />
		<br>
		<br>
		Password: <form:input path="password" type = "password" />
		<br>
		<br>
		<input type="submit" value="Regitration" />

	</form:form>

</body>

</head>
<body>

</body>
</html>
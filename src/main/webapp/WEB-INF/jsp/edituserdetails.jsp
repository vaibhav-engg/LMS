<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit user details</title>
</head>
<body>

<form:form action="saveuser" modelAttribute="user">
Username: ${user.user_name}<br>
User Email : ${user.email}<br>
Contact Number: ${user.mobile_number}<br>
User role: <form:select path="role_id" value="${user.role_id}">
<form:option value="1" label="User"/>
<form:option value="2" label="Librarian"/>
<form:option value="3" label="Super Admin"/>
</form:select>
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all LMS users</title>
</head>
<body>
List of users:
<table border="1px">
<tr>
<td>ID</td>
<td>Name</td>
<td>Email</td>
<td>Role</td>
<td>Contact number</td>
</tr>  
<c:forEach var="user" items="${userlist}">  
<tr>
<td>${user.id}</td>
<td>${user.user_name}</td>
<td>${user.email}</td>
<td>${user.role_id}</td>
<td>${user.mobile_number}</td>
</tr>
</c:forEach>  
</table>  
<br>
</body>
</html>
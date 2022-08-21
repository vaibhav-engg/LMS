<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter User ID</title>
</head>
<body>
<form:form action="userdetail" modelAttribute="user">
Please enter user id of user to edit:
ID : <form:input placeholder="User id" path="id"/>

<a href="alluser">View a list of all users with user ids</a>
</form:form>
</body>
</html>
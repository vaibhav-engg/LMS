<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm delete User</title>
</head>
<body>

<form:form action="confirmdeleteuser" modelAttribute="user">
User ID: <input value="${user.id}" name="id" readonly/><br>
Username: ${user.user_name}<br>
User Email : ${user.email}<br>
Contact Number: ${user.mobile_number}<br>
<input type="submit"/>
</form:form>
</body>
</html>
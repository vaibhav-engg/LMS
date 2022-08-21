<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Your Issued Books Are:
	<table border="1px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Issue Date</td>
			<td>Due Date</td>
			<td>Return Book</td>
		</tr>
		<tr>
			<c:forEach var="asset" items="${issuedassetlist}">
				<td>${asset.asset_id}</td>
				<td>${asset.asset_name}</td>
			</c:forEach>
			<c:forEach var="transaction" items="${transactionlist}">
				<td>${transaction.issue_date}</td>
				<td>${transaction.due_date}</td>
				<td><a href="/returnbook/${asset.asset_id }">Return</a></td>
			</c:forEach>
			<c:forEach var="asset" items="${issuedassetlist}">
				<td><a href="/returnbook/${asset.asset_id }">Return</a></td>
			</c:forEach>
		</tr>
	</table>
	<br>
</body>
</html>
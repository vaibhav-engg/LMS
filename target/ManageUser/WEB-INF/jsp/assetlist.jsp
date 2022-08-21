<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Asset List</title>
</head>

<body>
	
	
	<form:form method="Get" action="search">
	<table>
			<tr>
				<td>Search Asset By:</td>
				<td><select name="property">
					<option value="isbn">ISBN</option>
					<option value="title">Title</option>
					<option value="author">Author</option>
					
				</select></td>
			</tr>
			
			<tr>
				<td>Value:</td>
				<td><input type="text" id="value" name="value" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td>input type="submit" value="Submit"></td>
			</tr>
	</table>
			
	<table border="1px">
		<tr>
			<td>Id</td>
			<td>Asset Name</td>
			<td>ISBN</td>
			<td>Category</td>
			<td>Author</td>
			<td>Price</td>
			<td>Created date</td>
			<td>Asset Type</td>
			<td>Number Of Copies</td>

		</tr>
		<c:forEach items="${asset}" var="asset">
			<tr>
				<td>${asset.asset_id}</td>
				<td>${asset.asset_name}</td>
				<td>${asset.isbn_no}</td>
				<td>${asset.category_id}</td>
				<td>${asset.author_id}</td>
				<td>${asset.price}</td>
				<td>${asset.created_date}</td>
				<td>${asset.asset_type}</td>	
				<td>${asset.number_copies}</td>

				
			</tr>
		</c:forEach>
	</table>

	</form:form>

	
	
</body>

</html>
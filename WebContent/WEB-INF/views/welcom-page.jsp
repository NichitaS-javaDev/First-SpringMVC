<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe</title>
</head>
<body>
	<form action="processOrder">
		<div align="center">
			<h1>My Cafe</h1>
			<hr>
			<label for="item_name">Item Name :</label> <input type="text"
				name="foodType" placeholder="Example : Green Tea" id="item_name">
			<input type="submit" value="Order Now">
		</div>
	</form>
</body>
</html>
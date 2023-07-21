<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Pizza</title>
</head>
<body>
	
	<h1>My Pizza page</h1>
	<h2><c:out value="${bumpkin}"/></h2>
	<p>Pizza: <c:out value="${pizzaType}"/> </p>
	<p>Toppings: <c:out value="${numToppings }"/> </p>
	<p>Size: <c:out value="${size}"/> </p>
	<p>Style: <c:out value="${style}"/> </p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<h1>Display All Page</h1>
	<a href="/dogs">Create Dog</a>
	<a href="/">Home</a>
	
	<c:forEach var="dog" items="${allDogs}">
		<h3>
			<a href="/dogs/${dog.id}"><c:out value="${dog.name}"/> </a>	
		</h3>
			<a class="btn btn-warning" href="/dogs/edit/${dog.id}">Edit</a>
			<form action="/dogs/${dog.id}" method="post">
				<input type="hidden" name="_method" value="delete"/>
				<button class="btn btn-danger text-light">X</button>
			</form>
	</c:forEach>
</body>
</html>
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
	<div class="container">	
	   <h1>${trainer.name}</h1>
	   
	   <c:forEach var="dog" items="${trainer.dogs}">
	   		<p>
	   			<a href="/dogs/${dog.id}">${dog.name}</a>
	   		</p>
	   </c:forEach>
	</div>
	
	<form action="/trainers/add-dog" method="post">
		<input type="hidden" name="trainer" value="${trainer.id}" />
		<select name="dog">
			<c:forEach var="assign" items="${unassignedDogs }">
				<option value="${ assign.id}">${assign.name}</option>
			</c:forEach>
		</select>
		<button class="btn btn-success">Add</button>
	</form>
   
</body>
</html>
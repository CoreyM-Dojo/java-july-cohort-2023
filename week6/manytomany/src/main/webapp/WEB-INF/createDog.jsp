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
   <form:form action="/dogs" method="post" modelAttribute="dog">
   		<h1>Create Dog</h1>
   		<div class="form-group">
   			<form:label path="name" class="form-label">Name</form:label>
   			<form:errors path="name" class="text-danger"></form:errors>
   			<form:input path="name" class="form-control"></form:input>
   		</div>
   		<div class="form-group">
   			<form:label path="breed" class="form-label">Breed</form:label>
   			<form:errors path="breed" class="text-danger"></form:errors>
   			<form:input path="breed" class="form-control"></form:input>
   		</div>
   		<div class="form-group">
   			<form:label path="age" class="form-label">Age</form:label>
   			<form:errors path="age" class="text-danger"></form:errors>
   			<form:input type="number" placeholder="in months..." path="age" class="form-control"></form:input>
   		</div>
   		<div class="form-group">
   			<button class="btn btn-dark">Create</button>
   		</div>
   </form:form>
</body>
</html>
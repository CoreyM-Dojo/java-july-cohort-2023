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
	
	   <h1>Registration</h1> 
	   
	   <form:form action="registration" method="post" modelAttribute="newUser">
	   
	   		<form:errors class="text-danger" path="*"></form:errors>
	   	
	   		<div class="form-group">
	   			<form:label class="form-label" path="username">Username</form:label>
	   			<form:errors class="text-danger" path="username"></form:errors>
	   			<form:input class="form-control" path="username"></form:input>
	   		</div>
	   		<div class="form-group">
	   			<form:label path="email">Email</form:label>
	   			<form:errors class="text-danger" path="email"></form:errors>
	   			<form:input class="form-control" path="email"></form:input>
	   		</div>
	   		<div class="form-group">
	   			<form:label path="password">Password</form:label>
	   			<form:errors class="text-danger" path="password"></form:errors>
	   			<form:input type="password" class="form-control" path="password"></form:input>
	   		</div>
	   		<div class="form-group">
	   			<form:label path="confirm">Confirm Password</form:label>
	   			<form:errors class="text-danger" path="confirm"></form:errors>
	   			<form:errors class="text-danger" path=""></form:errors>
	   			<form:input type="password" class="form-control" path="confirm"></form:input>
	   		</div>
	   		<div class="form-group">
	   			<button class="btn btn-primary">Register</button>
	   		</div>
	   </form:form>
	</div>
</body>
</html>
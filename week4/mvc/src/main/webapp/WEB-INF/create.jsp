<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
   <h1>Create Page</h1>
   <a href="/">Home</a>
   <form:form action="/dogs" method="post" modelAttribute="dog-model">
   		<div>
   			<form:label path="name">Name</form:label>
   			<form:errors path="name"/>
   			<form:input path="name"/>
   		</div>
   		<div>
   			<form:label path="breed">Breed</form:label>
   			<form:errors path="breed"/>
   			<form:input path="breed"/>
   		</div>
   		<div>
   			<form:label path="age">Age</form:label>
   			<form:errors path="age"/>
   			<form:input type="number" path="age"/>
   		</div>
   		<div>
   			<form:label path="name">Size</form:label>
   			<form:errors path="size"/>
   			<form:select path="size">
   				<form:options items="${sizes}"></form:options>
   			</form:select>
   		</div>
   		<div>
   			<form:label path="isBoopable">Are they Boopable</form:label>
   			<form:errors path="isBoopable"/>
   			<form:select path="isBoopable">
   				<form:option value="Yes">Yes</form:option>
   				<form:option value="No">No</form:option>
   			</form:select>
   		</div>
   		<div>
   			<form:label path="floofMeter">Floof Meter</form:label>
   			<form:errors path="floofMeter"/>
   			<form:input type="number" path="floofMeter"/>
   		</div>
   		<button>Submit</button>
   </form:form>
</body>
</html>
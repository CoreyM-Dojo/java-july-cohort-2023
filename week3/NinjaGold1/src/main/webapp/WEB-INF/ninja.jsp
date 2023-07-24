<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
 <head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

        <meta charset="UTF-8">
        <title>Ninja Gold!</title>
</head>
<body>
    <div class="container">
	<div class="row align-items-center, justify-content-around">
		<h1 class="p-3">Your Gold: <span class="gold_box"> <c:out value="${gold}"/> </span></h1>
	
	<div class="col-3">
      	<h3>Farm</h3>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="farm" value="Find Gold!"/></form>
    	</div>
		<div class="col-3">
      	<h3>Cave</h3>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="cave" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	<h3>House</h3>
      	<p>(earn 0-10 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="house" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	<h3>Quest</h3>
      	<p>(earn/takes 0-50 gold)</p>
      	<form action="/gold" method="post"><input class="button" class="--bs-warning" type="submit" name="quest" value="Find Gold!"/></form>
      	<a class="btn btn-light mt-5" href="/clear" role="button">Reset</a>
    	</div>
    	
	</div>
	
	<div class="container2">
  	<h3 class="p-3 mt-3">Activities:</h3>
  	<c:forEach var="activity" items="${activities}">
	<c:out escapeXml= "false" value="${activity}"/>
	</c:forEach >
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	</div>
	</div>
</body>
</html>
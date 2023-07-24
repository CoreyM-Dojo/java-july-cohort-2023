<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
 <head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <meta charset="UTF-8">
        <title>PRISON</title>
</head>
<body>
<div class ="container">

<h1 class="p-3">You Lost! You have fallen into too much debt!</h1>
<h3>You owe: <c:out value="${gold}"/> </h3>


<img src="/images/right-to-jail-jail.gif" class="position-absolute top-50 start-50 translate-middle" alt="right to jail" />
<a href="/clear">Try Again</a>
</div>





</body>
</html>
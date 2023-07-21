<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css" />
<title>Insert title here</title>
</head>
<body>
<div class="container">

	<h1>Hello World!</h1>
	<form action="/process" method="post" id="columns">
	<h2>Pizza Form</h2>
	<div class="form-group">
		<label for="pizzaType">Pizza Type</label>	
		<input id="pizzaType" name="pizzaType" type="text" />
	</div>
	<div class="form-group">
		<label for="">Toppings</label>	
		<input name="toppings" type="number" />
	</div>
	<div class="form-group">	
		<label for="">Size</label>
		<select name="size">
			<option>Small</option>
			<option>Medium</option>
			<option >Large</option>
			<option >Extra Large</option>
		</select>
	</div>
	<div class="form-group">
		<label for="">Style</label>	
		<input name="style" type="text" />
	</div>
	<div class="form-submit">
		<button>Submit</button>
	</div>
	</form>
</div>
</body>
</html>
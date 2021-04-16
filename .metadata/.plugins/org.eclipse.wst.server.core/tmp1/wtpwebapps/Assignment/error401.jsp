<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<style>
	body {
	  background: #ffffff;
	}
	
	.content {
	  max-width: 500px;
	  margin: auto;
	  background: white;
	  padding: 10px;
	}
	
</style>
<title>Login Page</title>
</head>
<body>
	<h1>Unauthorized (401)</h1>
     <p>${requestScope['javax.servlet.error.message']}</p>
</body>
</html>
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
<form action="login" method="post">
	<div class="content">
		<table >
			<tbody>
				<tr>
					<td>User Name: </td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Login"></td>
				</tr>
			</tbody>
		</table>
	</div>
</form>
	<div id="msgDIV" class="content">
		<p><font color="colorvalue">${errorMsg }... </font></p>
	</div>
<script>
	$(document).ready(function(){
		$("#msgDIV").hide();
		var showmsg = "${showMsg}";
		if(showmsg == 'true') {
			$("#msgDIV").show();
		}
	});
</script>
</body>
</html>
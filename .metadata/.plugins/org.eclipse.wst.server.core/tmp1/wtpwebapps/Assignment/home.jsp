<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<%@ include file="header.jsp" %>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome</title>
<style>
	body {
	  background: #ffffff;
	}
	
	.content {
	  max-width: 600px;
	  margin: auto;
	  background: white;
	  padding: 10px;
	}
	
</style>
<script>
	$(document).ready(function(){
		$("#msgDIV").hide();
		var showmsg = "${showMsg}";
		if(showmsg == 'true') {
			$("#msgDIV").show();
		}
	});

	$(function() {
		  $("#dateFrom").datepicker({
		    dateFormat: 'dd/mm/yy',
		  });

		  $('btn').click(function() {
		    $('#error').text('');
		    try {
		    var dateParse = $.datepicker.parseDate("dd/mm/yy", $("#datepicker").val());
		    if (dateParse) {
		      $('#error').text(dateParse);
		    }
		    } catch (e) {$('#error').text(e);}
		  });
		});
	
	function validateForm() {
		var accountIdVal = document.forms["searchStatementForm"]["accountId"].value;
		  if (accountIdVal == "" || accountIdVal == null) {
		    alert("Account ID must be filled out");
		    return false;
		  }

		var dateFromVal = document.forms["searchStatementForm"]["dateFrom"].value;
		var dateToVal = document.forms["searchStatementForm"]["dateTo"].value;
		if(dateFromVal != null && dateFromVal.length > 0) {
			if (dateToVal == "" || dateToVal == null) {
		    	alert("Date to must be filled out");
		    	return false;
		  	}
		}
		if(dateToVal != null && dateToVal.length > 0) {
			if (dateFromVal == "" || dateFromVal == null) {
		    	alert("Date from must be filled out");
		    	return false;
		  	}
		}

		var amountFromVal = document.forms["searchStatementForm"]["amountFrom"].value;
		var amountToVal = document.forms["searchStatementForm"]["amountTo"].value;
		if(amountFromVal != null && amountFromVal.length > 0) {
			if (amountToVal == "" || amountToVal == null) {
		    	alert("Amount to must be filled out");
		    	return false;
		  	}
		}
		if(amountToVal != null && amountFromVal.length > 0) {
			if (amountFromVal == "" || amountFromVal == null) {
		    	alert("Amount from must be filled out");
		    	return false;
		  	}
		}
	}
</script>
</head>
<body>
	<form id="searchStatementForm" onsubmit="return validateForm();" action="searchStatement" method="post">
		<table>
			<tbody>
				<tr>
					<td>Account ID: </td>
					<td><input type="text" id="accountId" name="accountId"></td> <td class="content"><font color="colorvalue">*</font></td>
				</tr>
				<tr>
					<td>Date from:</td>
					<td><input type="text" id="dateFrom" name="dateFrom"></td>
					
					<td>Date to:</td>
					<td><input type="text" id="dateTo" name="dateTo"></td>
				</tr>
				<tr>
					<td>Amount from:</td>
					<td><input type="text" id="amountFrom" name="amountFrom"></td>
					<td>Amount to:</td>
					<td><input type="text" id="amountTo" name="amountTo"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Search Statement" id="btn" name="btn">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	<p id="error">
	
	</p>
	<div id="msgDIV" class="content">
		<p><font color="colorvalue">${errorMsg }</font></p>
	</div>
	
</body>
</html>
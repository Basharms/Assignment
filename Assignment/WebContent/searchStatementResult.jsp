<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<%@ include file="header.jsp" %>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome</title>
<style>
	table.empdata {
	  border-collapse: collapse;
	  border: 1px solid black;
	  table-layout: auto;
	  width: 70%;
	} 
	th, tr {
	  border: 1px solid black;
	}
	
	thead {
	  background-color: #cdebf9;
	}
	
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
</head>
<body>
	<form id="searchStatementForm" action="searchStatement">
		<table class="empdata">
			<tbody>
				<tr>
					<td>Account ID</td>
					<td>Date field</td>
					<td>Amount</td>
				</tr>
				<c:forEach var="stm" items="${searchResult}">
					<tr>
						<td><fmt:formatNumber type="number" value="${stm.accountId}"></fmt:formatNumber></td>
						<td><fmt:formatDate  type="date" dateStyle="medium" value="${stm.dateField.getTime()}"/> </td>
						<td><c:out value="${stm.amount}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<input type="submit" value="Back to Search" id="btn" name="btn">
		</div>
	</form>
</body>
</html>
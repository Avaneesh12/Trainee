<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>

<body>
	<div style="">
		<h1>Welcome to login page</h1>
		<table>
		<form:form action="getTrainee" method="post" modelAttribute="trainee">
		<tr>
					<td>Enter trainee id:</td>
					<td><form:input path="id" size="30" /></td>
					<td><form:errors path="id" cssClass="error" /></td>
				</tr>
				<tr>

<td><input type="submit" value="submit"/></td>
</tr>
		
		</form:form>
		
		</table>
	</div>
</body>
</html>
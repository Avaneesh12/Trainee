<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
</head>
<body>
		<table>
		<form:form action="updatePage" method="post" >
		<tr>
					<td>Enter your id:</td>
					<td><input type="text" name="id"/>
				</tr>
				<tr>
				<td>Enter your name:</td>
				<td><input type="text" name="traineeName"/></td>
				</tr>
				<tr>
              <tr>
				<td>Enter your Training-Location:</td>
				<td><input type="text" name="traineeLocation"/></td>
				</tr>
				<tr>
             <tr>
				<td>Enter your Training_domain:</td>
				<td><input type="text" name="traineeDomain"/></td>
				</tr>
				<tr>

<td><input type="submit" value="submit"/></td>
</tr>
</form:form>
</table>
</body>
</html>
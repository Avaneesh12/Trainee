<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Withdraw</title>
</head>
<body>
	<table>
		<form:form action="transferPage" method="post" >
		<tr>
					<td>Enter  Source Customer Mobile No:</td>
					<td><input type="text" name="sourceMobileNumber"/>
				</tr>
				<tr>
					<td>Enter  Target Customer Mobile No:</td>
					<td><input type="text" name="targetMobileNumber"/>
				</tr>
				<tr>
				<td>Enter withdraw amount:</td>
				<td><input type="text" name="amount"/></td>
				</tr>
				<tr>

<td><input type="submit" value="submit"/></td>
</tr>
</form:form>
</table>
</body>
</html>
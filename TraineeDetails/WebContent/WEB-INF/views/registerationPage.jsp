<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h1>Welcome to Registeration Page</h1>
		<table>
			<form:form action="registerTrainee" method="post"
				modelAttribute="trainee">
				<tr>
					<td>Trainee Name:</td>
					<td><form:input path="traineeName" size="30" /></td>
					<td><form:errors path="traineeName" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Trainee Location:</td>
					<td><form:input path="traineeLocation" size="30" /></td>
					<td><form:errors path="traineeLocation" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Trainee Domain:</td>
					<td><form:input path="traineeDomain" size="30" /></td>
					<td><form:errors path="traineeDomain" cssClass="error" /></td>
				</tr>
<tr>

<td><input type="submit" value="submit"/></td>
</tr>
			</form:form>
		</table>


	</div>
</body>
</html>
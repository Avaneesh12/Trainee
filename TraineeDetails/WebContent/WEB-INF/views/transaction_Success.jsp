<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><table border="1">
<tr>
<th colspan="4">Transaction details</th>
</tr>
<tr>
<th>EmployeeId</th>
<th>EmployeeName</th>
<th>EmployeeLocation</th>
<th>EmployeeDomain</th>
</tr>
<c:forEach   items="${list}" var="user">
<tr>
<td><c:out value="${user.id}"></c:out><br/></td>
<td><c:out value="${user.traineeName}"></c:out><br/></td>
<td><c:out value="${user.traineeLocation}"></c:out><br/></td>
<td><c:out value="${user.traineeDomain}"></c:out><br/></td>
</tr>
</c:forEach>
</table>
</body>
</html>
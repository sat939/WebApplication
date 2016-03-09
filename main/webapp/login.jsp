<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

<form action="login">
	<table align="center" border="5">
		<tr>
			<td colspan="2" align="center"> Student login </td>
		<tr>
		<tr>
		<c:if test="${not empty error}">
		<tr>
		<td colspan="2" align="center"><font color="red">${error}</font></td>
		<tr>
		</c:if>
		<tr>
		<tr>
			<td> User Name </td>
			<td><input type= "text" name= "username"/></td>
		<tr>
		<tr>
			<td> password </td>
			<td><input type="password" name="password"/></td>
		<tr>
		<tr>
			<td colspan="2" align="center"> <input type="submit" name="Login" value="Login"/> </td>
		<tr>
			
	</table>

</form>
</body>
</html>
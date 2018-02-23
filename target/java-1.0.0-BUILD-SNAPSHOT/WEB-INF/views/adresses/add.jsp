<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>adresses/add</title>
</head>
<body>
      <h3>Form to register adresses</h3>
	<form:form action="adresses/add" method="post" modelAttribute="adress">
		<table>
			<tr>
				<td><form:label path="town">Town:</form:label></td>
				<td><form:input path="town" /></td>
			</tr>
			<tr>
				<td><form:label path="street">Street:</form:label></td>
				<td><form:input path="street" /></td>
			</tr>
			<tr>
				<td><form:label path="creation">Creation date:</form:label></td>
				<td><form:input path="creation"/>
			</tr>
			<tr><td><input type="submit" value="Send"></td></tr>
		</table>		
	</form:form>
</body>
</html>
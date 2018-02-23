<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
 <c:forEach items="${employees}" var="employee">
        <c:out value="${employee.name}"/>
    </c:forEach>
</body>
</html>

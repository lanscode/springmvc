<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="index" method="post">
       Name: <input type="text" name="name"><br/>
       Adress:
       <select name="adress">
       <c:forEach items="${adresses}" var="adr">
           <option value="<c:out value="${adr.id}"/>"><c:out value="${adr.town}"/>,<c:out value="${adr.street}"/></option>
        </c:forEach>
        
       </select><br/>
       <input type="submit" value="send">
    </form>
</body>
</html>
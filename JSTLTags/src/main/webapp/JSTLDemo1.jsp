<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="VIKAS"> </c:set>
<c:out value="${name }"></c:out>

<br>
<c:set var="college" value="pes"> </c:set>
<c:out value="${college }"></c:out>

<p>before remove city</p>
<c:set var="city" value="mysore"> </c:set>
${city }
<c:remove var="city"/>
<p>after remove city</p>
${city }
</body>
</html>
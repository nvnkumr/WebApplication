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

<c:set var="name" value="ramesh">
</c:set>
<c:out value="${name }"></c:out>

<br>

<c:set var="tools" value="python"></c:set>
${tools }



</body>
</html>
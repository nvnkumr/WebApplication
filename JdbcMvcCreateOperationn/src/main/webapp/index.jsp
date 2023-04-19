<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> A Web Application in MVC Design Pattern |JDBC| CRUD Operation</h1>  
<a href="<%= request.getContextPath() %>/InsertData?page=inserdata"> CREAT Operation</a>
<br>
<a href="<%= request.getContextPath() %>/RetriveData?page=retrivedata"> Retrieve Data</a>
<br>
<a href="<%= request.getContextPath() %>/UpdateData?page=update"> update Data</a>
<br>
<a href="<%= request.getContextPath() %>/DeleteData?page=delete"> Delete Data</a>

</body>
</html>
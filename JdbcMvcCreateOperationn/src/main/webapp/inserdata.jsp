<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./InsertData" method="post">
<p>enter id:</p>
<!-- Create an element with mandatory name attribute,
so that data can be transfer to the servlet using getParameter()  -->
<input type="text" name="sid"/>
<br/>
<p>enter name:</p>
<input type="text" name="sname"/>
<br/><br/><br/>
<input type="submit"/>
</form>

</body>
</html>
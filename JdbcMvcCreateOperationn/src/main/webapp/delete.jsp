<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./DeleteData" method="post">
<h1>Click on submit to perform delete operation</h1>
<p>enter id:</p>
<!-- Create an element with mandatory name attribute,
so that data can be transfer to the servlet using getParameter()  -->
<input type="text" name="sid"/>
<br/>
<input type="submit"/>
</form>

</body>
</html>
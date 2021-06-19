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
<h4>You must train harder!</h4>
<h4>What is The code</h4>
<form action="/codex" method="post">
<input type="text" name="code">
 <input type="submit" value="Try it now">
 
</form>
<c:out value="${error}"/>

</body>
</html>
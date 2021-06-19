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
<ul>
    <h3> Submited info </h3><br> <br>
    <p> name :   <c:out value="${name}"/></p>
    <p>Dojco Location : <c:out value="${location}"/></p>
    <p>Language : <c:out value="${lang}"/></p>
    <p> Comment : <c:out value="${comment}"/></p>

    <form action='/' method='post'>
        <input type='submit' value='Go back'>
    </form>
</ul>
</body>
</html>
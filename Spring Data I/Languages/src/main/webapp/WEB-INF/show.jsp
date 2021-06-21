<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1><c:out value="${languages.id}"/></h1>
<p>Name: <c:out value="${languages.name}"/></p>
<p>Creator: <c:out value="${language.version}"/></p>
<p>Version: <c:out value="${language.version}"/></p>
<a href="/edit/${languages.id}">Edit Book</a>
<form action="/delete/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>
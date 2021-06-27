<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
     <%@ page isErrorPage="true" %>  
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
<h1>New Product</h1>


<form:form action="/product/new" method="post" modelAttribute="proudct">
    <p>
    
         
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>

   <p>
    
         
        <form:label path="description">description</form:label>
        <form:errors path="description"/>
        <form:input type="textarea" path="description"/>
    </p>
       <p>
    
         
        <form:label path="price">price</form:label>
        <form:errors path="price"/>
        <form:input path="price"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>    

</body>
</html>
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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
 <h1>name: <c:out value="${category.name}"/></h1>
<form action="/category/update" method="post" >
    
    <p>
     
       
        <input type="hidden" value="${category.id}" name="id"/>
        </p>
   <p>
    
         
        <label>categories</label>
        
        <select name="product">
   		
   		<c:forEach items="${product}" var="categor">
     	<option value="${categor.id}"><c:out value="${categor.name}"/> </option>
        </c:forEach>
		</select>
    </p>

 
    <input type="submit" value="Submit"/>
</form>    
  <p>product</p>
<c:forEach items="${category.products}" var="product">
     	<p><c:out value="${product.name}"/> </p>
        </c:forEach>

</body>
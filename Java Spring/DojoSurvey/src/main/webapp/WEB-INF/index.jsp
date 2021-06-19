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
 <form action='/result' method='post'>
    Name: <input type='text' name='name'>
    <br><br>
    <label for="Location">Dojo Location :</label>
    <select id="location" name="location">
    <option value="Palestine">Palestine</option>
    <option value="Jordan">Jordan</option>
    <option value="San jose">San jose</option>
    
    </select>
    <br><br>
    <label for="lang">Dojo Language :</label>
    <select id="lang" name="lang">
    <option value="Java">Java</option>
    <option value="Python">Python</option>
    <option value="C++">C++</option>
    
    </select>
    <br>
    Comment (optional) : <br>
    <input type="text" name="text"><br><br>
    <input type='submit' value='create user'>
</form>


</body>
</html>
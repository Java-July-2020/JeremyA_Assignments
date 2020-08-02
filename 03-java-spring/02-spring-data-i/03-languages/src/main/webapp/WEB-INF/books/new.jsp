<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 	<link rel="stylesheet" type="text/css" href="css/resultstyle.css"> -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head> 
<body>
<h1>New Book</h1>
<form:form action="/books" method="post" modelAttribute="book">
    <h1>
        <form:label path="title">Title: <c:out value="${book.title}"/></form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </h1>
    <p>
        <form:label path="description">Description: <c:out value="${book.description}"/></form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="language">Language: <c:out value="${book.language}"/></form:label>
        <form:errors path="language"/>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages">Pages: <c:out value="${book.numberOfPages}"/></form:label>
        <form:errors path="numberOfPages"/>     
        <form:input type="number" path="numberOfPages"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
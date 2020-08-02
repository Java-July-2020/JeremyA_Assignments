<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
        <title></title>
        <!-- <link rel="stylesheet" type="text/css" href="css/style.css"> -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book" varStatus="loop">
		<tr>    
		    <td><c:out value="${book.title}"/></td>
		    <td><c:out value="${book.description}"/></td>
		    <td><c:out value="${book.language}"/></td>
		    <td><c:out value="${book.numberOfPages}"/></td>
		    <td><a href="/books/delete/${loop.index}">Delete</a></td>
		</tr>
		</c:forEach>
    </tbody>
</table>
<a href="/books/new">New Book</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- <link rel="stylesheet" type="text/css" href="css/resultstyle.css"> -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
	<h1>Show Book</h1>
	<p><c:out value="${book.title}"/></p>
	<p><c:out value="${book.description}"/></p>
	<p><c:out value="${book.language}"/></p>
	<p><c:out value="${book.numberOfPages}"/></p>
</body>
</html>
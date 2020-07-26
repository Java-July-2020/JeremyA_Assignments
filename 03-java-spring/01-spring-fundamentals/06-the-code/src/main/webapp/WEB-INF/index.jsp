<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<form id="form" action="/attempt" method="post">
		<span><c:out value="${ error }" /></span>
		<hr>
		<input type="text" name="guess" placeholder="What is the code?" />
		<hr>
		<button>GUESS</button>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/counterstyle.css">
</head>
<body>
	<h3>You have visited<a href="/"> The Welcome Site </a><c:out value="${count}"/> times...</h3>
	<h3><a href="/">Test Another Visit</a></h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/codestyle.css">
</head>
<body>
	<ul>
	<c:forEach items="${ tenets }" var="tenet">
		<li><c:out value="${ tenet }"/></li>	
	</c:forEach>
	</ul>
</body>
</html>
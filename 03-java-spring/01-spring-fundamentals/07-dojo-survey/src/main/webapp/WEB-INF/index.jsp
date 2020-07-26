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
	<h1>Dojo Survey</h1>
	<hr />
	<form action="/survey" method="post">
		<div class="form-group">
			<label for="name">Your Name</label>
			<input type="text" name="name" id="name" />
		</div>
		<div class="form-group">
			<label for="location">Dojo Location</label>
			<select name="location" id="location">
			<c:forEach items="${ locations }" var="loc">
				<option value="<c:out value='${ loc }'/>"><c:out value='${ loc }'/></option>
			</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="language">Favorite Language</label>
			<select name="language" id="location">
			<c:forEach items="${ languages }" var="lang">
				<option value="<c:out value='${ lang }'/>"><c:out value='${ lang }'/></option>
			</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="comment">Comment</label>
			<textarea name="comment" id="comment" cols="30" rows="10"></textarea>
		</div>
		<button>Send</button>
	</form>
</body>
</html>
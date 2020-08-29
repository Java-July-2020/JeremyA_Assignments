<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/main.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
    integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
    crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Course Creation</title>
</head>
<body>
	<div id="wrapper">
		<h2>Create New Course</h2>
			<form:form action="/courses" method="post" modelAttribute="newCourse">
				<form:hidden value="${ user.name }" path="name"/>
				<div class="form-group">
					<form:label path="name">Name</form:label>
					<form:errors path="name"></form:errors>
					<form:input class="form-control" path="name"></form:input>
				</div>
				<div class="form-group">
					<form:label path="instructor">Instructor</form:label>
					<form:errors path="instructor"></form:errors>
					<form:input class="form-control" type="instructor" path="instructor"></form:input>
				</div>
				 <div class="form-group">
			        <form:label path="capacity">Capacity</form:label>
			        <form:errors path="capacity"/>
			        <form:input class="form-control" path="capacity" />
			    </div>
			    	<input type="submit" value="Create Course"/>
		</form:form>
	</div>
</body>
</html>
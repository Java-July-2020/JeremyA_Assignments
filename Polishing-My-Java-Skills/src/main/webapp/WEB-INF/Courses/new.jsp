<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Course Creation</title>
</head>
<body>
	<div class="container">
		<h2>Create New Course</h2>
			<form:form action="/courses/" method="post" modelAttribute="course">
				<input type="hidden" name="_method" value="put">
				<form:hidden value="${ userId }" path="user"/>
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
			    <button>Create Course</button>
		</form:form>
	</div>
</body>
</html>
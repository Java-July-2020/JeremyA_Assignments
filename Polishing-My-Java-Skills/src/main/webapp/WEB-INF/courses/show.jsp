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
		<meta charset="ISO-8859-1">
	<title>Course</title>
</head>
	<body>
		<div class="container">
			<h2>${ course.name }</h2>
			<div class="event-details-side">
				<h4><strong>Instructor:</strong> ${ course.instructor }</h4>
				<h4><strong>Sign Ups:</strong> ${ course.capacity }</h4>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Sign Up Date</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ course.users }" var="user">
						<tr>
							<td>${ user.name }</td>
							<td>${ user.createdAt }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>
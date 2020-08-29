<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="/css/main.css">	
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet" >
		<meta charset="ISO-8859-1">
	<title>Courses</title>
</head>
	<body>
		<div id="wrapper">
			<h2>Welcome, ${ user.name }</h2>
			<hr/>
			<div class="float float-left">
				<h3>Courses</h3>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Course</th>
							<th>Instructor</th>
							<th>Sign-ups</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
							<c:choose>
								<c:when test="${course.id == null}">
									<p>No Course Available</p>
								</c:when>
								<c:otherwise>
									<a href="/courses/${ course.id }">${ course.name }</a>
								</c:otherwise>
							</c:choose>
							</td>
							<td>${ course.instructor }</td>
							<td>
							<c:choose>
								<c:when test="${course.capacity == 0}">
									<p></p>
								</c:when>
								<c:otherwise>
									<p>${ course.capacity }</p>
								</c:otherwise>
							</c:choose>
							</td>
							<td>
							<c:choose>
								<c:when test="${ course.id == true }">
								<a href="/courses/${ course.id }/a/add">Add</a>	
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${course.capacity > 10}">
										<p>FULL</p>
										</c:when>
										<c:otherwise>
											<p></p>							
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</tbody>
				</table>
				<form action="/courses/new">
					<input type="submit" value="Create New Course"/>
				</form>
			</div>
		</div>
	</body>
</html>
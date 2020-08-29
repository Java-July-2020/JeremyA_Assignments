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
	<title>Courses</title>
</head>
	<body>
		<div class="container">
			<h2>Welcome, ${ user.name }</h2>
			<hr/>
			<div class="float float-left" action="/" method="post" modelAttribute="newCourse">
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
							<td><a href="/courses/${ course.id }">${ course.name }</a></td>
							<td>${ course.instructor }</td>
							<td>${ course.capacity }</td>
							<td>
							<c:choose>
								<c:when test="${course.capacity == course.capacity}">
								<p>FULL</p>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${ course.capacity != course.capacity }">
											<a href="/courses/${ course.id }/a/add">Add</a>	
										</c:when>
										<c:otherwise>
											<p>Already Added</p>							
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
							</td>
						</tr>
					</tbody>
				</table>
				<input type="submit" value="Add A Course"/>
			</div>
		</div>
	</body>
</html>
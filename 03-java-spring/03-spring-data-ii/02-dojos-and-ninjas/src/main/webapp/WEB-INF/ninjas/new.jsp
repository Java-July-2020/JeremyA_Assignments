<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Dojos & Ninjas</title>
</head>
<body>
	<div class="container">
		<h1>Dojos & Ninjas</h1>
		<hr />
		<h2>Add a Ninja</h2>
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<div class="form-group">
		        <form:label path="ninja">Ninja Name</form:label>
		        <form:errors path="ninja"/>
		        <form:select class="form-control" path="ninja">
		        <c:forEach items="${ ninjas }" var="ninj">
		        	<option value="${ ninja.id }">${ ninja.name }</option>
		        	<!--Might need to reformat above two lines  -->
		        </c:forEach>
		        </form:select>
		    </div>
		    <div class="form-group">
		        <form:label path="firstName">First Name</form:label>
		        <form:errors path="firstName"/>
		        <form:input class="form-control" path="firstName"/>
		    </div>
		    <div class="form-group">
		        <form:label path="lastName">Last Name</form:label>
		        <form:errors path="lastName"/>
		        <form:input class="form-control" path="lastName"/>
		    </div>
		    <div class="form-group">
		        <form:label path="age">Age</form:label>
		        <form:errors path="age"/>
		        <form:input class="form-control" path="age"/>
		    </div>
		    <button>Add Ninja</button>
		</form:form>
	</div>
</body>
</html>
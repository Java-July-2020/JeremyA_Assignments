<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<title>Questions Dashboard</title>
</head>
<body>
	<div class="container">
		<h1>${ question.question }?</h1>
		<h3>Tags:</h3>
		<ul>
		<c:forEach items="${ question.tags }" var="tag">
			<li>${ tag.subject }</li>
		</c:forEach>
		</ul>
		<h3>Answers:</h3>
		<ul>
		<c:forEach items="${ question.answers }" var="answer">
			<li>${ answer.answer }</li>		
		</c:forEach>
		</ul>
		<hr />
		<h3>Add your answer:</h3>
		<form:form action="/answers" method="post" modelAttribute="ans">
			 <div class="form-group">
		        <form:label path="answer">Answer</form:label>
		        <form:errors path="answer"/>
		        <form:textarea class="form-control" path="answer"></form:textarea>
		    </div>
		    <form:hidden path="question" value="${ question.id }"/>
		    <button class="btn btn-primary">Answer it!</button>
		</form:form>
	</div>
</body>
</html>
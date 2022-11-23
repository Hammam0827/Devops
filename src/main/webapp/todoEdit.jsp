<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>To do list Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>To do list</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-light">
		<div>
			<a class="navbar-brand"> Todo list Application </a>
		</div>
		<ul class="navbar-nav">
			<li><a
				href="<%=request.getContextPath()%>/TodoServlet/dashboard"
				class="nav-link">Back to Dashboard</a></li>
		</ul>
	</nav>
	<div class="container col-md-6">
		<div class="card">
			<div class="card-body">
				<c:if test="${todo != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${todo == null}">
					<form action="insert" method="post">
				</c:if>
				<caption>
					<h2>
						<c:if test="${todo != null}">
Edit Todo
</c:if>
						<c:if test="${todo == null}">
Add New Todo
</c:if>
					</h2>
				</caption>
				<c:if test="${todo != null}">
					<input type="hidden" name="oriTodo"
						value="<c:out
value='${todo.todo}' />" />
				</c:if>
				<fieldset class="form-group">
					<label>To do</label> <input type="text"
						value="<c:out
value='${todo.todo}' />" class="form-control"
						name="todo" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Description</label> <input type="text"
						value="<c:out
value='${todo.description}' />" class="form-control"
						name="description">
				</fieldset>
				<fieldset class="form-group">
					<label>Due Date</label> <input type="date"
						value="<c:out
value='${todo.date}' />" class="form-control"
						name="date">
				</fieldset>
				<fieldset class="form-group">
					<label> Set Time</label> <input type="time"
						value="<c:out
value='${todo.time}' />" class="form-control"
						name="time">
				</fieldset>
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
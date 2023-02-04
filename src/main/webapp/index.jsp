<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>To do list</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<meta charset="utf-8">
<style type="text/css">
  <%@include file="css/mystyle.css" %>
</style>
</head>
<body>
	<!-- Include top navigation here -->
	<div><jsp:include page="top-navigation.jsp" /></div>
	<!-- This is the container that holds the initial message, heading, and movies -->
<div class="row">
<div class="container">
<br>
<h3 class="text-center"><b>My ToDo List</b></h3>
<hr>
<div class="container text-left">
<!-- Add new user button redirects to the register.jsp page -->
<a href="<%=request.getContextPath()%>/create.jsp" class="button button1">Add New To do list</a>
</div>
<br>
<!-- Create a table to list out all current users information -->
<table class="table">
<thead>
<tr>
<th>To do</th>
<th>Description</th>
<th>Date</th>
<th>Time</th>
<th>Actions</th>
</tr>
</thead>
<!-- Pass in the list of users receive via the Servlet’s response to a loop
-->
<tbody>
<c:forEach var="todo" items="${listTodo}">
<!-- For each user in the database, display their
information accordingly -->
<tr>
<td>
<c:out value="${todo.todo}" />
</td>
<td>
<c:out value="${todo.description}" />
</td>
<td>
<c:out value="${todo.date}" />
</td>
<td>
<c:out value="${todo.time}" />
</td>
<!-- For each user in the database, Edit/Delete
buttons which invokes the edit/delete functions -->
<td>
<a href="edit?todo=<c:out value='${todo.todo}'
/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="delete?todo=<c:out
value='${todo.todo}' />">Delete</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
<blockquote> Be productive today! </blockquote>
</div>
</div>
	<!-- Include the message modal here -->
	<div><jsp:include page="message-modal.jsp" /></div>
	<div><jsp:include page="login-modal.jsp" /></div>
	<div><jsp:include page="register-modal.jsp" /></div>
	<br>
	<br>
	<!-- Include the footer here -->
	<div><jsp:include page="footer.jsp"  /></div> 
</body>
<script src="https://www.w3schools.com/lib/w3.js"></script>
<script>
	//to bring in other HTML on the fly into this page
	w3.includeHTML();
</script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://kit.fontawesome.com/86ec7c1143.js"></script>
</html>
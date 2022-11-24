<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<style type="text/css">
  <%@include file="css/mystyle.css" %>
</style>
<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: white; 
  color: black; 
  border-radius: 4px;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #4CAF50;
  color: white;
  border-radius: 4px;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 50px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>

<meta charset="ISO-8859-1">
<title>To do list</title>
</head>
<body>
<div><jsp:include page="top-navigation.jsp" /></div>
<br>

<h1 class="text-center"><b>Create a ToDo List</b></h1>
<br>
<div class="container">
  <form action ="CreateServlet" method="post">
  <div class="row">
    <div class="col-25">
      <label for="ftitle">Title</label>
    </div>
    <div class="col-75">
      <input type="text" id="ftite" name="todo" placeholder="title...">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="ldescription">Description</label>
    </div>
    <div class="col-75">
      <input type="text" id="ldescription" name="description" placeholder="description...">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="date">Due date</label>
    </div>
    <div class="col-75">
      <input type="date" id="ldate" name="date" placeholder="date...">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="subject">Select Time</label>
    </div>
    <div class="col-75">
      <input type="time" id="ltime" name="time" placeholder="time...">
    </div>
  </div>
  <br>
  <div class="row">
    <input type="submit" value="Call Servlet">
    <a href="<%=request.getContextPath()%>/TodoServlet/dashboard" class="button button2">Back</a>
  </div>
  </form>
</div>

<!-- Include the message modal here -->
	<div><jsp:include page="message-modal.jsp" /></div>
	<div><jsp:include page="login-modal.jsp" /></div>
	<div><jsp:include page="register-modal.jsp" /></div>
	<div><jsp:include page="success-modal.jsp" /></div>
	<div><jsp:include page="fail-modal.jsp" /></div>
	<br>
	<br>
	
	

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



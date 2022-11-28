<%
if (session.getAttribute("name")==null){
	response.sendRedirect("login.jsp");
}
%>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
	<a class="navbar-brand" href="#"> <img
		src="${pageContext.request.contextPath}/images/productivity.jpg" width="30" height="30"
		class="d-inline-block align-top" alt=""> Tunnel Vision
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav">
			<li class="nav-item" id="aboutMenu"><a class="nav-link" href="#"
				id="about" data-toggle="modal" data-target="#messageModal">
					About </a></li>
		</ul>

		<ul class="navbar-nav ml-auto nav-flex-icons">
		<li class="nav-item mx-0 mx-lg-1 bg-danger"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="<%=request.getContextPath()%>/login.jsp">Logout</a></li>
					<li class="nav-item mx-0 mx-lg-1 bg-danger"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="<%=request.getContextPath()%>/login.jsp"><%=session.getAttribute("name") %></a></li>	
		</ul>


	</div>
</nav>
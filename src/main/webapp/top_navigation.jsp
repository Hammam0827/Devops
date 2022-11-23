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
			<li class="nav-item" id="registerMenu"><a class="nav-link"
				href="#" id="register" data-toggle="modal"
				data-target="#registerModal"> Register</a></li>
				
			<li class="nav-item" id="loginMenu"><a class="nav-link" href="#"
				id="login" data-toggle="modal" data-target="#loginModal"> Login</a>
			</li>
			
		</ul>


	</div>
</nav>
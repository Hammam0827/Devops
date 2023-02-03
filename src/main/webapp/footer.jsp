<footer id="contact-us" class="text-center text-lg-start text-white"
	style="background-color: rgb(49, 49, 49)">
	<div class="container p-4 pb-0">
		<section class="">
			<div class="row">
				<div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
					<h6 class="text-uppercase mb-4 font-weight-bold">Tunnel Vision
					</h6>
					<p>Be productive with your time, create a todo list today with
						tunnel vision!</p>
				</div>

				<div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
					<h6 class="text-uppercase mb-4 font-weight-bold">Contact Us</h6>
					<!-- <form action="https://formspree.io/f/moqbobyr" method="POST">
						<label> Your email: <input type="email" name="User Email"> </label> 
						<label for="Reason for Feedback">Reason for Feedback</label> <select
							name="Reason for Feedback" id="Reason for Feedback" required="">
							<option value="" selected="" disabled="">Select</option>
							<option value="Bugs">Bugs</option>
							<option value="Complaint">Complaint</option>
							<option value="What can be improved">What can be improved</option>
						</select>
						<label> Your message: <textarea name="User Message"></textarea>
						</label>
						<button type="submit">Send</button>
					</form> -->
					<form action="sendFeedback" method="post">
					<label for="name">Name:</label>
					<input type="text" id="name" name="name"><br><br>
					<label for="email">Email:</label>
					<input type="text" id="email" name="email"><br><br>
					<label for="subject">Subject:</label>
					<input type="text" id="subject" name="subject"><br><br>
					<label for="message">Message:</label>
					<textarea id="message" name="message"></textarea><br><br>
					<input type="submit" value="Submit">
					</form>
				</div>

			</div>
		</section>

		<hr class="my-3">

		<section class="p-3 pt-0">
			<div class="row d-flex align-items-center">
				<div class="col-md-7 col-lg-8 text-center text-md-start"></div>
			</div>
		</section>
	</div>
</footer>
package devops_project;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import com.dvops.maven.eclipse.User;


class UserTest {
	
protected String name;
protected String password;
protected String email;
protected String language;

	
	public void User(String name, String password, String email, String language) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.language = language;
	}
	
	@BeforeEach
	void setUp() throws Exception {
		name = "admin";
		password = "test";
		email = "hello@gmail.com";
		language = "english";
	}


	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testUser() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		Assert.assertTrue(user.getName() == "admin");
	}
	

	@Test
	void testGetName() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		Assert.assertTrue(user.getName() == "admin");
		return;
	}	

	@Test
	void testSetName() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		user.setName("ok");
		equals(user.getName());
	}

	@Test
	void testGetPassword() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		Assert.assertTrue(user.getPassword() == "test");
	}

	@Test
	void testSetPassword() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		user.setPassword("ok");
		equals(user.getPassword());
	}

	@Test
	void testGetEmail() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		Assert.assertTrue(user.getEmail() == "hello@gmail.com");
	}

	@Test
	void testSetEmail() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		user.setEmail("ok");
		equals(user.getEmail());
	}
	

	@Test
	void testGetLanguage() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		Assert.assertTrue(user.getLanguage() == "english");
	}

	@Test
	void testSetLanguage() {
		User user = new User ("admin", "test","hello@gmail.com","english");
		user.setLanguage("english");
		equals(user.getLanguage());
	}
}

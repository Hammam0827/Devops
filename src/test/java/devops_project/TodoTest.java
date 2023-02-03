package devops_project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import com.dvops.maven.eclipse.Todo;

class TodoTest {
	
protected String todo;
protected String description;
protected String date;
protected String time;
	
public void Todo(String todo, String description, String date, String time) {
	this.todo = todo;
	this.description = description;
	this.date = date;
	this.time = time;
}
	
	@BeforeEach
	void setUp() throws Exception {
		todo = "study";
		description = "important";
		date = "10-10-22";
		time = "10:32pm";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTodo() {
		
	}

	@Test
	void testGetTodo() {
		Todo todo = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(todo.getTodo() == "study");
	}

	@Test
	void testSetTodo() {
		Todo todo = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(todo.getTodo() == "study");
	}

	@Test
	void testGetDescription() {
		Todo description = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(description.getDescription() == "important");
	}

	@Test
	void testSetDescription() {
		Todo description = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(description.getDescription() == "important");
	}

	@Test
	void testGetDate() {
		Todo date = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(date.getDate() == "10-10-22");
	}

	@Test
	void testSetDate() {
		Todo date = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(date.getDate() == "10-10-22");
	}

	@Test
	void testGetTime() {
		Todo time = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(time.getTime() == "10:32pm");
	}

	@Test
	void testSetTime() {
		Todo time = new Todo ("study", "important", "10-10-22", "10:32pm");
		Assert.assertTrue(time.getTime() == "10:32pm");
	}

}

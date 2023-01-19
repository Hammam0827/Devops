package devops_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import todo.Todo;

class TodoTest {
	
	private Todo td;
	private String todo;
	private String description;
	private String date;
	private String time;
	
	public void Todo(String todo, String description, String date, String time) {
		this.todo = todo;
		this.description = description;
		this.date = date;
		this.time = time;
	}
	

	
	@BeforeEach
	void setUp() throws Exception {
		todo = "work";
		description = "important";
		date = "10-12-22";
		time = "10:23pm";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTodo() {
		return;
	}

	@Test
	void testGetTodo() {
		//fail("Not yet implemented");
		return;
	}

	@Test
	void testSetTodo() {
		//fail("Not yet implemented");
		return;
		
	}

	@Test
	void testGetDescription() {
		return;
	}

	@Test
	void testSetDescription() {
		return;
	}

	@Test
	void testGetDate() {
		return;
	}

	@Test
	void testSetDate() {
		return;
	}

	@Test
	void testGetTime() {
		return;
	}

	@Test
	void testSetTime() {
		return;
	}

}

package com.dvops.maven.eclipse;

public class Todo {
	protected String todo;
	
	public Todo(String todo, String description, String date, String time) {
		super();
		this.todo = todo;
		this.description = description;
		this.date = date;
		this.time = time;
	}
	
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	protected String description;
	protected String date;
	protected String time;

}

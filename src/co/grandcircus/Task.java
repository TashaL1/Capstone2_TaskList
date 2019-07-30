package co.grandcircus;

import java.time.LocalDate;

public class Task {

	private String name;
	private String description;
	private LocalDate dueDate;
	private boolean completed;
	
	public Task() {
		super();
		
		
	}

	public Task(String name, String description, LocalDate dueDate) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Task name=" + name + ", description=" + description + ", dueDate=" + dueDate + ", completed="
				+ completed;
	}
	
}

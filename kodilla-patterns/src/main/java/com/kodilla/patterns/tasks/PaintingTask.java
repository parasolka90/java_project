package com.kodilla.patterns.tasks;

import java.util.HashSet;
import java.util.Set;

public class PaintingTask implements Task {
	final String taskName;
	final String color;
	final String whatToPaint;
	boolean executed;
	
	public PaintingTask(final String taskName,final String color, final String whatToPaint) {	
		this.taskName = taskName;
		this.color = color;
		this.whatToPaint = whatToPaint;
		this.executed = false;
	}

	@Override
	public void executeTask() {
		executed = true;
		System.out.println("Executing Painting task...");
	}

	@Override
	public String getTaskName() {
		return taskName;
	}

	@Override
	public boolean isTaskExecuted() {
	return executed;
	}
}

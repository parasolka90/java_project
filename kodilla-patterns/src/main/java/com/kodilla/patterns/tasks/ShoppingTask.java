package com.kodilla.patterns.tasks;

import java.util.HashSet;
import java.util.Set;

public final class ShoppingTask implements Task {
	final String taskName;
	final String whatToBuy;
	final double qunatity;
	boolean executed;
	
	public ShoppingTask(final String taskName,final String whatToBuy, final double qunatity) {	
		this.taskName = taskName;
		this.whatToBuy = whatToBuy;
		this.qunatity = qunatity;
		this.executed=false;
	}

	@Override
	public void executeTask() {
		executed =true;
		System.out.println("Executing Shopping task...");
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

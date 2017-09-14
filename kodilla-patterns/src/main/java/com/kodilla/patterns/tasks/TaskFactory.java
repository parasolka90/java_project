package com.kodilla.patterns.tasks;

public final class TaskFactory {
	public static final String DRIVINGTASK = "DRIVINGTASK";
	public static final String PAINTINGTASK = "PAINTINGTASK";
	public static final String SHOPPINGTASK = "SHOPPINGTASK";

	public final Task makeTask(final String taskClass) {
		switch(taskClass) {
		case DRIVINGTASK:
			return new DrivingTask("DrivingTask", "where", "using");
		case PAINTINGTASK:
			return new PaintingTask("PaintingTask","color","whatToPaint");
		case SHOPPINGTASK:
			return new ShoppingTask("ShoppingTask","whatToBuy",11.5);
		default:
			return null;
		}
		
	}

}


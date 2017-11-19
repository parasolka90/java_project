package com.kodilla.patterns2.observer.homework;

public abstract class TaskObserver {
    private final String name;
    private int updateCount;

    public TaskObserver(String name) {
        this.name = name;
    }

    public void update(TaskQueue taskQueue) {
        System.out.println("Dear "+getName() + ": new task was added to the " + taskQueue.getName() +"!"+ "\n" +
                "->task: " + taskQueue.getTasks().getLast() + "\n" +
                "(total: " + taskQueue.getTasks().size() + " tasks to check)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
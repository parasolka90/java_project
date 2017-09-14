package com.kodilla.patterns.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    boolean executed;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executed = false;
    }

    @Override
    public void executeTask() {
        executed = true;
        System.out.println("Executing Driving task...");
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


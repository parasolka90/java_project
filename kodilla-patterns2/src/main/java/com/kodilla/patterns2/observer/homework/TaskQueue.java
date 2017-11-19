package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements TasksObservable {
    private final String name;
    private final List<TaskObserver> taskObservers;
    private final Deque<String> tasks;

    public TaskQueue(String name) {
        this.name = name;
        tasks = new ArrayDeque<>();
        taskObservers = new ArrayList<>();
    }

    public void addTask(String task) {
        if (!tasks.contains(task)) {
            tasks.addLast(task);
            notifyTaskObservers();
        }
    }

    @Override
    public void registerTaskObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void notifyTaskObservers() {
        for (TaskObserver taskObserver : taskObservers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeTaskObserver(TaskObserver taskObserver) {
        taskObservers.remove(taskObserver);
    }

    public String getName() {
        return name;
    }

    public Deque<String> getTasks() {
        return tasks;
    }
}

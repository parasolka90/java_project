package com.kodilla.patterns2.observer.homework;

public interface TasksObservable {
    void registerTaskObserver(TaskObserver taskObserver);
    void notifyTaskObservers();
    void removeTaskObserver(TaskObserver taskObserver);
}

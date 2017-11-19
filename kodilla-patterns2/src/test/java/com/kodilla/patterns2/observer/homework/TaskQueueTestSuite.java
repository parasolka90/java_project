package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        JavaMentor javaMentor = new JavaMentor("Java Mentor");
        JsMentor jsMentor = new JsMentor("JavaScript Mentor");
        TaskQueue student1Queue = new JavaQueue();
        TaskQueue student2Queue = new JavaQueue();
        TaskQueue student3Queue = new JsQueue();
        student1Queue.registerTaskObserver(javaMentor);
        student2Queue.registerTaskObserver(javaMentor);
        student3Queue.registerTaskObserver(jsMentor);

        //When
        student1Queue.addTask("Task 1");
        student1Queue.addTask("Task 2");
        student2Queue.addTask("Task 15");
        student3Queue.addTask("Task 12");
        student3Queue.addTask("Task 5");
        //Then
        Assert.assertEquals(3, javaMentor.getUpdateCount());
        Assert.assertEquals(2, jsMentor.getUpdateCount());
    }

    @Test
    public void testNoDuplicatedTasks() {
        //Given
        JavaMentor javaMentor = new JavaMentor("Java Mentor");
        TaskQueue student1Queue = new JavaQueue();
        student1Queue.registerTaskObserver(javaMentor);
        //When
        student1Queue.addTask("Task 1");
        student1Queue.addTask("Task 2");
        int totalTasks = student1Queue.getTasks().size();
        //Then
        Assert.assertEquals(2, totalTasks);
    }

    @Test
    public void testQueueOrder() {
        //Given
        JavaMentor javaMentor = new JavaMentor("Java Mentor");
        TaskQueue student1Queue = new JavaQueue();
        student1Queue.registerTaskObserver(javaMentor);
        //When
        student1Queue.addTask("Task 1");
        student1Queue.addTask("Task 2");
        student1Queue.addTask("Task 3");
        //Then
        Assert.assertEquals("Task 1", student1Queue.getTasks().getFirst());
    }
}

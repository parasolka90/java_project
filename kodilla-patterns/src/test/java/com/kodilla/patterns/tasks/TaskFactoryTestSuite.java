package com.kodilla.patterns.tasks;


import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivenTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driven = factory.makeTask(TaskFactory.DRIVINGTASK);
        driven.executeTask();
        //Then
        Assert.assertEquals(true, driven.isTaskExecuted());
        Assert.assertEquals("DrivingTask",driven.getTaskName());

    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("PaintingTask",painting.getTaskName());
    }
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("ShoppingTask", shopping.getTaskName());
    }
}

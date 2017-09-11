package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList doList = board.getToDoList();
        doList.addTask("taskA");
        TaskList inProgressList = board.getInProgressList();
        inProgressList.addTask("taskB");
        TaskList doneList = board.getDoneList();
        doneList.addTask("taskC");

        //Then
        Assert.assertEquals(4,doList.sizeList());
        Assert.assertEquals("taskA",doList.getTask(doList.sizeList()-1));

        Assert.assertEquals(2,inProgressList.sizeList());
        Assert.assertEquals("taskB",inProgressList.getTask(inProgressList.sizeList()-1));

        Assert.assertEquals(2,doneList.sizeList());
        Assert.assertEquals("taskC",doneList.getTask(doneList.sizeList()-1));
    }
}

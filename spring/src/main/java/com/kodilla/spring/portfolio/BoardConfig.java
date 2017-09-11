package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("to do list")
    TaskList toDoList;

    @Autowired
    @Qualifier("in progress list")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("done list")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "to do list")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList("task2","task3","task4");
    }

    @Bean(name = "in progress list")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList("task5");
    }

    @Bean(name = "done list")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList("task1");
    }
}

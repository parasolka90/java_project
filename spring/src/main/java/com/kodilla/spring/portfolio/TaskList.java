package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(String ... list) {
       tasks=new ArrayList<>(Arrays.asList(list));
    }
    public List<String> getTasks() {
        return tasks;
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public String getTask(int x){
       return tasks.get(x);
    }
    public int sizeList() {
        return tasks.size();
    }
}

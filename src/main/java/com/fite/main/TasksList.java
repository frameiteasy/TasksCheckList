package com.fite.main;

import java.util.List;

public class TasksList {
    private List<Task> _tasksList;
    private ITasksListReader _tasksListReader;

    public TasksList(){
        _tasksListReader = new FileTasksListReader();
        _tasksList = _tasksListReader.getTasksList();
    }

    public List<Task> getTasksList() {
        return _tasksList;
    }

    public boolean isTasksListDone(){
        for (Task task : _tasksList) {
            if (!task.getTaskDone()){
                return false;
            }
        }
        return true;
    }

    public int taskToDo(){
        int count = 0;
        for (Task task : _tasksList) {
            if (!task.getTaskDone()){
                count++;
            }
        }
        return count;
    }

    private void init(){
        _tasksList.add(new Task("zadanie 1", false));
        _tasksList.add(new Task("zadanie 2", false));
        _tasksList.add(new Task("zadanie 3", false));
    }
}

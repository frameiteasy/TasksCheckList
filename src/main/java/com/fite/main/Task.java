package com.fite.main;

public class Task {

    private String _taskName;
    private boolean _taskDone;

    public Task(String name, boolean done){
        _taskName = name;
        _taskDone = done;
    }

    public String getTaskName() {
        return _taskName;
    }

    public boolean getTaskDone() {
        return _taskDone;
    }

    public void setTaskDone(boolean done) {
        _taskDone = done;
    }

}

package com.fite.main;

public interface IDataManager {

    public TasksList getTaskList();
    public void registerUIComponent(String name, Object component);
    public void updateUIComponents();
    public void closeApp();
}
